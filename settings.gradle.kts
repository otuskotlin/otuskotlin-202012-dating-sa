pluginManagement {
    plugins {
        val kotlinVersion: String by settings

        kotlin("multiplatform") version kotlinVersion apply false
        kotlin("jvm") version kotlinVersion apply false
        kotlin("js") version kotlinVersion apply false
    }
}

rootProject.name = "otuskotlin-202012-datingsa"

include("ok-datingsa-be-common")
include("ok-datingsa-mp-common")
