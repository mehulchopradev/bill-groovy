def getDetails(name, gender, roll, marks) {
    "Name: ${name}\nGender: ${gender}\nRoll: ${roll}\nMarks: ${marks}"
}

def getGrade(marks){
    switch(marks) {
        case 70..100: 'A'
            break
        case 60..<70: 'B'
            break
        case 40..<60: 'C'
            break
        case 0..<40: 'F'
            break
        default: 'I'
    }
}

def name = 'mehul chopra'
def gender = 'm'
def roll = 10
def marks = 56

def o = getDetails name, gender, roll, marks
println o

def g = getGrade marks
println g