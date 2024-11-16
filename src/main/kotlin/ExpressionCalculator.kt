class ExpressionCalculator(inputExpression: String?) {
    init {
        validateExpression(inputExpression)
    }

    private fun validateExpression(inputExpression: String?) {
        if (inputExpression.isNullOrEmpty() || inputExpression.none { it in "+-*/" }) {
            throw IllegalArgumentException()
        }
    }

    private fun deleteBlank(inputExpression: String) {
        TODO("Not yet implemented")
    }
}
