


fun main(){

    val coins = arrayOf(1,5,8)
    coins.sort()

    var changeAlreadyCreated = 0

    for(coin in coins){

       val changeToBeCreated = changeAlreadyCreated + 1

        if(coin > changeToBeCreated){
            println("can't create change for $changeToBeCreated")
            return
        }
        changeAlreadyCreated += coin
    }
}