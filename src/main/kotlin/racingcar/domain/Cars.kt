package racingcar.domain

import racingcar.domain.MovingDistance.winnerDistance

data class Cars(val cars: List<Car>) {
    fun findWinner(): List<Car> {
        return cars.filter { it.movingDistance() == winnerDistance(cars) }
            .toList()
    }

    companion object {
        fun runRacingCars(
            carNamesAndRunCount: CarNamesAndRunCount,
            numberCreator: NumberCreator,
        ): Cars {
            return Cars(
                carNamesAndRunCount.carNames.map { carName ->
                    Car(
                        carName,
                        MovingDistance.startRacing(carNamesAndRunCount.movingCount, numberCreator),
                    )
                },
            )
        }
    }
}
