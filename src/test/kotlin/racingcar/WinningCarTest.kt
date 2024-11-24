package racingcar

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class WinningCarTest {
    @Test
    fun createWinningCarTest()  {
        val testCarList = listOf(Car("red",2),Car("blue",2),
            Car("kaki",1))
        val winningList = listOf(Car("red",2),Car("blue",2))
        assertThat(WinningCar.create(testCarList)).isEqualTo(WinningCar(winningList))

    }
}
