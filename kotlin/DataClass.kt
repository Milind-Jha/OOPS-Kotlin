data class User(val id : Long,val name: String){         // Atleast 1 parameter needs to be called in the constructor                                                         // Cannot be open or abstract

}

data class User1(val id:Long){
    var name: String =""
    var email: String =""
    var password:String = ""
    fun print(){
        println("$id $name $email $password")
    }

}
fun main(){
        val user2= User1(3211)
        user2.name="Micky"
        user2.print()
//    val user1 = User(1,"Mark")
//    println(user1.name)
//    println(user1.id)
//    val (userId,username)= user1
//    println(userId)
//    println(username)
//    val num = 20
//    val num2: String = num.toString()
//    println(num2)

    val numbers = arrayListOf<Double>()
    var total =0.0
    for (i in 1..5){
        val number = readLine()?:""
        val num2 = number.toDouble()
        numbers.add(num2)
        total+=num2
    }
    println(total/5)

}