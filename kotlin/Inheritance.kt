fun main(){

    val mydog = Corgi()
    mydog.size =10
    mydog.bark()
    mydog.play()
    println("Size ${mydog.size}")
}

open class Dog{
    var size =0
    fun bark(){
        println("Bark")
    }
    fun play(){
        println("Play")
    }

}
class Corgi :Dog(){

}