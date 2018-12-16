package lastfactorialdigit

import kotlin.test.assertEquals

fun main(args: Array<String>) {
    assertEquals('1', lastDigitOfFactorialOf(1))
    assertEquals('2', lastDigitOfFactorialOf(2))
    assertEquals('6', lastDigitOfFactorialOf(3))

    assertEquals('0', lastDigitOfFactorialOf(5))
    assertEquals('2', lastDigitOfFactorialOf(2))
}
