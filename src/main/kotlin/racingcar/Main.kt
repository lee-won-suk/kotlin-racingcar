package racingcar

import racingcar.ui.InputView
import racingcar.ui.ResultView

fun main() {
    val names = InputView.insertCarNames()
    val movingCount = InputView.insertRunCount()
    val cars = Cars(RacingCarCount(names, movingCount), RandomStrategy())
    ResultView.printResult(cars.carsCount(), movingCount)
}
