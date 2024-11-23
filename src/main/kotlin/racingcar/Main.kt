package racingcar

import racingcar.ui.InputView
import racingcar.ui.ResultView

fun main() {

    val number = InputView.insertCarCount()
    val cars = Cars(number)
    val movingCount = InputView.insertRunCount()
    cars.run(movingCount, RandomStrategy())
    ResultView.printResult(cars.carsCount(), movingCount)
}
