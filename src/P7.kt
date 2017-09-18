/**
 * Created by jyotirani on 18/09/17.
 */

// Write a program to accept height of a person in cm and print message to categorize the person acc to height.

fun main(args: Array<String>) {
  print("Enter Height in Centimeters: ")
  val height = readLine()!!.toInt()
  if (height in 0..135) {
    println("The person is Dwarf.")
  } else if (height in 136..160) {
    println("The value person is medium heighted.")
  } else if (height > 160) {
    println("The person is tall.")
  } else {
    println("Please enter valid height.")
  }
}