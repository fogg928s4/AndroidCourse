package me.dumbtest.kt_basics.day4.bank

class bankAcc(var holder:String, var balance:  Double) {
    //a mutable list of list
    private val transHistory = mutableListOf<String>()

    //common actions on accounts
    fun deposit(amount: Double){
        balance += amount
        println("Your new balance is \$ $balance \n\n")
        transHistory.add("Deposit of \$ $amount ~ \$ $balance")
    }
    //return false on failure and true on success
    fun withdraw(amount: Double) : Boolean{
        if(amount > balance){
            println("You don't have sufficient funds\n\n")
            return false
        }
        else {
            balance -= amount
            println("Your new balance is \$ $balance \n\n")
            transHistory.add("Withdrawal of \$ $amount ~ \$ $balance")
            return true
        }
    }

    //just show the list of the Transaction history
    fun showTransHistory(){
        //first check if they've done anything
        if(transHistory.isEmpty()){
            println("There is nothing to see here...\n\n")
        }
        else{
            println("Now showing transaction history for $holder ...")
            for(i in 0 until transHistory.size)
                println("${i+1} - ${transHistory[i]}")
            print("\n\n")
        }
    }
}