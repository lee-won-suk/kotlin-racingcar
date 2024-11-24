package racingcar

data class RacingCarCount(private val carCount: Int, private val movingCount: Int) {
    fun createCars(movingStrategy: MovingStrategy): List<Car> {
        validateCount(carCount, movingCount)
        return List(carCount) { Car(MovingDistance.startRacing(movingCount, movingStrategy)) }
    }

    private fun validateCount(carCount: Int, movingCount: Int) {
        require(carCount > 0) { "차 대수는 0이하가 될 수 없습니다." }
        require(movingCount > 0) { "이동횟수는 0이하가 될 수 없습니다." }
    }
}
