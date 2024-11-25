package racingcar

import racingcar.MovingDistance.winnerDistance

data class Cars(private val cars: List<Car>) {

    constructor(racingCarCount:RacingCarCount, movingStrategy: MovingStrategy) : this(
        cars = racingCarCount.createCars(movingStrategy)
    )

    fun getCars(): List<Car> {
        return cars
    }

    fun findWinner(): List<Car> {
        return cars.stream().filter { it.movingDistance() == winnerDistance(cars) }
            .toList()
    }

}
