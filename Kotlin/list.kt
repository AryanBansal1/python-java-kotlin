fun main(){
    var abc = listOf(1,2,4,5,"abds",'+',8)
    for(i in 0..abc.size-1){
        //address of each element
        println(System.identityHashCode(abc[i]))
    }

    var bcd = arrayOf(1,2,3,4)
    for(i in 0..bcd.size-1){
        //address of each element
        println(System.identityHashCode(bcd[i]))
    }
}
