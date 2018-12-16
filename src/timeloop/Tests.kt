package timeloop

import kotlin.test.assertEquals

fun main(args: Array<String>) {
    assertEquals(
        """1 Abracadabra
2 Abracadabra
3 Abracadabra
4 Abracadabra
5 Abracadabra""",
        chant(5)
    )
    assertEquals(
        """1 Abracadabra
2 Abracadabra
3 Abracadabra
4 Abracadabra
5 Abracadabra
6 Abracadabra
7 Abracadabra
8 Abracadabra
9 Abracadabra
10 Abracadabra""",
        chant(10)
    )
}
