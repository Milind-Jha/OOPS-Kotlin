fun main(){
//    val jetPack=JetPack()
//    jetPack.burn(2)
//    println(jetPack.height)
//    jetPack.stop(2)
//    println(jetPack.height)
//    jetPack.burn(4)
//    println(jetPack.height)

    val calculator = Calculator()
    calculator.add(5)
    calculator.sub(3)
    calculator.product(5)
}
class JetPack {
    var height =0
    fun burn(time : Int){
        height+=time
    }
    fun stop(time : Int){
        height-=(3*time)
        if (height<0){
            height=0
        }
    }
}
class Calculator{
    var total =0.0
    fun add(num:Int){
        println("$total + ${num.toDouble()} = ${total+num}")
        total+=num
    }
    fun sub(num:Int){
        println("$total - $num = ${total-num}")
        total-=num
    }
    fun product(num: Int){
        println("$total * $num = ${total*num}")
        total*=num
    }
    fun reset(){
        total=0.0
    }
}