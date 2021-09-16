fun main(){
    val onlineStoreUser1 = OnlineStoreUser()
    val onlineStoreUser2 = OnlineStoreUser(45)
    val onlineStoreUser3 = OnlineStoreUser(60,"Micky")
}
class OnlineStoreUser{
    var name:String = "Guest User"
    var balance = 10

    constructor(){
        if (balance>20){
            println("$name can afford ${balance/20} shirts")
        }
        else{
            println("$name can not afford any shirts")
        }
    }
    constructor(balance : Int){
        this.balance=balance
        if (balance>20){
            println("$name can afford ${balance/20} shirts")
        }
        else{
            println("$name can not afford any shirts")
        }
    }
    constructor(balance: Int,name: String){
        this.name = name
        this.balance= balance
        if (balance>20){
            println("$name can afford ${balance/20} shirts")
        }
        else{
            println("$name can not afford any shirts")
        }
    }
}