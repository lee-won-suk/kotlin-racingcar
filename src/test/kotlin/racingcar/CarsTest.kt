package racingcar

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class CarsTest {

    @Test
    fun carCountTest()  {
        val names = "red,blue"
        val cars = Cars(RacingCarCount(names.split(","),1),AlwaysGoStrategy())
        val testCarList = listOf(Car("red",1),Car("blue",1))
        val testCars = Cars(testCarList)
        assertThat(cars).isEqualTo(testCars)

    }
}
