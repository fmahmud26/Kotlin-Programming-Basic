package oop.overriding

open class A {
    open fun displayInfo() {
        println("I am from A")
    }
}

open class B : A() {
    override fun displayInfo() {
        super.displayInfo()
        println("I am class B")
    }
}

interface C {
    fun displayInfo() {
        println("I am from C")
    }
}

class D : B(), C {

    override fun displayInfo() {
        super<B>.displayInfo()
        super<C>.displayInfo()
        println("I am from D")
    }
}

fun main() {

    val ob = D()

    ob.displayInfo()
}