fun main(){
  val fastFoodResturant = FastFoodResturant()
  val frenchFoodResturant = FrenchFoodResturant()
  val frenchFood =  frenchFoodResturant.placeOrder()
  val fastFood = fastFoodResturant.placeOrder()
  fastFood.Feed()
  fastFood.delight()
  frenchFood.Feed()
  frenchFood.delight()
}
interface Food{
    fun Feed()
    fun delight()
}
class FastFood:Food{
    override fun Feed() {
        println("Ate food at a fast food resturant")
    }

    override fun delight() {

    }

}
class FrenchFood:Food{
    override fun Feed() {
        println("Ate food at a French resturant")
    }

    override fun delight() {
        println("Delighted by the french food resturant")
    }

}
class FastFoodResturant{

    fun placeOrder():Food {
        return FastFood()
    }
}
class FrenchFoodResturant{
    fun placeOrder():Food{
        return FrenchFood()
    }
}