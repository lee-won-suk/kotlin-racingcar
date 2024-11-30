package racingcar.domain

import racingcar.domain.MovingDistance.winnerDistance

data class Cars(val cars: List<Car>) {
    fun findWinner(): List<Car> {
        return cars.filter { it.movingDistance == winnerDistance(cars) }
            .toList()
    }

    constructor(
        carNames: List<String>,
        movingCount: Int,
        movingStrategy: MovingStrategy,
    ) : this(
        carNames.map { carName ->
            Car(
                carName,
                movingCount,
                movingStrategy,
            )
        },
    )

    companion object {
        fun runRacingCars(
            carNames: List<String>,
            movingCount: Int,
            movingStrategy: MovingStrategy,
        ): Cars {
            return Cars(
                carNames.map { carName ->
                    Car(
                        carName,
                        movingCount,
                        movingStrategy,
                    )
                },
            )
        }
    }
}
