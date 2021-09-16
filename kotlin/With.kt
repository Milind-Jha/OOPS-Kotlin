fun main(){
    val person = Person()       // MEthod 1 Create object of class Persen then use
    with(person){
        firstname ="John"
        lastname = "Smith"
        age=32
        prntdetails()
    }
    person.prntdetails()
    
    with(Person()){             // MEthod 2 Create object of class Persen inside with
        firstname="John"
        lastname="Doe"
        age=24
        prntdetails()
    }
}
class Person{
    var age:Int =0
    var firstname = ""
    var lastname = ""
    fun prntdetails(){
        println("Name : $firstname $lastname \nAge : $age")
    }
}