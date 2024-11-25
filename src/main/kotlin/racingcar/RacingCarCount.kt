package racingcar

data class RacingCarCount(private val carNames: List<String>, private val movingCount: Int) {

    fun createCars(movingStrategy: MovingStrategy): List<Car> {
        validateCount(carNames, movingCount)
        return List(carNames.size) { Car(carNames[it], MovingDistance.startRacing(movingCount, movingStrategy)) }
    }

    private fun validateCount(carNames: List<String>, movingCount: Int) {
        require(carNames.stream().anyMatch { it.length in 1..5 }) { "자동차 이름은 1~5자리입니다." }
        require(movingCount > 0) { "이동횟수는 0이하가 될 수 없습니다." }
    }

}

