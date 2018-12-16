package autori

fun main(args: Array<String>) {
    val names = readLine()!!
    println(longNamesToShort(names))
}

fun longNamesToShort(names: String) = names.split('-').joinToString("") { it.first().toString() }
