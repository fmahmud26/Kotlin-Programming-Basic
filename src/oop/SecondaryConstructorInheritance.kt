package oop

open class Employee2 {

    constructor(name: String) {
        println("Employee name is $name")
    }
}

class Salesman : Employee2 {

    constructor(name: String, designation: String) : super(name) {
        println("Designation : $designation")
    }
}

fun main() {
    var employee = Salesman("Rubel Hossain", "Sales man")
}