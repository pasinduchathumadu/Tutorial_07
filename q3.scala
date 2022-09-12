object q3 extends App{

    var account1=Bankaccount("Pasindu",20000243,35600.00)
    var account2=Bankaccount("Kalana",20000234,48000.00)


    account2.transfer(account1,10000.00)
    println(account1)
    println(account2)

}
class Bankaccount(ID:String,number:Int,balance:Double){

    var acc_Id = ID
    var acc_number = number
    var acc_balance = balance

    def withdraw(n:Double):Unit={
        this.acc_balance=this.acc_balance-n
    }
    def deposit(n:Double):Unit={
        this.acc_balance=this.acc_balance+n
    }
    def transfer(acc:Bankaccount,n:Double):Unit={
        acc.deposit(n)
        this.withdraw(n)

    }

    override def toString(): String = acc_Id+" "+acc_number+" "+acc_balance


}