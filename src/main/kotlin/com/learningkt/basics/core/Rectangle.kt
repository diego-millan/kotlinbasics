package com.learningkt.basics.core

class Rectangle (val height : Int, val width : Int) {
    val isSquare: Boolean
    get() {return height == width}

}