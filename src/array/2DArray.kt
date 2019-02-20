package array

fun main() {

    var arr1 = arrayOf(1, 2, 3)
    var arr2 = arrayOf(1, 3, 5)
    var arr3 = arrayOf(2, 4, 6)

    /**
     * 2D Array
     */
    var array = arrayOf(arr1, arr2, arr3)

    for (i in array) {

        for (j in i) {
            print("$j ")
        }

        println()
    }
}