/**
 * Created by jyotirani on 18/09/17.
 */

// Write a program to check a number is positive or negative.

fun main(args: Array<String>) {
  print("Enter number: ")
  val number = readLine()!!.toInt()
  if (number > 0) {
    println("$number is a positive number.")
  } else {
    println("$number is a negative number.")
  }
}