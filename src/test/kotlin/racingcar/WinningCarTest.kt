package racingcar

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class WinningCarTest {
    @Test
    fun createWinningCarTest()  {
        val testCarList = listOf(Car("red",2),Car("blue",2),
            Car("kaki",1))
        val winningList = listOf(Car("red",2),Car("blue",2))
        val cars = Cars(testCarList)
        assertThat(cars.findWinner()).isEqualTo(winningList)
    }
}
