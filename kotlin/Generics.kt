fun main(){
//    val box1 = Box<String>()
//    box1.display("ojndqo")
//
//    val box2 = Box<Car5>()
//    val car5 = Car5()
//    box2.display(car5)

    val  str = Str<Float>()
    str.takeElement(3.45F)
    val str2 = Str<String>()
    str2.takeElement("kjo")
    val str3 = Str<ArrayList<Int>>()
    val arr = arrayListOf<Int>(2,4,1,3,5,6,2,77)
    str3.takeElement(arr)
   

}
class Box<T>{
    fun display(data : T){
        println(data)
    }
}
class Car5{

}

class Str<T>{
    fun takeElement(data:T){
        val ans = data.toString()
        println("$ans ${ans.length}")
    }
}