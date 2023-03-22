package com.example.sandbox.coroutine

import kotlin.coroutines.*
import kotlinx.coroutines.*
import kotlin.concurrent.*

fun printThreadName(label: String = "") = println("[$label] Thread Name : ${Thread.currentThread().name}")
fun printThreadState(label: String = "", thread: Thread = Thread.currentThread()) =
    println("[$label] Thread State : ${thread.state}")

suspend fun foo(): Boolean {
    val (a, b) = Pair(1, 2)
    printThreadName("before delay")
    delay(1000)
    val c = a + b
    printThreadName("after delay")
    return c == 3
}

fun main() {
    runBlocking {
        repeat(100_000) { // launch a lot of coroutines
            launch {
                printThreadName("$it before")
                delay(5000L)
                printThreadName("$it after")

            }
        }
    }
}

// Concurrently executes both sections
suspend fun doWorld() = coroutineScope { // this: CoroutineScope
    printThreadName("doWorld")
    launch {
        printThreadName("launch 2 before")
        delay(2000L)
        printThreadName("launch 2 after")
        println("World 2")
    }
    launch {
        printThreadName("launch 1 before")
        delay(1000L)
        printThreadName("launch 1 after")
        println("World 1")
    }
    println("Hello")
}
