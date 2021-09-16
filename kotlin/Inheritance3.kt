fun main(){
    val doctor = Doctor()
    val engineer = Engineer()
    doctor.salary =25000.0
    engineer.salary=30000.0
    doctor.work()
    doctor.growth()
    engineer.work()
    engineer.growth()
    println(doctor.salary)
    println(doctor.revenue)
    println(engineer.salary)
    println(engineer.revenue)
}
open class Job{
    var name = ""
    var salary = 10000.0
    var revenue = 0.0
    fun work(){
        revenue+=salary
    }
    fun growth(){
        salary+= 0.05*salary
    }

}
class Doctor : Job (){

}
class Engineer : Job (){

}