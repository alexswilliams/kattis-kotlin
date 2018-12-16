package carrots

import kotlin.test.assertEquals

fun main(args: Array<String>) {
    assertEquals("1", getSecondNumber("2 1"))
    assertEquals("5", getSecondNumber("1 5"))
}
