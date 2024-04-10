import java.util.Scanner
fun main(){
    var flag : Boolean = false 
    val reader = Scanner(System.`in`)
    var a = reader.nextInt()
    var abc = arrayOf(1,12,34,47,59,61,74,88,97)
    for(i in 0..abc.size-1){
        if(abc[i] ==a){
        println("The index of variable is "+i)
          flag = true  
        }
    }
    if(flag == false){println("The number is not found")}
}