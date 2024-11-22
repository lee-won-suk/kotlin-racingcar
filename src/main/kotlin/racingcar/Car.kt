package racingcar

private const val MIN_RUN_NUMBER = 4

private const val GO = 1

private const val STOP = 0

data class Car(var movingDistance: Int) {

    fun run(tryCount: Int, movingStrategy: MovingStrategy) {
        (1..tryCount).forEach {
            movingDistance += moveDecision(movingStrategy.createNumber())
        }
    }

    private fun moveDecision(movingNumber: Int): Int {
        if (movingNumber >= MIN_RUN_NUMBER) {
            return GO
        }
        return STOP
    }

    fun movingDistance(): Int {
        return movingDistance
    }


}
