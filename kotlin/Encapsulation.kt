fun main(){
    val lock = EncryptionLock(40)

    println("Trying to unlock with 45 : ${lock.Unlock(45)}")
    println("Trying to unlock with 40 : ${lock.Unlock(40)}")
    println("Trying to unlock with 35 : ${lock.Unlock(35)}")
    println("Trying to unlock with 25 : ${lock.Unlock(25)}")
}
class EncryptionLock( private var privatekey : Int) {

    public fun Unlock(publicKey:Int)=formula(publicKey)==privatekey  // 35 + 5 = 40 == 40

    private fun formula(publicKey: Int)=publicKey+5

}