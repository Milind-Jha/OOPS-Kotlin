fun main(){
//    val animals = arrayListOf<String?>()
//    for (i in 1..3){
//        val input = readLine()
//        input.let {
//            if (it==""){
//                animals.add(null)
//            }
//            else{
//                animals.add(it)
//            }
//        }
//    }
//    animals.forEach{
//        if (it != null)
//        println("Feeding the $it")
//        else
//            println("No animal")
//    }

    val people = arrayListOf<String?>()
    while (true){
        print("Enter your name  : ")
        val input = readLine()
        if(input =="stop") break
        input?.let {
            if (it == "")
                people.add(null)
            else
                people.add(it)
        }
    }
    people.forEach{
        println("Hello $it")

    }
}