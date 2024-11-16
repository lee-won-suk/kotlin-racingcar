package calculator

class ExpressionCalculator(inputExpression: String?) {
    private var inputExpression: String? = ""
    private lateinit var splitedExpression: SplitedExpression

    init {
        validateExpression(inputExpression)
        deleteBlank(inputExpression)
        SplitedExpression(inputExpression)
    }

    private fun splitNumbersAndOperators(inputExpression: String?) {
    }

    private fun validateExpression(inputExpression: String?) {
        if (inputExpression.isNullOrEmpty() || inputExpression.none { it in "+-*/" }) {
            throw IllegalArgumentException()
        }
    }

    private fun deleteBlank(inputExpression: String?) {
        this.inputExpression = inputExpression!!.trim()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as ExpressionCalculator

        return inputExpression == other.inputExpression
    }

    override fun hashCode(): Int {
        return inputExpression?.hashCode() ?: 0
    }
/*
    fun calculate(): Int {

    }*/
}
