package racingcar.domain

import kotlin.random.Random

object RandomStrategy : MovingStrategy {
    override fun createNumber(): Int {
        return Random.nextInt(0, 10)
    }
}
