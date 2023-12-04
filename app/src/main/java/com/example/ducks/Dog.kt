package com.example.ducks

abstract class Dog {
    lateinit var barkBehavior: BarkBehavior
    lateinit var runBehavior: RunBehavior

    abstract fun display()

    fun performBark() {
        barkBehavior.bark()
    }

    fun performRun() {
        runBehavior.run()
    }

    fun chill() {
        println("Ima chilling dog!")
    }
}