package com.example.aadk_3app1

fun main() {
//    var testString = "Hello" // Mutable
//    val testNubmer = 25      // Immutable
//
//    // Mutability -> ability to update
//    testString = "Hey" // This works fine
//    // TstNumber = 50
//
//    // Data Types in Kotlin
//    // Int, Float, Double, Short, Boolean
//    var a: Int = 10
    val b: Float = 1.5f
    println(b::class.simpleName)
//    var c: Double = 1.5
//    var d: Boolean = true
//
//    var e: String = "Hello"
//
//    var f: Any = 5
//    f = true
//    f = "New String"
//    f = 1.5f
//
    val currentTime = Time(hours = 11, minutes = 48, seconds = 36, period = Period.AM)
    println(currentTime)
}

// Time - hours, min, sec, AM/PM
data class Time(
    var hours: Int,
    var minutes: Int,
    var seconds: Int,
    var period: Period //AM/PM
)

// enum is a custom data type which has set of values assigned to it
// the values that a data type can hold is defined in enum class
enum class Period {
    AM,
    PM
}
