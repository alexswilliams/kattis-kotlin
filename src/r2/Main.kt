package r2

fun main(args: Array<String>) {
    val (r1, s1) = readLine()!!.split(' ', limit = 2).map(String::toInt)
    println(findR2(r1, s1))
}

fun findR2(r1: Int, s1: Int) = 2 * s1 - r1
