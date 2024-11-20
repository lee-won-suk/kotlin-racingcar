package racingcar

import kotlin.random.Random

class RandomStrategy : MovingStrategy {
    override fun createNumber(): Int {
        return Random.nextInt(0, 10)
    }

}