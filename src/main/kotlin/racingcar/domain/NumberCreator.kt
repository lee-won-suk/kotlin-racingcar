package racingcar.domain

data class NumberCreator(private var movingStrategy: MovingStrategy) {
    fun createNumber(): Int {
        return movingStrategy.createNumber()
    }

    fun changeCreateStrategy(movingStrategy: MovingStrategy) {
        this.movingStrategy = movingStrategy
    }
}
