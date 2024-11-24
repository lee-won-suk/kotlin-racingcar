package racingcar

data class RacingCarCount(private val carNames: List<String>, private val movingCount: Int) {

    fun createCars(movingStrategy: MovingStrategy): List<Car> {
        validateCount(carNames, movingCount)
        return List(carNames.size) { Car(carNames[it], MovingDistance.startRacing(movingCount, movingStrategy)) }
    }

    private fun validateCount(carNames: List<String>, movingCount: Int) {
        require(carNames.isNotEmpty()) { "차 대수는 0이하가 될 수 없습니다." }
        require(movingCount > 0) { "이동횟수는 0이하가 될 수 없습니다." }
        repeat(carNames.size) {
            require(carNames[it].length <= 5) { "자동차 이름은 5보다 작아야 합니다." }
            require(carNames[it].isNotBlank()) { "자동차 이름이 잘못 입력되었습니다." }
        }

    }
}
