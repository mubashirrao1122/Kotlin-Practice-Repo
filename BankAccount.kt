package com.example.kotlinbasic

fun main() {
    var account = BankAccount("Mubashir Rao", 1000.0)

    account.deposit(500.0)
    account.withdraw(200.0)
    account.displayTransactionHistory()
    println("${account.holderName}'s balance is ${account.acctBalance()}")

    account = BankAccount("Saim Rao", 0.0)

    account.deposit(100.0)
    account.withdraw(10.0)
    account.deposit(300.0)
    account.displayTransactionHistory()
    println("${account.holderName}'s balance is ${account.acctBalance()}")


}
