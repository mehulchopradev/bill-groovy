package xyz.supercoders.bank.exceptions

class MinBalNotMaintainedException extends Exception {

    MinBalNotMaintainedException(String message) {
        super(message) // calls the Exception class constructor that takes in a String message
    }
}