package function

fun main() {

    if (isEvenNum(120)) {
        println("The number is even")
    } else {
        println("The number is odd")
    }

    println(isPosNum(0))
}

fun isEvenNum(num: Int): Boolean {

    return when {
        num % 2 == 0 -> true
        else -> false
    }
}

fun isPosNum(num: Int) = when {
    num > 0 -> "positive"
    num < 0 -> "Negative"
    else -> "Zero"
}

