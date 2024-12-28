package com.koen.mycalculator

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform