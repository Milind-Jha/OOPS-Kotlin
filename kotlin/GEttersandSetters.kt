fun main(){
    val car = Car4()

    car.speed=100

    println(car.name)  // output High speed car 100
    println(car.speed) // speed output still 50
//
    car.name = "Porshe"
    println(car.name)  // output Porshe
    println(car.speed) // speed output still 50
    


}
class Car4{
    var name = ""
    var speed : Int
        get() = 50
        set(value) {
            name="High speed car $value"
        }
}
