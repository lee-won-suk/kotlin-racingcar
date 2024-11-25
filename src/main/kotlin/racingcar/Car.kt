package racingcar

data class Car(val carName: String, private val movingDistance: Int) {
    fun movingDistance(): Int {
        return movingDistance
    }
}
