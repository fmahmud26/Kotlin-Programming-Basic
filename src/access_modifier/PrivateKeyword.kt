package access_modifier

open class PrivateKeyword {
    public var i = 100
    protected var j = 200
    private var k = 300
}

class Test : PrivateKeyword(){

    fun getValue() : Int {
      //  return k // here k is invisible
        return j
    }
}

fun main() {
    var obj = PrivateKeyword()

    println(obj.i)
   // println(obj.j)  // here j is invisible
   // println(obj.k)  // here k is invisible
}