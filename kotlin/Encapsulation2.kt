fun main(){
    val myresturant = Franchise()
    myresturant.prepareBurgers() 
}

open class OriginalResturant{
    protected fun applyformula():String="Prepare burgers"
}
class Franchise :OriginalResturant(){
    fun prepareBurgers(){
        println("Preparing burgers")
        println(applyformula())
    }
}