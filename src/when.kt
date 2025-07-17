import java.util.Scanner

fun main() {
    var read = Scanner(System.`in`)


    println("Enter marks")
    var marks = read.nextInt()

    var grade = when{
        marks >- 90 -> "A+"
        marks >- 80 -> "A"
        marks >- 70 -> "A-"
        marks >- 60 -> "B+"
        marks >- 50 -> "B"
        marks >- 45 -> "B-"
        marks >- 40 -> "c+"
        marks >- 39 -> "C"
        marks >- 30 -> "C-"
        marks >- 30 -> "D+"
        marks >- 30 -> "D"
        marks >- 30 -> "D-"
       else -> "E"
    }
    println("scored . $grade")
}