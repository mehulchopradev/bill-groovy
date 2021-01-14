package xyz.supercoders.college.domain

// CollegeUser -> Object (Single inheritance)
class CollegeUser extends Object { // every class implicitly inherits from the class Object (java.lang)
    String name
    Character gender

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

    String toString() {
        "Name: ${this.name}\nGender: ${this.gender}\n"
    }

    String getDetails() {
        // this - Professor object
        // this - Student object
        // this - sub class object of CollegeUser
        "Name: ${this.name}\nGender: ${this.gender}\n"
    }
}