


fun main(){
    val array = arrayOf(-7, -3, 2, 3, 11)
    print(sortedSquaredArray(array).contentToString())
}

fun sortedSquaredArray(array: Array<Int>): Array<Int>{

    val sq =  Array(array.size){0}
    var count = 0
    while (count < array.size){
        sq[count] = array[count] * array[count]
        count ++
    }
    sq.sort()
    return sq
}