package loop

fun main() {


    println("print 1 to 10")
    for (i in 1..10) {

        println(i)
    }


    println("print 0 to 9")
    for (i in 0.until(10)) {

        println(i)
    }


    println("print all even number from 1 to 10")
    for (i in 2..10 step 2) {

        println(i)
    }


    var arr = arrayOf(10, 20, 30, 40, 50)


    println("print array")
    for (i in arr) {

        println(i)
    }



    println("print all index of array")
    for (i in arr.indices) {

        println(i)
    }



    println("print value with  array index")
    for (i in arr.indices) {

        println("arr[$i] = ${arr[i]}")
    }


}