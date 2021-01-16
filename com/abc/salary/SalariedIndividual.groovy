package com.abc.salary

// before java 8
// an interface is an 100% abstract class (all methods in an interface were suppose to be abstract)
// an interface cannot have any constructor
/* interface SalariedIndividual {
    Integer getNoOfDays()

    Integer getCostPerDay()
} */


// traits
trait SalariedIndividual {
    abstract Integer getNoOfDays()

    abstract Integer getCostPerDay()

    // in a trait we can even define non abstract methods that can be inherited further
    Double compute() {
        // do all the below only if obj is an instance of SalariedIndividual
            // obj -> get no of days from whichever compatible object -> a
            // obj -> get the cost per day from whichever compatible object -> b
            // salary without tax cut -> b * a -> c
            // tax on salary -> 0.075  * c -> d
            // final sal -> c - d - 100
        
        if (this instanceof SalariedIndividual) {
            def a = this.getNoOfDays()
            def b = this.getCostPerDay()

            def c = b * a
            def d = 0.075 * c
            c - d - 100
        } else {
            println "Please inherit from com.abc.salary.SalariedIndividual in order to compute salary"
        }
    }
}