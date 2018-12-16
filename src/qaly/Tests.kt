package qaly

import kotlin.test.assertEquals

fun main(args: Array<String>) {
    assertEquals(
        "41.470",
        findQalyScore(listOf("1.0" to "12.0", "0.7" to "5.2", "0.9" to "10.7", "0.5" to "20.4", "0.2" to "30.0"))
    )
}
