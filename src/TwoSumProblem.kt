import java.util.*


fun main(){
    val student = arrayOf(10, 9, 23, 12, 5, 2, 4,4, 1)

    val result = sumToTarget(student, 5)
    print(result)
}

fun sumToTarget(arr : Array<Int>, k : Int): Boolean{

    arr.sort()
    var lhs = 0
    var rhs = arr.size - 1

    while(lhs < rhs){
        val sum = arr[lhs] + arr[rhs]
        when {
            sum == k -> return true
            sum < k -> lhs ++
            else -> rhs --
        }
    }

    return false
}