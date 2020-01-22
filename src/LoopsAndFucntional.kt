fun main(arg: Array<String>){

    // for loops  0 to 10 includes 10
    for (i: Int in 0 until 10){
        println(i)
    }
    //  until 10



    // iterate over list
    //klist

    val list: List<Int> = mutableListOf<Int>(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)

    for (value in list){
        println(value)
    }

    list.forEach { value ->
        println(value)
    }

    // filter map reduce

    val map = HashMap<String, Int>()
    map["One"] = 1
    map["Two"] = 2

    for ((key, value) in map) {
        println("$key = $value")
    }

    map.forEach { (key, value) ->
        println("$key = $value")
    }

    // Hash map
    //kmap



}