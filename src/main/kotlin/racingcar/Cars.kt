package racingcar

data class Cars(var cars: List<Car>) {
    constructor(carCount: Int) : this(ArrayList()) {
        var carList = mutableListOf<Car>()
        (1..carCount).forEach({
            carList.add(Car((0)))
        })
        cars = carList
    }

    fun run(movingCount: Int, movingStrategy: MovingStrategy) {
        cars.indices.forEach { i ->
            cars[i].run(movingCount, movingStrategy)
        }
    }
}