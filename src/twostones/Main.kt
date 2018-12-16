package twostones

fun main(args: Array<String>) {
    val numStones = readLine()?.toLong()!!
    println(winner(numStones))
}

fun winner(num: Long): String = if (num % 2 == 0L) "Bob" else "Alice"
