data class User(val id : Long,val name: String){         // Atleast 1 parameter needs to be called
                                                         // Cannot be open or abstract
}
fun main(){
    val user1 = User(1,"Mark")
    println(user1.name)
    println(user1.id)
    val (userId,username)= user1
    println(userId)
    println(username)
    val num = 20
    val num2: String = num.toString()
    println(num2)
}