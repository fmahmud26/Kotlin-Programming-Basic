package array

fun main() {

    /**
     * Array example 1
     */
    var array = arrayOf(1, 2, 3, 4, 5)

    for (i in array) {
        // println(i)
    }


    /**
     * Array example 2
     */
    var array2 = intArrayOf()

    for (i in 1..10) {
        array2 = array2.plus(i * i)
    }

    array2.forEach {
        //  println("$it")
    }

    /**
     * Array example 3
     */

    var array3 = Array(10) { 0.0 }

    array3.forEach { print("$it ") }
    println("\n\n")

    for (i in 1..10) {
        array3[i - 1] = i * i * 1.0;
    }

    array3.forEach { print("$it ") }

    println("\n\n ${array3.size}")


    /**
     * Array function
     */

    array3.reverse()

    array3.forEach { print("$it ") }


    var array4 = array3.reversedArray()

    array3.fill(5.5)

    for (i in array4) {
        print("$i ")
    }

    println()

    array4.sort()

    array4.forEach { print("$it ") }

    array4.sortDescending()

    println()
    array4.forEach { print("$it ") }

    var array5 = array4.sortedArray()

    var array6 = array5.sortedArrayDescending()

    println()
    array5.forEach { print("$it ") }

    println()

    var array7 = array6.slice(1..5)

    for (i in array7) {
        print("$i ")
    }

}