pluginManagement {
    repositories {
        mavenLocal()
        mavenCentral()
        google()
        gradlePluginPortal()
    }

    val korgeVersion: String by settings
    val kotlinxBenchmarkVersion: String by settings
    val allOpenVersion: String by settings

    plugins {
        //id("com.soywiz.kproject.settings") version "0.0.1-SNAPSHOT"
        id("com.soywiz.korge") version korgeVersion
        id("org.jetbrains.kotlin.plugin.allopen") version allOpenVersion
        id("org.jetbrains.kotlinx.benchmark") version kotlinxBenchmarkVersion
    }
}

plugins {
    id("com.soywiz.kproject.settings") version "0.2.6"
}

kproject("./deps")
