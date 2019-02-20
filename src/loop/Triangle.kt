package loop

fun main() {

    // print triangle using for loop
    // triangle 1
    for (i in 1..5) {

        for (j in 1..i) {

            print("*")
        }
        println()
    }

    println("---------------")

    // triangle 2
    for (i in 5.downTo(1)) {
        for (j in 1..i) {

            print("*")
        }
        println()
    }

    println("---------------")

    // triangle 3
    for (i in 5.downTo(1)) {

        for (j in 1..i) {

            print("*")
        }
        println()

        for (k in 5.downTo(i)) {
            print(" ")
        }
    }

    println("---------------")

    // triangle 4
    for (i in 5.downTo(1)) {

        // for space
        for (j in i.downTo(1 + 1)) {

            print(" ")
        }

        // print *
        for (k in i..5) {

            print("*")
        }
        println()

    }


    println("---------------")


    // triangle 5
    for (i in 1..5) {

        // for space
        for (j in i.until(5)) {

            print(" ")
        }

        // for star
        for (k in 1..(i + i - 1)) {

            print("*")
        }

        println()

    }

    println("---------------")


    // triangle 6
    var counter = 0
    for (i in 9.downTo(1) step 2) {

        // print star
        for (j in 1..i) {

            print("*")
        }
        println()
        counter++

        // print space
        for (k in 1..counter) {

            print(" ")
        }
    }

}