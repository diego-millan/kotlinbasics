package com.learningkt.basics.extensions.functions

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class FunctionExtensionsTest {

    @Test
    fun `when try mutable list swap by function extensions than it must work`() {
        val list = mutableListOf(1, 2, 3)
        list.swap(0, 2)
        Assertions.assertEquals(3, list[0])
    }
}

//https://kotlinlang.org/docs/extensions.html#extensions-are-resolved-statically