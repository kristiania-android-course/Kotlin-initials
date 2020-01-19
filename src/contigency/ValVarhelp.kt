package contigency

import java.lang.Exception

fun main(args: Array<String>){
    /*println("Hello world")*/

    // properties : Val and Var
    // valn


    val name: String = "Arun"

    /*
    varm
    var mutableName: String = "Imran"
    mutableName = ""*/



    // null handling

    /*var mutableName: String? = "Imran"

    mutableName = null*/


    // Type Inference


    /*val mutableName = "Imran"
    mutableName = 1*/


    // String handling
    // jgreet

    /*val greet = "hei there , ${name.toUpperCase()}"
    println(greet)*/




    // expressions
    //jx
    //kx

    val speed = 20
    val speedLimit = 40

    val result = if (speed < speedLimit) {
        "Good driver"
    } else {
        "bad driver"
    }

    println(result)


}


