fun main(arg: Array<String>){

    // for loops  0 to 10 includes 10

    for (i: Int in 0..10){
        println(i)
    }

    //  until 10

    for (i:Int in 0 until 10){
        println(i)
    }

    // iterate over list
    //klist
    val list: List<Int> = mutableListOf<Int>(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)

    for (value in list){
        println(value)
    }

    // filter map reduce

    println(list.filter { it < 5 })

    // Hash map




}