fun main() {
    val num1 = 3
    val num2 = 5
    val num3 = 6
    val num4 = 1
    val num5 = 4

    if (num1 > num2) {
        println(num1.toString() + " is greater than " + num2.toString())
    }
    else if (num2 > num1){
        println(num2.toString() + " is greater than " + num1.toString())
    }

    println()

    if (num3 > num4) {
        println(num3.toString() + " is greater than " + num4.toString())
    }
    else if (num2 > num1){
        println(num4.toString() + " is greater than " + num3.toString())
    }

    println()

    if (num1 > num3) {
        println(num1.toString() + " is greater than " + num3.toString())
    }
    else if (num3 > num1){
        println(num3.toString() + " is greater than " + num1.toString())
    }

    println()

    if (num5 > num2) {
        println(num5.toString() + " is greater than " + num2.toString())
    }
    else if (num2 > num5){
        println(num2.toString() + " is greater than " + num5.toString())
    }

    println()

    if (num5 > num4) {
        println(num5.toString() + " is greater than " + num4.toString())
    }
    else if (num4 > num5){
        println(num4.toString() + " is greater than " + num5.toString())
    }

    println()


    if (num1 < num2) {
        println(num1.toString() + " is less than " + num2.toString())
    }
    else if (num2 < num1){
        println(num2.toString() + " is less than " + num1.toString())
    }

    println()

    if (num1 < num3) {
        println(num1.toString() + " is less than " + num3.toString())
    }
    else if (num3 < num1){
        println(num3.toString() + " is less than " + num1.toString())
    }

    println()

    if (num5 < num2) {
        println(num5.toString() + " is less than " + num2.toString())
    }
    else if (num2 < num5){
        println(num2.toString() + " is less than " + num5.toString())
    }

    println()

    if (num5 < num4) {
        println(num5.toString() + " is less than " + num4.toString())
    }
    else if (num4 < num5){
        println(num4.toString() + " is less than " + num5.toString())
    }

    println()

    if (num5 < num1) {
        println(num5.toString() + " is less than " + num1.toString())
    }
    else if (num1 < num5){
        println(num1.toString() + " is less than " + num5.toString())
    }

    println()

    val time = 12
    val greeting : String = when (time) {
        in 0..5 -> "Why up so early?"
        in 6..11 -> "Good Morning"
        in 13..15 -> "Good Afternoon"
        in 16..21 -> "Good Evening"
        else -> "Time for lunch"
    }
    println("Its ${time.toString()} hours $greeting")
    println()

    val time2 = 5
    val greeting2 : String = when (time2) {
        in 0..5 -> "Why up so early?"
        in 6..11 -> "Good Morning"
        in 13..15 -> "Good Afternoon"
        in 16..21 -> "Good Evening"
        else -> "Time for lunch"
    }
    println("It's ${time2.toString()} hours $greeting2")
    println()

    val time3 = 8
    val greeting3 : String = when (time3) {
        in 0..5 -> "Why up so early"
        in 6..11 -> "Good Morning"
        in 13..15 -> "Good Afternoon"
        in 16..21 -> "Good Evening"
        else -> "Time for lunch"
    }
    println("It's ${time3.toString()} hours $greeting3")
    println()

    val time4 = 15
    val greeting4 : String = when (time4) {
        in 0..5 -> "Why up so early"
        in 6..11 -> "Good Morning"
        in 13..15 -> "Good Afternoon"
        in 16..21 -> "Good Evening"
        else -> "Time for lunch"
    }
    println("It's ${time4.toString()} hours $greeting4")
    println()

    val time5 = 20
    val greeting5 : String = when (time5) {
        in 0..5 -> "Why up so early"
        in 6..11 -> "Good Morning"
        in 13..15 -> "Good Afternoon"
        in 16..21 -> "Good Evening"
        else -> "Time for lunch"
    }
    println("It's ${time5.toString()} hours $greeting5")

   for (i : Int in 1..100) println(i)
    println()
    for (num : Int in 1..10){
      if ((num == 4) || (num == 5)){
      continue
      }
    println(num)

}
    println()
var scores: Array<Int> = arrayOf(10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30)
    evenAndOdd(scores)
}
fun evenAndOdd(scores: Array<Int>) {
    for (score in scores) {
        if ((score % 2 == 0) && (score <= 20))
            println(score)
            else if ((score > 20) && (score % 2 !=0))
            println(score)

        }

}

