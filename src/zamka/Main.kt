package zamka

fun main(args: Array<String>) {
    val l = readLine()?.toInt()!!
    val d = readLine()?.toInt()!!
    val x = readLine()?.toInt()!!
    println(findN(l, d, x))
    println(findM(l, d, x))
}


fun findN(l: Int, d: Int, x: Int) = (l..d).first { sumOfDigits(it) == x }
fun findM(l: Int, d: Int, x: Int) = (d downTo l).first { sumOfDigits(it) == x }
fun sumOfDigits(num: Int): Int = num.toString().sumBy { it - '0' }
