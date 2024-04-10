import java.util.Scanner
fun main(){
    var reader = Scanner(System.`in`)
    println("Enter a number from 1 to 7")
    var a : Int = reader.nextInt()

    when (a){
        1 -> print("Monday")
        2 -> print("Tuesday")
        3 -> print("Wednesday")
        4 -> print("Thursday")
        5 -> print("Friday")
        6 -> print("Saturday")
        7 -> print("Sunday")
        else -> print("Not a valid day")
    }

}