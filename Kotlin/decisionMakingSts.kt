import java.util.Scanner
fun main(){
// Decison Making Statement
        var reader = Scanner(System.`in`)
        println("Enter 3 numbers")
        var a:Int = reader.nextInt()
        var b:Int = reader.nextInt()
        var c:Int = reader.nextInt()

        if (a>b && a>c){
            println("A is greater than b and c")
        }
        else if (b>c){println("B is greater than a and c")}
        else {println("C is greater than A and B")}
    }

// 