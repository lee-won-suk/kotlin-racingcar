package calculator

class ExpressionCalculator(inputExpression: String?) {
    private var expression: String? = ""
    private var splitedExpression: SplitedExpression

    init {
        expression = inputExpression
        validateExpression(expression)
        deleteBlank()
        splitedExpression = SplitedExpression(expression)
    }

    private fun validateExpression(inputExpression: String?) {
        val nonPassRegex = "[^0-9+\\-*/ ]".toRegex()
        val operandRegex = "+-*/"
        if (inputExpression.isNullOrEmpty() || inputExpression.none { it in operandRegex } ||
            nonPassRegex.containsMatchIn(inputExpression)
        ) {
            throw IllegalArgumentException()
        }
    }

    private fun deleteBlank() {
        this.expression = expression!!.replace(" ", "")
    }

    fun calculateResult(): Int {
        return splitedExpression.calculateResult()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as ExpressionCalculator

        return expression == other.expression
    }

    override fun hashCode(): Int {
        return expression?.hashCode() ?: 0
    }
}
