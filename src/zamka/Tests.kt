package zamka

import kotlin.test.assertEquals

fun main(args: Array<String>) {
    assertEquals(1, sumOfDigits(1))
    assertEquals(4, sumOfDigits(4))
    assertEquals(4, sumOfDigits(40))
    assertEquals(4, sumOfDigits(400))
    assertEquals(13, sumOfDigits(139))
    assertEquals(36, sumOfDigits(9999))
    assertEquals(1, sumOfDigits(10_000))

    assertEquals(4, findN(1, 100, 4))
    assertEquals(129, findN(100, 500, 12))
    assertEquals(1, findN(1, 10_000, 1))

    assertEquals(40, findM(1, 100, 4))
    assertEquals(480, findM(100, 500, 12))
    assertEquals(10_000, findM(1, 10_000, 1))
}
