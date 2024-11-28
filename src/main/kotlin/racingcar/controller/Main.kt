package racingcar.controller

import racingcar.domain.CarNamesAndRunCount
import racingcar.domain.Cars
import racingcar.domain.NumberCreator
import racingcar.domain.RandomStrategy
import racingcar.view.InputView
import racingcar.view.ResultView

fun main() {
    val names = InputView.insertCarNames()
    val movingCount = InputView.insertRunCount()
    val cars = Cars.runRacingCars(CarNamesAndRunCount(names, movingCount), NumberCreator(RandomStrategy))
    ResultView.printResult(cars.cars, movingCount)
    ResultView.printWinner(cars.findWinner())

}
