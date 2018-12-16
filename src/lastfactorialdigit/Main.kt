package lastfactorialdigit

fun main(args: Array<String>) {
    val lines = readLine()!!.toInt()
    (1..lines).map { readLine()!!.toInt() }.forEach {
        println(lastDigitOfFactorialOf(it))
    }
}

fun lastDigitOfFactorialOf(num: Int) = factorial(num).toString().last()

fun factorial(num: Int): Int = if (num == 1) 1 else factorial(num - 1) * num
