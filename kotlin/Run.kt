fun main(){
    val resturant = Resturant().run {                   //MEthod: 1
        items.add("Paneer Butter Masala")
        items.add("Gobi Manchurian")
        items.add("Malai Kofta")
        special = "Veg Hara Bhara"
        printMenu()
        this
    }
    println(resturant)      //Address of resturant object
    run {
        val resturant = Resturant()
        resturant.items.add("Paneer Butter Masala")
        resturant.items.add("Gobi Manchurian")
        resturant.items.add("Malai Kofta")
        resturant.special = "Veg Hara Bhara"
        resturant.printMenu()
        //      this        ERROR
    }
}
class Resturant{
    var items = arrayListOf<String>()
    var special = ""
    fun printMenu(){
        println("Items : ")
        items.forEach{
            println(it)
        }
        println("Special : $special")
    }

}