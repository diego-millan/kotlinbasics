package com.learningkt.basics.core

import com.learningkt.basics.pairvalues.Color
import java.lang.Exception

class GeneralCases {
    fun getStringOrNull(arr : Array<String>) : String? {
        return arr.getOrNull(0)
    }

    fun mix(c1 : Color, c2: Color) : Color {
        var color = when (setOf<Color>(c1, c2)) {
            setOf(Color.RED, Color.YELLOW) -> Color.ORANGE
            setOf(Color.BLUE, Color.YELLOW) -> Color.GREEN
            setOf(Color.BLUE, Color.VIOLET) -> Color.INDIGO
            else -> throw Exception("bad color mix")
        }
        return color
    }

    fun talk(pet: Pet) : String {
        var result : String = when (pet) {
            is Dog -> Dog().woof()
            is Cat -> Cat().meow()
            else -> ""
        }
        return result
    }

    fun printList(list : MutableList<Int>) {
        for (element in list) println(element)
    }

    fun iterateOverMap() {
        val map : Map<Int, String> = mapOf<Int, String>(
            1 to "one",
            2 to "two",
            3 to "three")

        for ((key, value) in map) {
            println("$key = $value")
        }
    }

    fun iterateOverList() {
        val list : List<String> = listOf("a", "b", "c")
        for ((index, element) in list.withIndex()) {
            println("$index: $element")
        }
    }

    fun iterateOverNumbers() {
        for (i in 0 until 9) println(i)
    }

    fun isLetter(letter : Char) = letter in 'a'..'z'

    fun isNotLetter(letter: Char) = letter !in 'a'..'z'
}