package calculator

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class SplitedExpressionTest {
    @Test
    fun calculateResultTest() {
        val inputExpression = "1+2*3"
        var splitedExpression = SplitedExpression(inputExpression)
        assertThat(splitedExpression.calculateResult()).isEqualTo(9)
    }
}
