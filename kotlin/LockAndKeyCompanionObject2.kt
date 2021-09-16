import kotlin.random.Random

fun main() {
    val correctKey = Lock.createKey()
    val MyLock = Lock(correctKey)
    MyLock.Unlock(correctKey)
    val randomKey = Lock.createKey()
    MyLock.Unlock(randomKey)
}
class Lock(key: Key){
    companion object{
        fun createKey()=Key()

    }
    val secretCode:String
    init {
        secretCode=generateSecret()
        key.secretCode= secretCode
    }

    fun generateSecret():String{
        return Random(System.currentTimeMillis()).nextInt().toString()  //Generete random String
    }
    fun Unlock(key: Key){
        if (key.secretCode==secretCode){
            println("Lock is open")
        }
        else{
            println("Key is not correct")
        }
    }
}
class Key{
    var secretCode :String =""
    set(value){
        if (field == ""){
            field=value         //Key can only be set once
        }
    }
}