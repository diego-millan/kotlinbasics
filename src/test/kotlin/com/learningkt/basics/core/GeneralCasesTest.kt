package com.learningkt.basics.core

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class GeneralCasesTest {
    @Test
    fun `when try get first value of empty array then return null`() {
        var result : String? = GeneralCases().getStringOrNull(emptyArray())
        Assertions.assertNull(result)
    }
}