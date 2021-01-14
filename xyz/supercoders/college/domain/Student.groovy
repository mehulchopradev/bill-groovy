package xyz.supercoders.college.domain

// groovy bean

// for every class also, there is a object created
// String -> object (Class)
// Integer -> object (Class)
// Student -> object (Class) 1 per class
    // attributes (class attributes)
    // attributes get shared amongst all the objects of the Student class
    // common shareable area of the memory

// Student IS-A CollegeUser
// Student child class of the parent class CollegeUser
// Student concrete class - CollegeUser base class
// Student -> CollegeUser -> Object (Multilevel inheritance)
class Student extends CollegeUser {

    // instance (object) attributes
    Integer roll
    Float marks

    // static attributes are accessed directly using the class name
    static Integer count = 0

    Student() {
        Student.count += 1
    }

    // every groovy class gets this constructor apart from the default no argument constructor
    /* Student(Map props) {
        this(); // automatically put by the java compiler
        this.name = props.name // this.setName(props.name)
        this.gender = props.gender // this.setGender(props.gender)
        this.roll = props.roll // this.setRoll(props.roll)
        this.marks = props.marks // this.setMarks(props.marks)
    } */

    /*
        Student() {
        }
    */

    // setter methods, we get by default in groovy bean for every attribute of the object
    /* def setRoll(Integer roll) {
        this.roll = roll
    } */

    // encapsulation (on-demand)
    def setRoll(Integer roll) {
        if (roll >= 0) {
            this.roll = roll;
        } else {
            this.roll = null;
        }
    }

    // instance method
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

    // redefines the super class method in its own class
    // Method overriding
    String getDetails() {
        "${super.getDetails()}Roll: ${this.roll}"    
    }

    // static method
    static def newInstance(name, gender, roll, marks) {
        // there is `this` in a static method but it is the Class object of the student class
        println this
        new Student(name: name, gender: gender, roll: roll, marks: marks)
    }
}