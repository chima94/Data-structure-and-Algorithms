

fun main(){

    val competitions = arrayOf(
        arrayOf("HTML", "C#"),
        arrayOf("C#", "Python"),
        arrayOf("Python", "HTML"),
        arrayOf("go", "HTML"),
        arrayOf("go", "HTML"),
        arrayOf("Python", "go")
    )

    val results = arrayOf(0, 0, 1, 1, 1, 0)

    val winner = mutableMapOf<String, Int>()

    results.forEachIndexed{index, i ->
        if(i == 0){
            val team = competitions[index][1]
            if(winner.containsKey(team)){
                winner[team] = winner.getValue(team) + 3
            }else{
                winner[team] = 3
            }

        }else{
            val team = competitions[index][0]
            if(winner.containsKey(team)) {
                val points = winner.getValue(team) + 3
                winner[team] = points
            }else{
                winner[team] = 3
            }

        }
    }


    var mx = winner.maxByOrNull {
       it.key
    }

    println(mx)
}