package quadrant

import kotlin.test.assertEquals

fun main(args: Array<String>) {
    assertEquals("1", quadrant(1, 1))
    assertEquals("1", quadrant(1, 1000))
    assertEquals("1", quadrant(1000, 1))
    assertEquals("2", quadrant(-1, 1))
    assertEquals("2", quadrant(-1, 1000))
    assertEquals("2", quadrant(-1000, 1))
    assertEquals("3", quadrant(-1, -1))
    assertEquals("3", quadrant(-1, -1000))
    assertEquals("3", quadrant(-1000, -1))
    assertEquals("4", quadrant(1, -1))
    assertEquals("4", quadrant(1, -1000))
    assertEquals("4", quadrant(1000, -1))
}
