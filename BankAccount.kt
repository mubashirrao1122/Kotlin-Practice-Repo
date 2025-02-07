package com.example.kotlinbasic

            data class BankAccount(var holderName: String, var balance: Double) {
                private val transactions = mutableListOf<String>()

                /**
                 * Deposits the specified amount into the account.
                 * @param amount The amount to deposit.
                 */
                fun deposit(amount: Double) {
                    if (amount > 0) {
                        balance += amount
                        transactions.add("$holderName deposited the amount $$amount. Total Balance is $balance")
                    } else {
                        println("Please enter an amount greater than zero")
                    }
                }

                /**
                 * Withdraws the specified amount from the account.
                 * @param amount The amount to withdraw.
                 */
                fun withdraw(amount: Double) {
                    if (amount > 0 && balance >= amount) {
                        balance -= amount
                        transactions.add("$holderName withdrew the amount $$amount. Total Balance is $balance")
                    } else {
                        println("Insufficient balance or invalid amount")
                    }
                }

                /**
                 * Displays the transaction history.
                 */
                fun displayTransactionHistory() {
                    for (item in transactions) {
                        println(item)
                    }
                }
                /**
                 * Returns the current balance of the account.
                 */
                fun acctBalance(): Double {
                    return balance
                }
            }
