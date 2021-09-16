fun main(){
    val pug = Pug()
    pug.run()
    pug.play()
    pug.bark()

    val bosch:Cook= Bosch()
    bosch.CookingSpeed()
    bosch.Cooking()
    bosch.TopTemprature()
}
abstract class Dog1{
    open fun bark(){
        println("bark")
    }
    open fun play(){
        println("play")
    }
    open fun run(){
        println("run")
    }
}
class Pug : Dog1(){

    override fun bark() {
        println("Cannot bark")
    }
}
class BassetHound : Dog1(){

    override fun run() {
        println("Cannot run")
    }
}
class Chihuahua : Dog1(){

    override fun play() {
        println("Cannot play")
    }
}
abstract class Cook{
    abstract fun CookingSpeed()
    abstract fun TopTemprature()
    abstract fun Cooking()
}
class Bosch : Cook(){
    override fun CookingSpeed() {
        println("average cooking speed bosch")
    }

    override fun TopTemprature() {
        println("High cooking temp bosch")
    }

    override fun Cooking() {
        println("Start Cooking")
    }
}
class Roaster : Cook(){
    override fun CookingSpeed() {
        println("Average cooking speed roaster")
    }

    override fun TopTemprature() {
        println("Average cooking temp Roaster")
    }

    override fun Cooking() {
        println("Its does not cook. Ir roasts")
    }
}
