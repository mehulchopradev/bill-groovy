package com.abc.salary

class SalaryProcessor {
    static Double compute(obj) {
        // do all the below only if obj is an instance of SalariedIndividual
            // obj -> get no of days from whichever compatible object -> a
            // obj -> get the cost per day from whichever compatible object -> b
            // salary without tax cut -> b * a -> c
            // tax on salary -> 0.075  * c -> d
            // final sal -> c - d - 100
        
        if (obj instanceof SalariedIndividual) {
            def a = obj.getNoOfDays()
            def b = obj.getCostPerDay()

            def c = b * a
            def d = 0.075 * c
            c - d - 100
        } else {
            println "Please inherit from com.abc.salary.SalariedIndividual in order to compute salary"
        }
    }
}