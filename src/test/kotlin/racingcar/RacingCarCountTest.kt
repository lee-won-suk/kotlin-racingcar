package racingcar

import org.assertj.core.api.Assertions.assertThatIllegalArgumentException
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.CsvSource

class RacingCarCountTest {
    @ParameterizedTest
    @CsvSource(value = ["0,1", "1,0"])
    fun zeroInputValidateCountTest(carCount: Int, movingCount: Int) {
        assertThatIllegalArgumentException().isThrownBy {
            RacingCarCount(carCount, movingCount).createCars(AlwaysGoStrategy())
        }
    }


}
