interface Oven{
    val temprature: Int     //Not used to declare val generally

    fun turnOn()
    fun turnOff()
    fun Cook(){
        println("Cooking at a temprature of $temprature")
    }
}
class Bosch2(temp:Int) : Oven{
    override val temprature: Int=temp
    override fun turnOff() {
        println("Turn off")
    }

    override fun turnOn() {
        println("Turn On")
    }
}
fun getOven():Bosch2{
    return Bosch2(200)
}
fun main(){
    val oven:Oven? = null   //No constructor available in interface

    val myOven:Oven = Bosch2(100)
    myOven.turnOff()
    myOven.Cook()
    myOven.turnOff()

    val myBosch:Bosch2 = Bosch2(150)
    myBosch.turnOn()
    myBosch.Cook()
    myBosch.turnOff()

    val myBosch2 = getOven()
    myBosch2.turnOn()
    myBosch2.Cook()
    myBosch2.turnOff()

}