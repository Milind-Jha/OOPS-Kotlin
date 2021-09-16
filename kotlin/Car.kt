fun main(){
    val garage = Garage()
    garage.mycar.drive()
}
class MyCar {
    fun drive(){
        println("I am driving my car.")
    }
}
class Garage{
    val  mycar = MyCar()

}