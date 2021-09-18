


fun main(){

    val array = arrayOf(5, 1, 22, 25, 6, -1, 8, 10)
    val sequence = arrayOf(1, 6, -1, 10)

    val result = sequenceValidation(array, sequence)
    print(result)
}


fun sequenceValidation(array: Array<Int>, sequence: Array<Int>): Boolean{

    var arr = 0
    var seq = 0

    while (arr < array.size && seq < sequence.size){
        if(array[arr] == sequence[seq]) seq++
        arr++
    }

    return seq == sequence.size
}