package com.o.surovtsev.utils

fun org.slf4j.Logger.error(function: () -> String) {
    if (isErrorEnabled) this.error(function.invoke())
}

fun org.slf4j.Logger.debug(function: () -> String) {
    if (isDebugEnabled) this.debug(function.invoke())
}

fun org.slf4j.Logger.info(function: () -> String) {
    if (isInfoEnabled) this.info(function.invoke())
}

fun org.slf4j.Logger.warn(function: () -> String) {
    if (isWarnEnabled) this.warn(function.invoke())
}

inline fun <reified T: Enum<T>> T.next(): T {
    val values = enumValues<T>()
    val nextOrdinal = (ordinal + 1) % values.size
    return values[nextOrdinal]
}