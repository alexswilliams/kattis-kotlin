package faktor

fun main(args: Array<String>) {
    val (articles, factor) = readLine()!!.split(' ', limit = 2).map(String::toInt)
    println(requiredBribes(articles, factor))
}

fun requiredBribes(articles: Int, factor: Int) = articles * (factor - 1) + 1
