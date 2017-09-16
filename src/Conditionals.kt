/**
 * Created by jyotirani on 16/09/17.
 */
fun main(args: Array<String>) {

    print("Enter age: ")
    val age = readLine()!!.toInt()
    if (age > 0) {
        if (age < 5) {
            println("Go to Pre School.")
        } else if (age == 5) {
            println("Go to Kindegarten.")
        } else if (age > 5 && age <=17) {
            println("Go to grade ${age - 5}")
        } else {
            println("Go to College.")
        }
    } else {
        println("Enter correct age.")
    }
}