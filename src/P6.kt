/**
 * Created by jyotirani on 18/09/17.
 */

/* Write a program to read a value of an integer m and display the value of n=1 when m is larger than 0, and -1 when
 m is less than 0*/

fun main(args: Array<String>) {
  print("Enter any Integer: ")
  var integer = readLine()!!.toInt()
  if (integer > 0) {
    println("The value of number = 1.")
  } else if (integer == 0) {
    println("The value of number = 0.")
  } else if (integer < 0) {
    println("The value of number = -1.")
  } else {
    println("Please enter correct number.")
  }
}