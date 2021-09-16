fun main(){
    val Account = Bank2()
    Account.print()
    Account.account=300
    Account.print()
    Account.account=200
    Account.print()
    Account.account=400
    Account.print()
    Account.account=600
    Account.print()

}
class Bank2 {
    var creditRating = 500
    var account:Int =0
        get() = field          //Backing field to get value
        set(value) {
            if(account<value){
                creditRating++
            }
            else{
                creditRating--
            }
            field = value       //Backing field to store value

        }
    fun print(){
        println("New Rating $creditRating")
        println("Acconut balance : $account")
    }
}