package racingcar

data class Car(private val carName : String, private val movingDistance: Int) {
    fun movingDistance(): Int {
        return movingDistance
    }

    fun carName(): String {
        return carName
    }
}
