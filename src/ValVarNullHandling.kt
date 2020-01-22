import java.lang.Exception

fun main(args: Array<String>){

    // properties : Val and Var
    // valn
   /* val name: String = "Arun"*/

    // varm

    /*var mutableName: String = "Imran"
    mutableName = "Arun"*/

    // null handling
    //varmu
    /*var mutableName: String? = "Imran"
    mutableName = null*/


    // Type Inference
    //valn
    val name = "Arun"


    // String handling
    // jgreet

    val greet = "hei there, ${name.toUpperCase()}"
    println(greet)

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


