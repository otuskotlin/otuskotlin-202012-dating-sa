package ru.otus.otuskotlin.datingsa.mp.common

import kotlinx.coroutines.delay

actual class SharedClass {
    val `my name`: String = "my name"

    actual suspend fun request(id: String): String {
        delay(1000)
        return "Jvm done"
    }
}
