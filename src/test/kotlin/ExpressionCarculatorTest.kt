import org.assertj.core.api.Assertions.assertThatIllegalArgumentException
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.NullAndEmptySource

class ExpressionCarculatorTest {
    @ParameterizedTest
    @DisplayName(value = "null, 공백 테스트")
    @NullAndEmptySource()
    public fun blankDeleteTest(inputExpression: String?) {
        assertThatIllegalArgumentException().isThrownBy {
            ExpressionCalculator(inputExpression)
        }
    }

    @Test
    @DisplayName(value = "사칙연산 미존재시 Illegal에러 호출해야 한다.")
    public fun nonExpressionTest() {
        val inputExpression = "1 2 3"
        assertThatIllegalArgumentException().isThrownBy {
            ExpressionCalculator(inputExpression)
        }
    }

    @Test
    @DisplayName(value = "공백제거 테스트")
    public fun blankDeleteTest() {
        val inputExpression = "1 + 2"
        val expressionCalculator = ExpressionCalculator(inputExpression)
    }
}
