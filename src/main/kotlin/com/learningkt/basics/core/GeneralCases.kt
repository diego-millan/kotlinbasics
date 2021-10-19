package com.learningkt.basics.core

import com.learningkt.basics.pairvalues.Color
import java.lang.Appendable
import java.lang.Exception
import java.lang.NumberFormatException
import java.lang.StringBuilder
import kotlin.random.Random

class GeneralCases {
    fun getStringOrNull(arr: Array<String>): String? {
        return arr.getOrNull(0)
    }

    fun mix(c1: Color, c2: Color): Color {
        var color = when (setOf<Color>(c1, c2)) {
            setOf(Color.RED, Color.YELLOW) -> Color.ORANGE
            setOf(Color.BLUE, Color.YELLOW) -> Color.GREEN
            setOf(Color.BLUE, Color.VIOLET) -> Color.INDIGO
            else -> throw Exception("bad color mix")
        }
        return color
    }

    fun talk(pet: Pet): String {
        val result: String = when (pet) {
            is Dog -> Dog().woof()
            is Cat -> Cat().meow()
            else -> ""
        }
        return result
    }

    fun printList(list: MutableList<Int>) {
        for (element in list) println(element)
    }

    fun iterateOverMap() {
        val map: Map<Int, String> = mapOf<Int, String>(
            1 to "one",
            2 to "two",
            3 to "three"
        )

        for ((key, value) in map) {
            println("$key = $value")
        }
    }

    fun iterateOverList() {
        val list: List<String> = listOf("a", "b", "c")
        for ((index, element) in list.withIndex()) {
            println("$index: $element")
        }
    }

    fun iterateOverNumbers() {
        for (i in 0 until 9) println(i)
    }

    fun isLetter(letter: Char) = letter in 'a'..'z'

    fun isNotLetter(letter: Char) = letter !in 'a'..'z'

    fun parseNumber(number: String): Int {
        var result: Int = try {
            Integer.parseInt(number)
        } catch (e: NumberFormatException) {
            return -1
        }
        return result
    }

    fun checkValidDate(s: String): Boolean {
        val regex = """\d{2}/\d{2}/\d{4}""".toRegex()
        return regex.matches(s)
    }

    fun checkNullable(s: String?): String {
        return s ?: ""
    }

    fun createSublistAndPrint(list: MutableList<String>) {
        list.map { it.length }.filter { it > 3 }.let {
            println(it)
        }
    }

    fun getRandomInt(): Int {
        return Random.nextInt(100).also {
            println("getRandomInt() generated value $it")
        }
    }

    fun getFirstAndLastIndex(list: MutableList<Int>): Pair<Int, Int> {
        var response: Pair<Int, Int>
        with(list) {
            val first = first()
            val last = last()
            response = Pair(first, last)
        }

        return response
    }

    fun <T> ensureTrailingPeriod(seq: T) where T : CharSequence, T : Appendable {
        if (!seq.endsWith('.')) {
            seq.append('.')
        }
    }

    fun equals2(v1: Pet?, v2: Pet?): Boolean = v1 === v2 || v1?.equals(v2) ?: (false)

    fun printAlphabet(): StringBuilder {
        val sb = StringBuilder()
        with(sb) {
            appendLine("Alphabet")
            for (c in 'a'..'z') {
                append(c)
            }
            toString()
        }
        return sb
    }

    fun chaosGenerator(
        field: String,
        defaultValue: String = ""
    ) {
        println ("Default Value = $defaultValue")
    }
}
