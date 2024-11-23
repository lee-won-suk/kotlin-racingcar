package racingcar.ui

class ResultView {

    companion object {

        //시도회수를 받고 그 회수 만큼
        fun printResult(carsCount: List<Int>, movingCount: Int) {
            val convertedCarsCount = MutableList(movingCount) { "" }
            for (runIndex in 1..movingCount) {
                carsCount.forEachIndexed { carIndex, carCount ->
                    if (runIndex <= carCount) {
                        val currentCount = convertedCarsCount[carIndex] + "-"
                        convertedCarsCount[carIndex] = currentCount
                    }
                    println(convertedCarsCount[carIndex])
                }
                println()
            }
        }
    }
}
