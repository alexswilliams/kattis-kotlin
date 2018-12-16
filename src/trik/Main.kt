package trik

fun main(args: Array<String>) {
    val moves = readLine()!!
    println(findCup(moves, 1))
}

tailrec fun findCup(moveList: String, position: Int): Int =
    if (moveList.isEmpty())
        position
    else
        findCup(moveList.drop(1), mapping[position to moveList.first()] ?: position)

val mapping = mapOf(
    (1 to 'A') to 2, (2 to 'A') to 1,
    (2 to 'B') to 3, (3 to 'B') to 2,
    (1 to 'C') to 3, (3 to 'C') to 1
)
