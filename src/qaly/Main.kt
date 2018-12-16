package qaly

import java.math.BigDecimal

fun main(args: Array<String>) {
    val lines = readLine()!!.toInt()
    val pairs = (1..lines).map { readLine()!!.split(' ') }.map { it[0] to it[1] }
    println(findQalyScore(pairs))
}

fun findQalyScore(pairs: List<Pair<String, String>>) =
    pairs
        .map { BigDecimal(it.first) * BigDecimal(it.second) }
        .fold(BigDecimal.ZERO!!) { acc, next -> acc + next }
        .setScale(3)
        .toString()
