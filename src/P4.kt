/**
 * Created by jyotirani on 18/09/17.
 */

// Write a program to find if given year is a leap year or not.

fun main(args: Array<String>) {
  print("Enter Year: ")
  val year = readLine()!!.toInt()
  if (year % 4 == 0) {
    println("$year is a leap year.")
  } else {
    println("$year is not a leap year.")
  }
}