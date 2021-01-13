package xyz.supercoders.college.domain

// groovy bean

// for every class also, there is a object created
// String -> object (Class)
// Integer -> object (Class)
// Student -> object (Class) 1 per class
    // attributes (class attributes)
    // attributes get shared amongst all the objects of the Student class
    // common shareable area of the memory
class Student {

    // instance (object) attributes
    String name
    Character gender
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

    def setGender(Character gender) {
        if (gender == 'm' || gender == 'f') {
            this.gender = gender;
        } else {
            this.gender = null;
        }
    }

    // getter methods, we get by default in groovy bean for every attribute of the object
    /* def getName() {
        this.name
    } */

    def getName() {
        // ?. null safe object navigation operator
        this.name?.toUpperCase()
    }

    String getDetails() {
        // this becomes an implicit variable
        // this current object
        // println this

        // does not use getName()
        "Name: ${this.name}\nGender: ${this.gender}\nRoll: ${this.roll}\nMarks: ${this.marks}"
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

    // static method
    static def newInstance(name, gender, roll, marks) {
        // there is `this` in a static method but it is the Class object of the student class
        println this
        new Student(name: name, gender: gender, roll: roll, marks: marks)
    }
}