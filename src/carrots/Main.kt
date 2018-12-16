package carrots

fun main(args: Array<String>) {
    print(getSecondNumber(readLine()!!))
}

fun getSecondNumber(line: String) = line.split(' ', limit = 2)[1]
