package xyz.supercoders.college.domain

// You
class StudentOld {
    String name
    Character gender
    Integer roll
    Float marks

    /*
        // default
        // constructor
        StudentOld(this) {

        }
    */

    StudentOld(String name, Character gender, Integer roll, Float marks) {
        // this - current object
        this.name = name
        this.gender = gender
        this.roll = roll
        this.marks = marks
    }

    /*
        StudentOld(name, gender, roll, marks, this) {

        }
    */

    String getDetails() {
        // this becomes an implicit variable
        // this current object
        // println this
        "Name: ${this.name}\nGender: ${this.gender}\nRoll: ${this.roll}\nMarks: ${this.marks}"
    }

    // Internally
    /*
    def getDetails(this) {
        // this <-> s1
        // this <-> s2
        // this <-> current object
        println this

        "Name: ${this.name}\nGender: ${this.gender}\nRoll: ${this.roll}\nMarks: ${this.marks}"
    }
    */

    Character getGrade() {
        switch(this.marks) {
            case 70.0..100.0: 'A'
                break
            case 60.0..<70.0: 'B'
                break
            case 40.0..<60.0: 'C'
                break
            case 0.0..<40.0: 'F'
                break
            default: 'I'
        }
    }
}