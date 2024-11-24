package racingcar

import org.assertj.core.api.Assertions.assertThatIllegalArgumentException
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.CsvSource
import org.junit.jupiter.params.provider.MethodSource
import org.junit.jupiter.params.provider.ValueSource
import java.util.stream.Stream

class RacingCarCountTest {
    @ParameterizedTest
    @MethodSource("testList")
    fun zeroInputValidateCountTest(carNames: List<String>) {
        assertThatIllegalArgumentException().isThrownBy {
            RacingCarCount(carNames, 0).createCars(AlwaysGoStrategy())
        }
    }

    companion object {
        @JvmStatic
        fun testList(): Stream<List<String>> {
            return Stream.of(
                listOf("red","blue"),
                emptyList()
            )
        }
    }

}
