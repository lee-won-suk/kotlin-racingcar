package calculator

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.CsvSource

class CalculatorTest {
    @ParameterizedTest
    @DisplayName(value = "덧셈 테스트")
    @CsvSource(value = ["1,2,3"])
    public fun sumTest(
        firstOperand: Int,
        secondOperand: Int,
        resultNumber: Int,
    ) {
        assertThat(Calculator.ADD.execute(firstOperand, secondOperand)).isEqualTo(resultNumber)
    }

    @ParameterizedTest
    @DisplayName(value = "뺄셈 테스트")
    @CsvSource(value = ["3,2,1"])
    public fun subTractTest(
        firstOperand: Int,
        secondOperand: Int,
        resultNumber: Int,
    ) {
        assertThat(Calculator.SUBSTRACT.execute(firstOperand, secondOperand)).isEqualTo(resultNumber)
    }

    @ParameterizedTest
    @DisplayName(value = "곱셈 테스트")
    @CsvSource(value = ["2,3,6"])
    public fun multiplyTest(
        firstOperand: Int,
        secondOperand: Int,
        resultNumber: Int,
    ) {
        assertThat(Calculator.MULTIPLY.execute(firstOperand, secondOperand)).isEqualTo(resultNumber)
    }

    @ParameterizedTest
    @DisplayName(value = "나눗셈 테스트")
    @CsvSource(value = ["6,3,2"])
    public fun divideTest(
        firstOperand: Int,
        secondOperand: Int,
        resultNumber: Int,
    ) {
        assertThat(Calculator.DEVIDE.execute(firstOperand, secondOperand)).isEqualTo(resultNumber)
    }

    @ParameterizedTest
    @DisplayName(value = "연산자로 구분해서 연산을 진행한다")
    @CsvSource(value = ["+,1,2,3"])
    public fun calculateTest(
        calculation: String,
        firstOperand: Int,
        secondOperand: Int,
        resultNumber: Int,
    ) {
        assertThat(Calculator.calculate(calculation, firstOperand, secondOperand)).isEqualTo(resultNumber)
    }

}
