package racingcar

import racingcar.ui.InputView
import racingcar.ui.ResultView

fun main() {
    val number = InputView.insertCarCount()
    val movingCount = InputView.insertRunCount()
    val cars = Cars(RacingCarCount(number, movingCount), RandomStrategy())
    ResultView.printResult(cars.carsCount(), movingCount)
}
