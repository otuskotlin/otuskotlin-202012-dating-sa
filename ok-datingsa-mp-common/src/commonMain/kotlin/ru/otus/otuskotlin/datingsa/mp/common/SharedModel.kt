package ru.otus.otuskotlin.datingsa.mp.common

import kotlin.js.JsName
import kotlin.jvm.JvmName
import kotlin.jvm.JvmOverloads

data class SharedModel @JvmOverloads constructor(
    val id: String = "",
    val name: String = ""
) {
    @JsName("my_name")
    @get:JvmName("getMyName")
    val `my name` = "my name"
}
