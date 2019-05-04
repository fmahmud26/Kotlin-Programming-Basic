package oop

fun main(){
    var obj = Child()
}

open class CallingBaseClassConstructor {

    constructor(name : String){
        println(name)
    }

    constructor(){
        println("I am empty")
    }
}

class Child : CallingBaseClassConstructor {

    constructor() : super("Firoz Mahmud"){

    }
}