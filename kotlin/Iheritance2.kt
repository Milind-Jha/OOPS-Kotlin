fun main(){

    val apple =Apple()
    apple.screensize =13
    val  msi= Msi()
    msi.run()
    println(msi.graphics)
    apple.run()
    

}

open class Laptop{
    var screensize=15
    var speed = 1.7

    fun run(){
        println("Screen size : ${screensize}")
        println("speed : ${speed} TFlops")

    }
}
class Apple:Laptop() {

}
class  Msi:Laptop(){
    var graphics = "RTX 3050"
}