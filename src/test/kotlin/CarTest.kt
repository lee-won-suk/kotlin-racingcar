import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test
import racingcar.Car


class CarTest {

    @Test
    @DisplayName(value = "4이상이면 전진한다.")
    fun moveLogicTest()  {
        var car = Car(0)
        var testCar = Car(1)
        val tryCount = 1
        car.run(tryCount, AlwaysGoStrategy())
        assertThat(car).isEqualTo(testCar)
    }
}