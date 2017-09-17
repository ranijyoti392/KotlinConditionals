/**
 * Created by jyotirani on 17/09/17.
 */

// Write a program to check whether a given number is even or odd.

fun main(args: Array<String>) {
  print("Enter the Number: ")
  val NUMBER =  readLine()!!.toInt()
  if (NUMBER % 2 == 0) {
    println("Entered number is EVEN.")
  } else {
    println("Entered number is ODD.")
  }
}