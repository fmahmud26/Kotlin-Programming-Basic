package oop

open class Animal(var name : String) {

    init {
        println("Animal Name: $name")
    }
}

class Tiger(name: String) : Animal(name) {

    fun doWork(){
        println("This is tiger")
    }
}

class Dog(name : String) : Animal(name) {
    fun doWork(){
        println("This is dog")
    }
}

fun main() {

    var dog = Dog("Dog")
    dog.doWork()
}