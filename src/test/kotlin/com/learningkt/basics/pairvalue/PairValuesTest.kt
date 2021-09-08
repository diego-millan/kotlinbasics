package com.learningkt.basics.pairvalue

import com.learningkt.basics.pairvalues.Color
import com.learningkt.basics.pairvalues.PairValues
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class PairValuesTest {
    @Test
    fun `when try get pair value using when then return correctly each case`() {

        var coldWeather : Pair<String, Color> = PairValues().changeWeather(9)
        var hotWeather : Pair<String, Color> = PairValues().changeWeather(26)

        Assertions.assertEquals(Color.BLUE, coldWeather.second)
        Assertions.assertEquals("hot", hotWeather.first)
    }
}