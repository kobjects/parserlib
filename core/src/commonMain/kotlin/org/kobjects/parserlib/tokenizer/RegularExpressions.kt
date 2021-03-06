package org.kobjects.parserlib.tokenizer

/**
 * A set of regular expressions that might be useful for parsing.
 */
object RegularExpressions {
    /** At least one whitespace character */
    val WHITESPACE = Regex("\\s+")

    /** At least one letter, '_' or $, followed by any number of the same or digits. */
    val IDENTIFIER = Regex("[\\p{Alpha}_$][\\p{Alpha}_$\\d]*")

    val NUMBER = Regex("(\\d+(\\.\\d*)?|\\.\\d+)([eE][+-]?\\d+)?")
    val DOUBLE_QUOTED_STRING = Regex("\"([^\"\\\\]*(\\\\.[^\"\\\\]*)*)\"")
    val SINGLE_QUOTED_STRING = Regex("'([^'\\\\]*(\\\\.[^'\\\\]*)*)'")
    val SYMBOL = Regex("\\+|-|\\*|%|<=|>=|==|=|<|>|\\^|!")
}