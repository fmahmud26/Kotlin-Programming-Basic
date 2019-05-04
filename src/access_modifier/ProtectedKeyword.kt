package access_modifier

open class Base {
    protected open val i = 100
}

class Derived : Base() {

    fun getValue() : Int {
        return i
    }

    override val i = 200
}

fun main() {

    val obj = Derived()
    println(obj.getValue())
}