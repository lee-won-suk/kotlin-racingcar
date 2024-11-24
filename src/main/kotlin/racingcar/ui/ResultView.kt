package racingcar.ui

object ResultView {
    //시도회수를 받고 그 회수 만큼
    fun printResult(carsCount: List<Int>, movingCount: Int) {
        val convertedCarsCount = MutableList(movingCount) { "" }
        repeat(movingCount) {
            carsCount.forEachIndexed { carIndex, carCount ->
                if (it <= carCount) {
                    val currentCount = convertedCarsCount[carIndex] + "-"
                    convertedCarsCount[carIndex] = currentCount
                }
                println(convertedCarsCount[carIndex])
            }
            println()
        }

    }
}

