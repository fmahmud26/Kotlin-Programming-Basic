package access_modifier

internal open class Base2 {

    internal  var i = 100

}

private class Derived2 : Base2() {

    fun getValue() : Int{

        return i
    }
}

fun main() {

    var obj = Derived2()
    println(obj.getValue())

    var obj2 = Base2()
    println(obj2.i)
}



