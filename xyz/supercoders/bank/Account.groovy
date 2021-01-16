package xyz.supercoders.bank

import xyz.supercoders.bank.exceptions.MinBalNotMaintainedException

class Account {
    String accNumber
    String accType
    Double accBalance

    static final Integer MIN_ACC_BALANCE = 1_000

    def deposit(Double amt) {
        this.accBalance += amt
    }

    def plus(Double amt) {
        this.deposit amt
    }

    def minus(Double amt) {
        this.withdraw amt
    }

    def withdraw(Double amt) {
        println "Transaction starts..."
        try {
            if (amt <= 0) {
                throw new IllegalArgumentException('Amt to withdraw must be positive and non zero')
            }
            if (this.accBalance - amt < Account.MIN_ACC_BALANCE) {
                // throw an Exception to whoever is the caller
                // throw <<exception class object>>
                // IllegalStateException class
                // throw new IllegalStateException('Cannot perform withdrawl as min bal not being maintained')
                throw new MinBalNotMaintainedException('Cannot perform withdrawl as min bal not being maintained')
            }

            this.accBalance -= amt
        } finally {
            // these set of statements will always execute come what may happens in the corresponding try block
            println 'Transaction ends.'
        }
    }
}