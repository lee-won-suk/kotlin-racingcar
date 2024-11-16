package calculator

import kotlin.math.floor

enum class Calculator(val symbol: String) {
    ADD("+") {
        override fun execute(
            deFaultNumber: Int,
            plusNumber: Int,
        ): Int {
            return deFaultNumber + plusNumber
        }
    },
    SUBSTRACT("-") {
        override fun execute(
            deFaultNumber: Int,
            plusNumber: Int,
        ): Int {
            return deFaultNumber - plusNumber
        }
    },
    MULTIPLY("*") {
        override fun execute(
            deFaultNumber: Int,
            plusNumber: Int,
        ): Int {
            return deFaultNumber * plusNumber
        }
    },
    DEVIDE("/") {
        override fun execute(
            deFaultNumber: Int,
            plusNumber: Int,
        ): Int {
            return floor(deFaultNumber.toDouble() / plusNumber).toInt()
        }
    }, ;

    companion object {
        fun calculate(
            calculation: String,
            firstOperand: Int,
            secondOperand: Int,
        ): Int {
            for (calculator in entries) {
                if (calculator.symbol.equals(calculation)) {
                    return calculator.execute(firstOperand, secondOperand)
                }
            }
            throw IllegalArgumentException()
        }
    }

    abstract fun execute(
        deFaultNumber: Int,
        plusNumber: Int,
    ): Int
}
