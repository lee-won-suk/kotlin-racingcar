package racingcar

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class CarsTest {

    @Test
    fun carCountTest() {
        val names = "red,blue"
        val cars = Cars.runRacingCars(CarNamesAndRunCount(names.split(","), 1), AlwaysGoStrategy())
        val testCarList = listOf(Car("red", 1), Car("blue", 1))
        val testCars = Cars(testCarList)
        assertThat(cars).isEqualTo(testCars)
    }

    @Test
    fun createWinningCarListTest() {
        val testCarList = listOf(
            Car("red", 2), Car("blue", 2),
            Car("kaki", 1)
        )
        val winningList = listOf(Car("red", 2), Car("blue", 2))
        val cars = Cars(testCarList)
        assertThat(cars.findWinner()).isEqualTo(winningList)
    }
}
