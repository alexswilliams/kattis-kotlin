package faktor

import kotlin.test.assertEquals

fun main(args: Array<String>) {
    assertEquals(875, requiredBribes(38, 24))
    assertEquals(100, requiredBribes(1, 100))
    assertEquals(91, requiredBribes(10, 10))
}
