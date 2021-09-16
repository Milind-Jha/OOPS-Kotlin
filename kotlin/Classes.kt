fun main(){
//    val myCar = Car()
//    val yourCar:Car = Car()
//
//    myCar.model = "Toyota"
//    yourCar.model = "Ford"
//    println(myCar.model)
//    println(yourCar.model)
//    myCar.start()
//    yourCar.driveSpeed(25)

    val deer = Animal()
    deer.run()
    val tiger = Animal()
    tiger.run(100)
}

class Car(){
    var model:String? = null
    var topspeed = 100
    fun start(){
        println("Starting the car ")
    }
    fun driveSpeed(speed: Int){
        println("Drive at a speed of $speed")
    }
}

class Animal(){
    fun run(topspeed: Int =50){
        println("The top speed of the animal is : $topspeed")
    }
}