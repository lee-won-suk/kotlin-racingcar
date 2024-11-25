package racingcar

import org.assertj.core.api.Assertions.assertThatIllegalArgumentException
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.MethodSource
import java.util.stream.Stream

class CarNamesAndRunCountTest {
    @ParameterizedTest
    @MethodSource("testList")
    fun zeroInputValidateCountTest(carNames: List<String>) {
        assertThatIllegalArgumentException().isThrownBy {
            CarNamesAndRunCount(carNames, 0)
        }
    }

    companion object {
        @JvmStatic
        fun testList(): Stream<List<String>> {
            return Stream.of(
                listOf("red", "blue"),
                emptyList()
            )
        }
    }

}
