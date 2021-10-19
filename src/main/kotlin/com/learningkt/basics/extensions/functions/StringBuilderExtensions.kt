package com.learningkt.basics.extensions.functions

import java.lang.StringBuilder

var StringBuilder.lastChar: Char
    get() = get(length - 1)
    set(value: Char) {
        this.setCharAt(length - 1, value)
    }
