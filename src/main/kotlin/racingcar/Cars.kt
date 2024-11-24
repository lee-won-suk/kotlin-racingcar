package racingcar

data class Cars(private val cars: List<Car>) {

    constructor(racingCarCount:RacingCarCount, movingStrategy: MovingStrategy) : this(
        cars = racingCarCount.createCars(movingStrategy)
    )

    fun carsCount(): List<Int> {
        return List(cars.size) { cars[it].movingDistance() }
    }
}
