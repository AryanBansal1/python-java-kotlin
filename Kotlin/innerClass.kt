/******************************************************************************
Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.Scanner
// Class within a class 
class c1{
    val reader = Scanner(System.`in`)
    var a = reader.nextInt()
    var b= reader.nextInt()
    inner class sum{
        var add = a+b
    }
    inner class subtract{
        var minus = a-b
    }
    inner class multiply{
        var multi = a*b
    }

}
fun main(){
    val obj1 = c1()
    println("Enter the number here")
    obj1.a
    obj1.b
    val obj2 = obj1.sum()
    val obj3 = obj1.subtract()
    val obj4 = obj1.multiply()
    println("Sum of numbers equal to "+obj2.add)
    println("Subtraction of number is "+obj3.minus)
    println("Multipy of number is "+ obj4.multi)
}