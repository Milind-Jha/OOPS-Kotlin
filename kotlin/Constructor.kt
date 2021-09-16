fun main(args:Array<String>) {
//    val mycar = Car2(250, "Mautang")

    val car = Car3()
    val ford =Car3("Figo")
    val ferrari = Car3("Ferrari",200)

    println(car.model + car.topspeed)
    println(ford.model + ford.topspeed)
    println(ferrari.model + ferrari.topspeed)

    val table1 = Table()
    val table2 = Table(4)
    val table3 = Table(4,4)
    table1.printDetails()
    table2.printDetails()
    table3.printDetails()
}
class Car2(var topspeed: Int,var model :String){//Primary constructor

}
class Car3{
    var model :String? = ""
    var topspeed = 100
    constructor(){     //Secondary Constructor
        model = "No model"
        topspeed=150
    }
    constructor(newModel:String){//Secondary Constructor
        model=newModel
    }
    constructor(newModel: String,newSpeed:Int){//Secondary Constructor
        model=newModel
        topspeed= newSpeed
    }
}

class Table{
    var legs =0
    var height : Int? = 0
    constructor(){
        legs =3
        height = 2
    }
    constructor(legs:Int){
        this.legs=legs
        height = 3
    }
    constructor(legs: Int,height:Int){
        this.height=height
        this.legs=legs
    }
    fun printDetails(){
        println("The table has ${legs} legs and height is ${height} feet")
    }
}