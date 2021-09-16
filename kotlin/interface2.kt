import kotlin.random.Random

interface Coffee{
    fun wakwUp()
    fun thirstQuenching()
}
class Arabica:Coffee{
    override fun wakwUp() {
        println("Waking you up with arabica")
    }

    override fun thirstQuenching() {
        println("quenching your arabica thirst")
    }

}
class Robusta:Coffee{
    override fun wakwUp() {
        println("Waking you up with robusta")
    }

    override fun thirstQuenching() {
        println("quenching your robusta thirst")
    }

}
class CoffeeShop{
    fun pursbhaseCoffee():Coffee{   // Can return a class that implements coffee interface
        val random = Random.nextBoolean()
        if(random)
            return Arabica()
        else
            return Robusta()
    }
}

fun main(ars : Array<String>){
    val shop = CoffeeShop()
    var order1: Coffee? = null
    order1 = shop.pursbhaseCoffee()
    val order2: Coffee = shop.pursbhaseCoffee()
    order1.wakwUp()
    order1.thirstQuenching()
    order2.wakwUp()
    order2.thirstQuenching()
}