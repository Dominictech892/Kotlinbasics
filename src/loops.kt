fun main() {
    //While loop

    var count = 45
    while (count <= 50){
        println("Number is $count")
        count++
    }

    //program 2
    var number = 10
    while (number >= 5){
        println(number)
        number--
    }

    //Do while loop
    var x = 1
    do {
        println("number is $x")
        x++

    }
        while (x <= 5)

//for loop
       for (num in 30..49){
           println("number is $num")
       }
    //program 2

    for (letter in 'a'..'d')
        println("letter is $letter")

    for (number in 1..10){
        println(number)
        if(number ==5){
            println("Breaking the number")
        }
    }




}
