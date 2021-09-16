fun main(){

    println(DataBaseAccess.connected) // no need to create object
    DataBaseAccess.connected()
    println(DataBaseAccess.connected)
    DataBaseAccess.disconnected()
    println(DataBaseAccess.connected)
}
object DataBaseAccess{
    var connected = false
    fun connected(){
        connected =  true
        println("You are connedted")
    }
    fun disconnected(){
        connected= false
        println("You have been disconnected")
    }
}
