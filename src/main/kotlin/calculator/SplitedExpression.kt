package calculator

private const val FIRST_INDEX = 0
private const val SECOND_NUMBER_INDEX = 1

class SplitedExpression(inputExpression: String?) {
    val numbers: MutableList<String> = mutableListOf()

    init {
        inputExpression?.forEach { char ->
            numbers.add(char.toString())
        }
    }

    fun calculateResult(): Int {
        var calculateResult = numbers.removeAt(FIRST_INDEX).toInt()
        numbers.chunked(2).forEach { pair ->
            val carculation = pair[FIRST_INDEX]
            val secondNumber = pair[SECOND_NUMBER_INDEX]
            calculateResult = Calculator.calculate(carculation, calculateResult, secondNumber.toInt())
        }
        return calculateResult
    }
}
