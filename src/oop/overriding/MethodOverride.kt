package oop.overriding

open class Bird {
    open fun fly(){
        println("Bird is flying...")
    }

    open var color: String = "Green"
}

class Parrot : Bird() {
    override fun fly(){
        println("Parrot is flying...")
    }
}

class Duck : Bird() {
    override fun fly() {
        println("Duck is flying...")
        super.fly()
    }
}

fun main(){
    var  parrot = Parrot()
    var duck = Duck()

   // parrot.fly()
    duck.fly()
}