plugins {
    kotlin("js") apply false
    kotlin("jvm") apply false
    kotlin("multiplatform") apply false
}

group = "ru.otus.otuskotlin.datingsa"
description = "OTUS Kotlin course project"
version = "0.0.1"

buildscript {
    val ktlintVersion: String by project
    dependencies {
        classpath("org.jlleitschuh.gradle:ktlint-gradle:$ktlintVersion")
    }
}

allprojects {
    repositories {
        mavenLocal()
        gradlePluginPortal()
        mavenCentral()
        jcenter()
        maven("https://plugins.gradle.org/m2/")
    }
    apply(plugin = "org.jlleitschuh.gradle.ktlint")
}
