package com.learningkt.basics.extensions.functions

import java.awt.Point

operator fun Point.plus(other: Point) : Point {
    return Point(x + other.x, y + other.y)
}