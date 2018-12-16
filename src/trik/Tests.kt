package trik

import kotlin.test.assertEquals

fun main(args: Array<String>) {
    assertEquals(3, findCup("AB", 1))
    assertEquals(1, findCup("CBABCACCC", 1))
}
