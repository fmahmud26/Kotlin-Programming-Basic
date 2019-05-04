package array

fun main() {

    var array = Array(3) { IntArray(3) { -1 } }

    for (i in array) {
        for (j in i) {
            print("$j ")
        }
        println()
    }

    println("Enter values")

    for (i in array.indices) {
        for (j in array[i].indices) {
            array[i][j] = Integer.parseInt(readLine())
        }
    }


    println("Array: ")
    for (i in array) {
        for (j in i) {
            print("$j ")
        }
        println()
    }
}