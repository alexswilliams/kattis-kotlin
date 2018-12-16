package twostones

import kotlin.test.assertEquals

fun main(args: Array<String>) {
    assertEquals("Alice", winner(1))
    assertEquals("Bob", winner(2))
    assertEquals("Alice", winner(5))
    assertEquals("Bob", winner(10_000_000))
    assertEquals("Alice", winner(9_999_999))
}
