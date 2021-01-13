import xyz.supercoders.college.domain.StudentOld as Student

def studentList = [
    new Student('mehul', 'm' as Character, 10, 90),
    new Student('jane', 'f' as Character, 1, 97),
    new Student('jill', 'f' as Character, 13, 85),
    new Student('bill', 'm' as Character, 20, 99)
]

// index
/* def smap = [
    10: studentList[0],
    1: studentList[1],
    13: studentList[2],
    20: studentList[3]
] */

def smap = studentList.collectEntries { [it.roll, it] }

def scanner = new Scanner(System.in)
println 'please enter roll number to search: '
roll = scanner.nextInt()

/* Student searchedStudent = studentList.find { Student student -> student.roll == roll }
// def searchedStudent = studentList.find { it.roll == roll }
if (searchedStudent) {
    println searchedStudent.getDetails()
} else {
    println 'Student not found'
} */

Student searchedStudent = smap[roll]
if (searchedStudent) {
    println searchedStudent.getDetails()
} else {
    println 'Student not found'
}

