import java.util.*

// Integers in Action
//
const val D = 2

fun main() {

    val a = readLine()!!.toInt()
    val b = readLine()!!.toInt()
    val c = readLine()!!.toInt()
    val d = a / D + a % D + b / D + b % D + c / D + c % D

    println(d) // put your code here
    println(a%D)
    println(b%D)
    println(c%D)


//    val a = readLine()!!.toInt()
//    val b = readLine()!!.toInt()
//    val n = readLine()!!.toInt()
//
//    var result = 0 // starting value of the factorial
//
//    for (i in a..b){
//        if(i % n == 0 )
//            result += 1
//    }
//    println(result)
//


    //
    // HH:MM:SS for today since 1/1/1970 (I think?)
    val totalSeconds = System.currentTimeMillis() / 1000 // dont change this line
    val dvr = 24*60*60
    val work1 = totalSeconds / dvr  // number of days
    val work2 = totalSeconds - (work1 * dvr) // seconds remaining after day seconds subtracted
    val hours = work2 / (3600)  // hours left
    val hrssecs = hours * 3600
    val minutes = ((work2 - hrssecs) / 60)
    val minsecs = minutes * 60
    val seconds = work2 - hrssecs - minsecs

/*
    println(totalSeconds)
    println(dvr)
    println(work1)
    println(work2)
    println(hours)
    println(hrssecs)
    println(minutes)
    println(minsecs)
    println(seconds)
*/

    print(hours)
    print(":")
    print(minutes)
    print(":")
    print(seconds)

//    val low = 0
//    val high = 10
//    val number = readLine()!!.toInt()
//
//    val inRange = number > low && number < high // joining two expressions using AND
//
//    println(inRange)

//
//    val int1 = readLine()!!.toInt()
//    val int2 = readLine()!!.toInt()
//
//    val strExp = int1.toString() + " " + int2.toString()
//
//    println(strExp)
//


}

//   val scanner = Scanner(System.`in`)

//    println("Hello! My name is Aid.")
//    println("I was created in 2020.")
//    println("Please, remind me your name.")
//
//    val name = scanner.nextLine()
//
//    println("What a great name you have, " + name + "!")
//    println("Let me guess your age.")
//    println("Enter remainders of dividing your age by 3, 5 and 7.")
//
//    // reading all remainders
//    val remainder3 = readLine()!!.toInt()
//    val remainder5 = readLine()!!.toInt()
//    val remainder7 = readLine()!!.toInt()

//    val yourAge = (remainder3 * 70 + remainder5 * 21 + remainder7 * 15) % 105
//    println("Your age is $yourAge; that's a good time to start programming!")
//
//
//val scanner = Scanner(System.`in`)
//
//println("Hello! My name is Aid.")
//println("I was created in 2020.")
//println("Please, remind me your name.")
//
//val name = scanner.nextLine()
//
//println("What a great name you have, " + name + "!")
//println("Let me guess your age.")
//println("Enter remainders of dividing your age by 3, 5 and 7.")
//
//// reading all remainders
//val remainder3 = readLine()!!.toInt()
//val remainder5 = readLine()!!.toInt()
//val remainder7 = readLine()!!.toInt()
//
//val yourAge = (remainder3 * 70 + remainder5 * 21 + remainder7 * 15) % 105
//println("Your age is $yourAge; that's a good time to start programming!")
//
//val aNumber = readLine()!!.toInt()
//
//for (i in 0..aNumber) {
//    println("$i!")
//}
//println("Completed, have a nice day!")

//Hello! My name is Aid.
//I was created in 2020.
//Please, remind me your name.
//> Max
//What a great name you have, Max!
//Let me guess your age.
//Enter remainders of dividing your age by 3, 5 and 7.
//> 1
//> 2
//> 1
//Your age is 22; that's a good time to start programming!
//Now I will prove to you that I can count to any number you want.
//> 5
//0!
//1!
//2!
//3!
//4!
//5!
//Completed, have a nice day!