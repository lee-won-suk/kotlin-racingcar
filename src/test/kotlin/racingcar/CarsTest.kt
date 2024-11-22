package racingcar

import org.assertj.core.api.Assertions.*
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test

class CarsTest {
    @Test
    @DisplayName(value = "차 대수 0대 입력 실패테스트.")
    fun wrongCarCountTest() {
        assertThatIllegalArgumentException().isThrownBy {
            Cars(0)
        }
    }

    @Test
    @DisplayName(value = "차 이동회수 0 실패테스트.")
    fun wrongRunCountTest() {
        assertThatIllegalArgumentException().isThrownBy {
            Cars(2).run(0,RandomStrategy())
        }
    }
}
