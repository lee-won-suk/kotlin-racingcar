package racingcar

import racingcar.domain.MovingStrategy

object AlwaysGoStrategy : MovingStrategy {
    override fun createNumber(): Int {
        return 4
    }
}
