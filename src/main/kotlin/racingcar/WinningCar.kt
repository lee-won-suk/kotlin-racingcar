package racingcar

import racingcar.MovingDistance.winnerDistance

data class WinningCar(
    private val winningCarList: List<Car>
) {

    companion object {
        fun create(cars: List<Car>): WinningCar {
            return WinningCar(winningCarList = findWinner(cars))
        }

        private fun findWinner(cars: List<Car>): List<Car> {
            return cars.stream().filter { it.movingDistance() == winnerDistance(cars) }
                .toList()
        }

    }
}
