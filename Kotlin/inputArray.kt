import java.util.Scanner
fun main(){
    var sum :Int = 0
    println("Enter the size of the array")
    val reader = Scanner(System.`in`)
    var size = reader.nextInt()
    var arr = IntArray(size)
    for(i in 0..size-1){
        println("enter the "+(i+1)+" element")
        arr[i]=reader.nextInt()
        sum+=arr[i]
    }
    println()
    for(i in 0..size-1){
        println(arr[i])
    }
    println("the total of element "+sum)
}