import java.util.Scanner

fun main() {
    var read = Scanner(System.`in`)

    println("Enter a number :")
    var number = read.nextInt()

    if (number == 0){
        println("The number is neutral")
    }
    else if(number %2 ==0){
        println("even")

    }
    else{
        println("odd")
    }
}