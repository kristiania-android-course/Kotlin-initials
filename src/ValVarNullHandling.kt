fun main(args: Array<String>){
    println("Hello world")


    // Val and Var
    val numnber : Int = 10
    println(numnber)
    //numnber = 20  //-:This Wont work because it is  a value and is immutable.

    var varnumber : Int = 20 // You should be ashamed of creating a var always :-)
    varnumber = 25
    println(varnumber)


    // null handling
    val nullableNUmber : Int? = 10
    varnumber = nullableNUmber!!

    // Type Inference

    val name  = "Arun"
    println(name.javaClass)
    //  name = 20 not possible as the compiler already understood the type as string


    // String handling

    println("Hei there, ${name.toUpperCase()}" )

    // expressions

    val speed = 20
    val speedLimit = 40

    val result = if(speed < speedLimit)
       "Good driver"
     else
       "bad driver"

    println(result)

}


