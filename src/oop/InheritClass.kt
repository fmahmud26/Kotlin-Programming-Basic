package oop

open class Employee( var name : String, var  age : Int, var  salary : Float){

    fun displayInfo() {
        println("Name : $name")
        println("Age : $age")
        println("Salary : $salary")
    }
}

class Programmer(  name : String, age: Int,  salary: Float) : Employee(name, age, salary){

}

class SalesMan(name : String, age: Int, salary: Float): Employee(name, age, salary){

}

fun main() {

    var salesman = SalesMan("Salman", 52 ,  52000.45f)
    salesman.displayInfo()

    var programmer = Programmer("Amir Khan" , 52, 95000.55f)
    programmer.displayInfo()


}