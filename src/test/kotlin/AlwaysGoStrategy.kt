import racingcar.MovingStrategy

class AlwaysGoStrategy : MovingStrategy {
    override fun createNumber(): Int {
        return 4
    }
}
