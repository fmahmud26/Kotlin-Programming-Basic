package oop

fun main() {

    var obj = SecondaryConstructor()
    val obj2 = SecondaryConstructor(100)
    val obj3 = SecondaryConstructor("Firoz Mahmud")

}

class SecondaryConstructor {

    constructor() : this(10){
        println("Hello")
    }

    constructor(a: Int) {
        println(a)
    }

    constructor(name: String) {
        println(name)
    }

}