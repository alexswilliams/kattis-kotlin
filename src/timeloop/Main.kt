package timeloop

fun main(args: Array<String>) {
    val num = readLine()?.toInt()!!
    print(chant(num))
}

fun chant(num: Int): String = (1..num).joinToString("\n") { "$it Abracadabra" }
