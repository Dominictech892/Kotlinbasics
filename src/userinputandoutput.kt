import java.util.Scanner

fun main() {
    var read = Scanner(System. `in`)

    println("Enter your full name : ")
    var fullname = readln()
    println("fullname . $fullname")


    println("How old are you (in years) : ")
    var age = read.nextInt()
    println("age . $age")

    println("Enter weight (in kgs) :")
    var weight = read.nextDouble()
    println("weight . $weight")

    println()

    println("Summary of your information")
    println("fullname . $fullname")
    println("age . $age years old")
    println("weight . $weight kg")
    println("----Thank you!!!---")


}