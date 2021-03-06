package com.renanparis.desafioandroid.extensions

import com.renanparis.desafioandroid.constants.Constants

fun Int.formatToStringWithPoint(): String {
    var word = this.toString()
    while (word.length < 3) {
       word =  StringBuilder().append("0").append(word).toString()
    }
    val wordFirst = word.subSequence(0, word.length - 2)
    val wordEnd = word.subSequence(word.length - 2, word.length)
    return StringBuilder()
            .append("$")
            .append(wordFirst)
            .append(".")
            .append(wordEnd).toString()
}

fun Int.formatToStockText(): String {
    return when {
        this == 1 -> {
            Constants.STOCK_ONE_LEFT
        }
        this < 1 -> {
            Constants.MISSING_STOCK
        }
        else -> {
            Constants.IN_STOCK
        }
    }
}



