package ru.otus.otuskotlin.datingsa.mp.common

expect class SharedClass {
    suspend fun request(id: String): String
}
