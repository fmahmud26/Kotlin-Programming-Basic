package string

fun main() {

    var name = "Albert Einstein"
    var name2 = "Isaac Newton"

    println("My Name is $name")

    // Use of get function
    var ch = name.get(7)
    println(ch)

    // Use of compareTo function
    if (name.compareTo(name2, true) > 0) {
        println(name)
    } else if (name.compareTo(name2, true) < 0) {
        println(name2)
    } else {
        println("Both names are equal")
    }


    // Use of contain function
    if (name2.contains("new", true)) {
        println("$name2 contain new")
    }

    // Use of startWith function
    if (name.startsWith("alb", true)) {
        println("$name start with alb")
    }

    // Use of replace function
    name = name.replace("Einstein", "Newton")

    println(name)

}