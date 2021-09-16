fun main(args: Array<String>){
    val tv = TV()
    tv.GetChannelID("Sony")
    tv.GetChannelID("Zee",true)
    tv.GetChannelID("Sony",23)


}
class TV{
    fun GetChannelID(channel:String){
        println("Regular broadcast for $channel")
    }
    fun GetChannelID(channel: String,subtitles:Boolean){
        println("Regular broadcast for $channel + sobtitles on : $subtitles")
    }
    fun GetChannelID(channel: String,time :Int){
        if (time>23){
            println("Invalid Time")
        }
        else
        println("Program at $time hrs at channel$channel is jlo3hnrgol")
    }
}