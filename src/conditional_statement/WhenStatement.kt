package conditional_statement

fun main() {

    var number = 52

    var res = when {
        number in 80..100 -> "A+"
        number in 70..79 -> "A"
        number in 60..69 -> "A-"
        number in 50..59 -> "B"
        number in 40..49 -> "C"
        number in 33..39 -> "D"
        number in 0..32 -> "F"
        else -> "Invalid number"
    }

    println("Your grade is $res")

}