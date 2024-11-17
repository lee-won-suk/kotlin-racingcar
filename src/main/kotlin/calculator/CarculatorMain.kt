package calculator

fun main() {
    RefactoringCalculator.ADD.execute(1,2)
    println("문자열을 입력해주세요")
    val expression = readln()
    var expressionCalculator = ExpressionCalculator(expression)
    println("계산결과는 ${expressionCalculator.calculateResult()}")
}
