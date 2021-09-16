fun main(){
    val math = Math()
    println(math.add(5,3))
    println(math.Sub(5,3))
    println(math.Mul(5,3))
    println(math.Div(5,3))

}
class Math{
    fun add(num1:Int, num2:Int): Int{
        return num1+num2
    }
    fun Sub(num1:Int, num2:Int): Int{
        return num1-num2
    }
    fun Mul(num1:Int, num2:Int): Int{
        return num1*num2
    }
    fun Div(num1:Int, num2:Int): Double{
        return num1.toDouble()/num2
    }
}