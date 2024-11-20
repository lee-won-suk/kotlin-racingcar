package racingcar

data class Car(var movingDistance : Int) {

    fun run(tryCount: Int, movingStrategy: MovingStrategy) {
        (1 ..tryCount).forEach { i ->
            movingDistance += moveDecision(movingStrategy.createNumber())
        }
    }

    fun moveDecision(movingNumber: Int): Int {
        if (movingNumber >= 4) {
            return 1
        }
        return 0
    }


}
