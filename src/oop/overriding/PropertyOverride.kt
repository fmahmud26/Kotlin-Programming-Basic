package oop.overriding

open class Bird2 {
     open var  color = "Black"
    open fun fly(){
        println("Bird is flying...")
    }
}

class Parrot2 : Bird() {

    override var color = "Green"
    override fun fly(){
        println("Parrot is flying...")
    }
}

class Duck2 : Bird() {

   // override var color = "White"
    override fun fly() {
        println("Duck is flying...")
        super.fly()
    }
}

fun main(){
    var  parrot = Parrot()
    var duck = Duck2()

   // parrot.fly()
    duck.fly()
    println(duck.color)
}