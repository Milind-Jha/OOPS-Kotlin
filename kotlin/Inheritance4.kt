fun main(){
    val parakeet = Parakeet()
    parakeet.flightInfo()

    val son = Son()
    son.name()
}
open class Bird{
    open val color : String ="Black"
    open val speed= 20
    open fun flightInfo(){
        println("Bird has ${color} and flies at ${speed}")
    }
}
class Parakeet : Bird(){
    override val color: String="Blue"
    override val speed: Int = 45
    override fun flightInfo() {
        super.flightInfo()
        println("Bird has ${super.color} and flies at ${super.speed}")
    }
}
open class Father{
    open val firstName :String="Micheal"
    val lastname : String = "Keaton"
    open fun name(){
        println("Name is : $firstName $lastname")
    }
}
class Son : Father(){
    override val firstName: String = "Jacob"
    override fun name() {
        super.name()
        println("Father's name : ${super.firstName} $lastname")
    }
}