/**
 * Created by jyotirani on 18/09/17.
 */

// Write a program to check if a candidate is eligible for casting his/her vote.

fun main(args: Array<String>) {
  print("Enter Age: ")
  val age = readLine()!!.toInt()
  if (age >= 18) {
    println("Conratulations! You are eligible for casting your vote.")
  } else {
    println("Sorry! You are not elible for casting your vote.")
  }
}