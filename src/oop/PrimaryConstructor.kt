package oop

fun main(){

    var obj = Test("Firoz Mahmud", 123)

    println(obj.name)
    println(obj.number)
}

class Test(val name : String, val number: Int)