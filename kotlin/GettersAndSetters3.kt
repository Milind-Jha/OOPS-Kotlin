fun main(){
    val cx1 = Bank()
    cx1.balance = 500.0
    cx1.print()
    val cx2 = Bank()
    cx2.balance = 5000.0
    cx2.print()
    cx2.balance = 12000.0
    cx2.print()
}
class Bank{
    var interest  = 0.0
    var balance   = 0.0
        get() = field
        set(value) {
            if (value > 0.0 && value<= 999.0){
                interest = 0.1
            }
            else if(value >=1000.0 && value <=9999.0){
                interest = 0.5
            }
            else if(value>9999.0){
                interest = 0.2
            }
            field = value
        }
        fun print(){
            println("Balance : $balance Intrest = $interest")
        }
}