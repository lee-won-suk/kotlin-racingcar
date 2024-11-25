package racingcar

import racingcar.MovingDistance.winnerDistance

data class Cars(val cars: List<Car>) {

    fun findWinner(): List<Car> {
        return cars.filter { it.movingDistance() == winnerDistance(cars) }
            .toList()
    }

    companion object {
        fun runRacingCars(carNamesAndRunCount: CarNamesAndRunCount, movingStrategy: MovingStrategy): Cars {
            return Cars(
                carNamesAndRunCount.carNames.map { carName ->
                    Car(
                        carName,
                        MovingDistance.startRacing(carNamesAndRunCount.movingCount, movingStrategy)
                    )
                }
            )
        }
    }

}
