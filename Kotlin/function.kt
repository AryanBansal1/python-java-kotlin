// FUNCTION // MEthod 
// reusable block of code is called Function
import java.util.Scanner
fun main(){
    var reader = Scanner(System.`in`)
    var a = reader.nextInt()
    var b = reader.nextInt()
    println(sum(a,b))
    println("Would you like to repeat")
    var q:String = reader.next()
    if(q=="y" || q == "Y"){
        main()
    }else {println("Thankyou")}
}

fun sum (a:Int,b:Int):Int{
    return(a+b)
}