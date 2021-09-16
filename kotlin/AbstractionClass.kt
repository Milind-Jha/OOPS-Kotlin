fun main(){
//    val container = Container()//NOT ALLOWED BECAUSE CONTAINER IS ABSTACT
      val jug= Jug()
      val bottle=Bottle()
      jug.pour()
      bottle.pour()

      val jug2 = Jug2()
    jug2.pour()
    val bottle2=Bottle2()
    bottle2.pour()
}
abstract class Container{
    fun pour(){
        println("Pouring liquid")
    }
}
class Jug:Container(){

}
class Bottle:Container(){

}

abstract class Container2{
    abstract fun pour()     //NO BODY
}
class Jug2:Container2(){
    override fun pour() {
        println("Pouring from Jug")
    }
}
class Bottle2:Container2(){
    override fun pour() {
        println("Pouring from bottle")
    }
}