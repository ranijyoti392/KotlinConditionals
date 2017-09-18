/**
 * Created by jyotirani on 18/09/17.
 */

//Write a program to accept a coordinate point in a XY cordinate system & determine the quadrant.

fun main(args: Array<String>) {
  print("Enter x coordinate: ")
  val xCoordinate = readLine()!!.toInt()
  print("Enter y coordinate: ")
  val yCoordinate = readLine()!!.toInt()
  if (xCoordinate > 0 && yCoordinate >0) {
    println("The coordinate point ($xCoordinate , $yCoordinate) lies in the 1st quadrant.")
  } else if (xCoordinate > 0 && yCoordinate < 0) {
    println("The coordinate point ($xCoordinate , $yCoordinate) lies in the 2nd quadrant.")
  } else if (xCoordinate < 0 && yCoordinate < 0) {
    println("The coordinate point ($xCoordinate , $yCoordinate) lies in the 3rd quadrant.")
  } else if (xCoordinate < 0 && yCoordinate > 0) {
    println("The coordinate point ($xCoordinate , $yCoordinate) lies in the 4th quadrant.")
  } else {
    println("The coordinate point ($xCoordinate , $yCoordinate) lies in the Origin.")
  }
}