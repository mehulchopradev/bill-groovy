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
println smap

// find all students from the map who are males
def males = smap.findAll { roll, student -> student.gender == 'm' }
println males

// find all students from the map who are females
def females = smap.findAll { it.value.gender == 'f' }
println females

// get a new map from smap, where key is roll and value is name of the student
def nsmap = smap.collectEntries { roll, student -> [roll, student.name] }
println nsmap