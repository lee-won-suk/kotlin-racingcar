package racingcar

fun main() {
    println("자동차 대수는 몇 대인가요?")
    val number = readLine()?.toInt() ?: 0
    val cars = Cars(number)
    val startegy = RandomStrategy()
    println("시도할 횟수는 몇 회인가요?")
    val movingCount = readLine()?.toInt() ?: 0
    
    cars.run(movingCount, startegy)
    println(cars)
}