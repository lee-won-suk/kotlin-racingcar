package racingcar

import racingcar.ui.InputView
import racingcar.ui.ResultView

fun main() {
    val names = InputView.insertCarNames()
    val movingCount = InputView.insertRunCount()
    val cars = Cars.runRacingCars(CarNamesAndRunCount(names, movingCount), RandomStrategy)
    ResultView.printResult(cars.cars, movingCount)
    ResultView.printWinner(cars.findWinner())

}
