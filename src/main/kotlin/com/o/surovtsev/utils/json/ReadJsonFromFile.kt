package com.o.surovtsev.utils.json

import org.springframework.core.io.ClassPathResource
import java.nio.file.Files
import java.nio.file.Path

fun readJsonFromJsonFileAsString(): String {
    return Files.readString(Path.of(ClassPathResource("json/simple.json").uri))
}