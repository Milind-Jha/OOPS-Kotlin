fun main(){
    val names = listOf("Animals","Cat","Zebra","Dog","Bear")
    names.map { it.length }
        .filter { it>3 }
        .let {
            println(it)
            println(it.size)
        }
    val names2 = listOf("Animals","Cat","Zebra","Dog","Bear")
    names2.map { it.length }
        .filter { it>3 }
        .let { objectforit ->   //name of object in place of it
            println(objectforit)
            println(objectforit.size)
        }
    val names3 = listOf("Animals","Cat","Zebra","Dog","Bear")
    names3.map { it }
        .filter { it.length>3 }
        .let { objForIt ->
            println(objForIt)
            println(objForIt.size)
        }
    names3.map { it.length }
        .filter { it>3 }
        .let (::println)        //::println wil print the entire object once
    names3.map { it }
        .filter { it.length>3 }
        .let (::println)
}