package org.example.kotlintestproject2

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform