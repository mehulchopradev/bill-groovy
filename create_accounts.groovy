import xyz.supercoders.bank.Account
import xyz.supercoders.bank.exceptions.MinBalNotMaintainedException

def a1 = new Account(accNumber: 'A00123', accType: 'Savings', accBalance: 10_000)
// println(a1.deposit 2_000)

println(a1 + 2_000) // operator overloading
// Internally
// println(a1.plus(2_000))

try {
    // println(a1.withdraw(1_000))
    println(a1 - 1_000) // a1.minus(1_000)
} catch(IllegalStateException e) {
    println e.message
    e.printStackTrace();
} catch (IllegalArgumentException e) {
    println e.message
    throw e // rethrow to ur caller, after catching it
} catch (MinBalNotMaintainedException e) { 
    println e.message
}