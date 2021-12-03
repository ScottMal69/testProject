package bot

import java.util.Scanner


val scanner = Scanner(System.`in`) // Do not change this line

fun main() {
    greet("Aid", "2020") // change it as you need
    remindName()
    guessAge()
    count()
    test()
    end()
}

fun greet(assistantName: String, birthYear: String) {
    println("Hello! My name is ${assistantName}.")
    println("I was created in ${birthYear}.")
    println("Please, remind me your name.")
}

fun remindName() {
    val name = scanner.nextLine()
    println("What a great name you have, ${name}!")
}

fun guessAge() {
    println("Let me guess your age.")
    println("Enter remainders of dividing your age by 3, 5 and 7.")
    val rem3 = scanner.nextInt()
    val rem5 = scanner.nextInt()
    val rem7 = scanner.nextInt()
    val age = (rem3 * 70 + rem5 * 21 + rem7 * 15) % 105
    println("Your age is ${age}; that's a good time to start programming!")
}

fun count() {
    println("Now I will prove to you that I can count to any number you want.")
    val num = scanner.nextInt()
    for (i in 0..num) {
        print(i)
        println("!")
    }
}

fun test() {
    println("Let's test your programming knowledge.")
    // write your code here
    println("Why do we use methods?")
    println("1. To repeat a statement multiple times.")
    println("2. To decompose a program into several small subroutines.")
    println("3. To determine the execution time of a program.")
    println("4. To interrupt the execution of a program.")

    do {
        val n = readLine()!!.toInt()
        if(n != 2){
            println("Please, try again.")
        }
    } while (n != 2)
}

fun end() {
    println("Congratulations, have a nice day!") // Do not change this text
}


//    Let's test your programming knowledge.
//    Why do we use methods?
//    1. To repeat a statement multiple times.
//    2. To decompose a program into several small subroutines.
//    3. To determine the execution time of a program.
//    4. To interrupt the execution of a program.
//    > 4
//    Please, try again.
//    > 2

//    var i = 0
//    while (i < 10) {
//        i++
//        if (i % 2 == 0) {
//            print("$i ")
//        }
//    }
//}


/*
write your code here
fun isRightEquation(a: Int, b: Int, c: Int): Boolean {
if ((a * b) == c) {
return true
}
return false
}

/ * Do not change code below * /
fun main() {
val a = readLine()!!.toInt()
val b = readLine()!!.toInt()
val c = readLine()!!.toInt()
println(isRightEquation(a, b, c))
}

val scanner = Scanner(System.`in`)

println("Hello! My name is Aid.")
println("I was created in 2020.")
println("Please, remind me your name.")

val name = scanner.nextLine()

println("What a great name you have, " + name + "!")
println("Let me guess your age.")
println("Enter remainders of dividing your age by 3, 5 and 7.")

// reading all remainders
val remainder3 = readLine()!!.toInt()
val remainder5 = readLine()!!.toInt()
val remainder7 = readLine()!!.toInt()

val yourAge = (remainder3 * 70 + remainder5 * 21 + remainder7 * 15) % 105
println("Your age is $yourAge; that's a good time to start programming!")

val aNumber = readLine()!!.toInt()

for (i in 0..aNumber) {
println("$i!")
}
println("Completed, have a nice day!")

val a = readLine()!!.toInt()
val b = readLine()!!.toInt()

for (i in a..b) {
if (i % 3 == 0) {
if (i % 5 == 0) {
println("FizzBuzz")
} else {
println("Fizz")
}
} else {
if (i % 5 == 0) {
println("Buzz")
} else {
println(i)
}
}

}
for (i in a..b) {
if(i % 3 = 0){
if(i%5=true){
println("FizzBuzz")
}else {
println("Fizz")
}
}else {
if(i%5=true){
println("Buzz")
} else {
println(i)
}
}

println(result)
val a = readLine()!!.toInt()
*/
