/**
 * Created by jyotirani on 18/09/17.
 */

// Write a program to find the eligibility od admn for a professional course based on marks criteria.

fun main(args: Array<String>) {
  print("Input the marks obtained in Physics: ")
  val physicsMarks = readLine()!!.toInt()
  print("Input the marks obtained in Chemistry: ")
  val chemistryMarks = readLine()!!.toInt()
  print("Input the marks obtained in Mathematics: ")
  val mathsMarks = readLine()!!.toInt()
  val total = physicsMarks + chemistryMarks + mathsMarks
  if (physicsMarks >= 55 && chemistryMarks >= 50 && mathsMarks >= 65 || total >= 180) {
    println("The candidate is eligible for admission.")
  } else {
    println("The candidate is not eligible for admission.")
  }
}