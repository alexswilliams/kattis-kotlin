package autori

import kotlin.test.assertEquals

fun main(args: Array<String>) {
    assertEquals("KMP", longNamesToShort("Knuth-Morris-Pratt"))
    assertEquals("MS", longNamesToShort("Mirko-Slavko"))
    assertEquals("PP", longNamesToShort("Pasko-Patak"))
}
