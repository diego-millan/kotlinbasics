package com.learningkt.basics.core

import com.learningkt.basics.pairvalues.Color
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test
import java.lang.StringBuilder

class GeneralCasesTest {
    @Test
    fun `when try get first value of empty array then return null`() {
        val result : String? = GeneralCases().getStringOrNull(emptyArray())

        Assertions.assertNull(result)
    }

    @Test
    fun `when try get mix of two values of when then return correctly`() {
        val result : Color = GeneralCases().mix(Color.YELLOW, Color.RED)

        Assertions.assertEquals(Color.ORANGE, result)
    }

    @Test
    fun `when check if pet is instance of another than returns as expected`() {
        val dogtalk : String = GeneralCases().talk(Dog())
        val catTalk : String = GeneralCases().talk(Cat())

        Assertions.assertEquals("woof woof!!", dogtalk)
        Assertions.assertEquals("meeown!", catTalk)

    }

    @Test
    fun `when check in expression for letter then return true when expected`() {
        Assertions.assertTrue(GeneralCases().isLetter('c'))
    }

    @Test
    fun `when check not in expression for letter then return true when expected`() {
        Assertions.assertTrue(GeneralCases().isNotLetter('*'))
    }

    fun isValidIdentifier(s: String): Boolean {
        var result : Boolean = true
        if (s.startsWith('_')) {
            return true
        }
        for (index in s.indices) {
            var actual : Char = s[index]
            if (actual !in 'a'..'z') {
                return false
            }
        }
        return s.isNotBlank()
    }

    @Test
    fun `when check if string is only alpha or starts with underscore then returns as expected`() {
        Assertions.assertTrue(isValidIdentifier("name"))   // true
        Assertions.assertTrue(isValidIdentifier("_name"))  // true
        Assertions.assertTrue(isValidIdentifier("_12"))    // true
        Assertions.assertFalse(isValidIdentifier(""))       // false
        Assertions.assertFalse(isValidIdentifier("012"))    // false
        Assertions.assertFalse(isValidIdentifier("no$"))    // false
    }

    @Test
    fun `when check regex for valid date then return true when expected`() {
        Assertions.assertTrue(GeneralCases().checkValidDate("12/12/2012"))
        Assertions.assertFalse(GeneralCases().checkValidDate("1/12/2012"))
    }

    @Test
    fun `create sublist and check let usage`() {

        val numbers : MutableList<String> = mutableListOf("one", "two", "three", "four", "five")
        GeneralCases().createSublistAndPrint(numbers)
    }

    @Test
    fun `when check method apply then it should work like builder`() {
        val dog : Dog = Dog().apply {
            name = "barto"
            sex = "male"
        }

        Assertions.assertEquals("barto", dog.name)
    }

    @Test
    fun `check run usage then it should execute object subtasks`() {
        val isSquare = Rectangle(15,15).run {
            isSquare
        }
        Assertions.assertTrue(isSquare)
    }

    @Test
    fun `check generic method with super type matches`() {
        val str : StringBuilder = StringBuilder("String without dot in the end")
        GeneralCases().ensureTrailingPeriod(str)
        Assertions.assertTrue(str.endsWith('.'))
    }

}