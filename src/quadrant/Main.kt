package quadrant

fun main(args: Array<String>) {
    val x = readLine()?.toLong()!!
    val y = readLine()?.toLong()!!
    println(quadrant(x, y))
}

fun quadrant(x: Long, y: Long): String = when {
    x > 0 && y > 0 -> "1"
    x < 0 && y > 0 -> "2"
    x < 0 && y < 0 -> "3"
    else -> "4"
}
