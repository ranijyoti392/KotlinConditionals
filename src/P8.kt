/**
 * Created by jyotirani on 18/09/17.
 */

// Write a program to find the largest of 3 numbers.

fun main(args: Array<String>) {
  print("1st Number = ")
  val firstNumber = readLine()!!.toInt()
  print("2nd Number = ")
  val secondNumber = readLine()!!.toInt()
  print("3rd Number = ")
  val thirdNumber = readLine()!!.toInt()
  if (firstNumber != secondNumber && firstNumber !=thirdNumber && firstNumber > secondNumber && firstNumber > thirdNumber) {
    println("The 1st Number is the greatest among three.")
  } else if (secondNumber != firstNumber && secondNumber != thirdNumber && secondNumber > firstNumber && secondNumber > thirdNumber) {
    println("The 2nd Number is the greatest among three.")
  } else if (thirdNumber != firstNumber && thirdNumber != secondNumber && thirdNumber > firstNumber && thirdNumber > secondNumber) {
    println("The 3rd Number is the greatest among three.")
  } else {
    println("All three numbers are equal")
  }
}