package com.o.surovtsev.utils.json

import com.fasterxml.jackson.core.JsonFactory
import com.fasterxml.jackson.core.JsonGenerator
import com.fasterxml.jackson.databind.ObjectMapper
import com.google.gson.Gson

/**
 * For com.fasterxml.jackson
 * */
fun convertObjectToJsonStringForJackson(someObject: Any): String {
    return ObjectMapper().writer().withDefaultPrettyPrinter().writeValueAsString(someObject)
}

/**
 * For com.google.gson
 * */
fun convertObjectToJsonStringForGson(someObject: Any): String {
    return Gson().toJson(someObject)
}
