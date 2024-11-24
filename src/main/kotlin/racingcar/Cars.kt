package racingcar

data class Cars(private val cars: List<Car>) {

    constructor(racingCarCount:RacingCarCount, movingStrategy: MovingStrategy) : this(
        cars = racingCarCount.createCars(movingStrategy)
    )

    fun getCars(): List<Car> {
        return cars
    }


}
