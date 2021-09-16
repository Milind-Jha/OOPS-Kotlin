fun main(){
    val laptop = Laptop2("windows")
    val laptop2 = Laptop2("linux")

    val webBrowser = WebBrowser()
}
class Laptop2(val os : String){
    init {
        println("Installing the Operating System $os")
    }
}
class WebBrowser{
    init {
        println("Displaying HomePage")
    }
}