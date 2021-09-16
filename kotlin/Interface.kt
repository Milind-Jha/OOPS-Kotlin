fun main(){
    val child= Child()
    child.raisePuppy()
}
interface Pet{
    val cuteness:Int
    fun play()
    fun feed()
}
class Puppy:Pet{
    override val cuteness: Int =10


    override fun play() {
        println("Playing with puppy of cuteness $cuteness")
    }

    override fun feed() {
        println("Feeding the puppy")
    }

}
class Child{

    val myPet:Pet
    init {
        val petStore = PetStore()
        myPet=petStore.givePet()
    }
    fun raisePuppy(){
        myPet.play()
        myPet.feed()
    }
}
class PetStore{
    fun givePet():Pet{
        return Puppy()
    }
}