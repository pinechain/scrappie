package com.pinechain.core.utils

class StringUtils private constructor() {
    companion object {
        fun <T> parseList(list: List<T>, separator: String): String {
            var output = ""
            for (item in list) {
                output += String.format("%s%s", item.toString(), separator)
            }

            return if (!output.trim().isEmpty()) {
                output.substring(0, output.length - separator.length)
            } else {
                output
            }
        }
    }
}