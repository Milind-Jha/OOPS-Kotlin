fun main(){
//  println(Cars.driveSafe()) // No need to create object
//  Cars.safety()             // No need to create object
//  val c2 = Cars()
//  c2.speedometer(35)    //need to create object to call speedometer function
    KotlinCourse.welcome()
    val kotlinCourse =KotlinCourse()
    kotlinCourse.display()
}
class Cars{
    companion object{
        fun driveSafe():String{
            return "drive safe"
        }
        fun safety()= println("Put on seatbelt")
    }
    fun speedometer(speed : Int){
        println("Your current speed is $speed")
    }
}
class KotlinCourse{
    fun display(){
        println("Kotlin Programming lesson1")
    }
    companion object{
        fun welcome(){
            println("Welcome to Kotlin class ")
        }
    }
}