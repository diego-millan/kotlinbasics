package com.learningkt.basics.core

import com.learningkt.basics.pairvalues.Color
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

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
}