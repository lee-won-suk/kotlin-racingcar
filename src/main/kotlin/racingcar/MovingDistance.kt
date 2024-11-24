package racingcar


object MovingDistance {
     const val MIN_RUN_NUMBER = 4
     const val GO = 1
     const val STOP = 0

    fun startRacing(tryCount: Int, movingStrategy: MovingStrategy): Int {
        var movingDistance =0
        repeat(tryCount) {
            movingDistance += moveDecision(movingStrategy.createNumber())
        }
        return movingDistance
    }

    fun moveDecision(movingNumber: Int): Int {
        if (movingNumber >= MIN_RUN_NUMBER) {
            return GO
        }
        return STOP
    }


}
