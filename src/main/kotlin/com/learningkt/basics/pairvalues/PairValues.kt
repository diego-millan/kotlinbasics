package com.learningkt.basics.pairvalues

class PairValues {
    fun changeWeather(degrees: Int): Pair<String, Color> {
        val (description, color) = when {
            degrees < 10 -> Pair("cold", Color.BLUE)
            degrees < 20 -> Pair("mild", Color.ORANGE)
            else -> Pair("hot", Color.RED)
        }

        return Pair(description, color)
    }
}