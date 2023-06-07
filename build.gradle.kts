import korlibs.korge.gradle.korge

plugins {
    id("com.soywiz.korge")
    id("org.jetbrains.kotlin.plugin.allopen")
    id("org.jetbrains.kotlinx.benchmark")
}

korge {
    id = "org.github.smaugfm"

    targetJvm()
}


dependencies {
    add("commonMainApi", project(":deps"))
}

