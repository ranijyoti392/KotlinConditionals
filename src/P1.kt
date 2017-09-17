/**
 * Created by jyotirani on 17/09/17.
 */

// Write a program to accept two integers and check whether they are equal or not.

fun main(args: Array<String>) {
  print("Enter first Integer: ")
  val firstNumber = readLine()!!.toInt()
  print("Enter second Integer: ")
  val secondNumber = readLine()!!.toInt()
  if (firstNumber == secondNumber) {
    println("First Number and Second Number are equal.")
  } else {
    println("Entered Numbers are not equal")
  }
}