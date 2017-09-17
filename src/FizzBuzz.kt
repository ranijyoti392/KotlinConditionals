/**
 * Created by jyotirani on 16/09/17.
 */
fun main(args: Array<String>) {
  print("Enter number: ")
  val number = readLine()!!.toInt()
  for (output in 1..number) {
    if (output % 3 == 0 && output % 5 == 0) {
      println("FizzBuzz")
    } else if (output % 5 == 0) {
      println("Buzz")
    } else if (output % 3 == 0) {
      println("Fizz")
    } else {
      println(output)
    }
  }
}