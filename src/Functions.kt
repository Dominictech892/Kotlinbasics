fun main() {
    //Standard-library Function/Built-in functions
    var result = Math.sqrt(81.0)
    println("The result is $result")

    var number = Math.round(67.8)
    println(number)



    divide()
    school()
    student("Dominic","23","Nale")


}
//User defined Functions
fun school(){
    println("eMOBILIS")
}
fun divide () {
    var num1 = 56
    var num2 = 7
    println(num1/num2)


}


//parameters and argument
fun student(name: String, age: String, gender: String) {
    println("$name $age $gender")
}