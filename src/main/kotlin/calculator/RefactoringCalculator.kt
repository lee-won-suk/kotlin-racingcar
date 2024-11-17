package calculator

enum class RefactoringCalculator(val symbol: String, val execute: (Int, Int) -> Int) {
    ADD("+", { number1, number2 -> number1 + number2 });

    companion object {
        fun calculate(
            symbol: String,
            firstOperand: Int,
            secondOperand: Int,
        ): Int {
            for (calculator in Calculator.entries) {
                if (calculator.symbol.equals(symbol)) {
                    return calculator.execute(firstOperand, secondOperand)
                }
            }
            throw IllegalArgumentException()
        }
    }


}
