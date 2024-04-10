fun main() {
    var arr = arrayOf(1,2,3,4,5,6,7,8,9,12,13,14,15)
    var Even_sum :Int = 0
    var Odd_sum : Int = 0
    for(i in 0..arr.size-1){
        if(arr[i]%2==0){
            Even_sum+=arr[i]
        }
        else{Odd_sum+=arr[i]}
    }
    println("The sum of even number "+Even_sum)
    println("The sum of odd number "+Odd_sum)
}
