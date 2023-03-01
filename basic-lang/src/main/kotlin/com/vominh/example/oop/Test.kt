package com.vominh.example.oop

abstract class Animal(private var name: String, private var legCount: Int) {

    fun whoAmI() {
        println("$name, $legCount legs")
    }

    abstract fun shout()
}

class Dog(name: String, legCount: Int) : Animal(name, legCount) {
    override fun shout() {
        println("Go Go Go")

    }
}

class Chicken(name: String, legCount: Int) : Animal(name, legCount) {
    override fun shout() {
        println("Cuckoo Cuckoo")
    }
}


fun main(args: Array<String>) {
    val one: Animal = Dog("One", 4)
    val two: Animal = Chicken("C", 2)
    one.whoAmI()
    one.shout()
    two.whoAmI()
    two.shout()

}

