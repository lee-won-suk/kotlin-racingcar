package racingcar

data class CarNamesAndRunCount(val carNames: List<String>, val movingCount: Int) {

    init {
        validateCount(carNames, movingCount)
    }

    private fun validateCount(carNames: List<String>, movingCount: Int) {
        require(carNames.all { it.length >= 1 && it.length <= 5 }) { "자동차 이름은 1~5자리입니다." }
        require(movingCount > 0) { "이동횟수는 0이하가 될 수 없습니다." }
    }

}

