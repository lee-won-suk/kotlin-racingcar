package racingcar

data class Cars(var cars: List<Car>) {
    constructor(carCount: Int) : this(ArrayList()) {
        validateCount(carCount)
        var carList = mutableListOf<Car>()
        (1..carCount).forEach({
            carList.add(Car((0)))
        })
        cars = carList
    }

    private fun validateCount(carCount: Int) {
        if (carCount <= 0) {
            throw IllegalArgumentException("차 수 및 이동회수는 0이하가 될 수 없습니다.")
        }
    }

    fun run(movingCount: Int, movingStrategy: MovingStrategy) {
        validateCount(movingCount)
        cars.indices.forEach { i ->
            cars[i].run(movingCount, movingStrategy)
        }
    }

    fun carsCount(): List<Int> {
        val carsCount = mutableListOf<Int>()
        cars.forEachIndexed { i, car ->
            carsCount.add(i, car.movingDistance())
        }
        println("car count = $carsCount")
        return carsCount.toList()
    }
}
