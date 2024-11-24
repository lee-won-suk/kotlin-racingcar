package racingcar.ui

import racingcar.Car

object ResultView {
    //시도회수를 받고 그 회수 만큼
    fun printResult(cars: List<Car>, movingCount: Int) {
        val convertedCarsCount = MutableList(movingCount) { "" }
        repeat(movingCount) {
            cars.forEachIndexed { carIndex, car ->
                if (car.movingDistance() > it) {
                    convertedCarsCount[carIndex] += "-"
                }
                println("${car.carName()} : ${convertedCarsCount[carIndex]}")
            }
            println()
        }

    }
}

