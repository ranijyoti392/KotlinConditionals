/**
 * Created by jyotirani on 18/09/17.
 */

// Write a program to read temperature and display a suitable message according to temp states below.
// temp <0, freezing weather
// temp 0 to 10, very cold weather
// temp 10 to 20, cold weather
// temp 20 to 30, normal weather
// temp 30 to 40, hot
// temp > 40, very hot

fun main(args: Array<String>) {
  print("Enter Temperature: ")
  val temperature = readLine()!!.toInt()
  if (temperature < 0) {
    println("Freezing weather.")
  } else {
   when (temperature) {
     in 0..10 ->
         println("It is very cold weather.")
     in 11..20 ->
         println("It is cold Weather.")
     in 21..30 ->
         println("It is normal weather")
     in 31..40 ->
         println("It is hot weather.")
     else ->
       println("It is very hot weather. Be safe.")
   }
  }
}