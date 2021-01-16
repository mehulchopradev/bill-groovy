package xyz.supercoders.college.domain

import com.abc.salary.SalariedIndividual

// Professor IS-A CollegeUser

// in Java, a class can extend from only one class at a time!

// a class can implement more than 1 interface at a time
// a class in groovy can implement more than 1 trait at a time
class Professor extends CollegeUser implements SalariedIndividual {
    ArrayList subjects

    Integer noOfDaysWorked

    Integer costPerDay

    Integer getNoOfDays() {
        this.noOfDaysWorked
    }

    Integer getCostPerDay() {
        this.costPerDay
    }

    def leftShift(String subject) {
        if (!this.subjects) {
            this.subjects = []
        }

        this.subjects << subject
        this
    }

    def isCase(String subject) {
        this.subjects.contains subject
    }
}