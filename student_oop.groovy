import xyz.supercoders.college.domain.StudentOld as Student

// Friend
Student s1 = new Student('mehul', 'm' as Character, 10, 78)
// s1 stores the address of the Student object in the RAM
// Internally
// 1. new : reserve space in the RAM - 4005
// 2. Student(4005, 'mehul', 'm', 10, 78)

def s2 = new Student('jane', 'f' as Character, 1, 40)
// Internally
// 1. new : reserve space in the RAM - 4009
// 2. Student(4009)

println s1
println s2

// access (get) the attributes from an object (. operator)
println s1.name
println s2.name
println s1.roll
println s2.roll

// access (set) the attributes values in the object (.operator)
/* s1.name = 'mehul'
s1.gender = 'm'
s1.roll = 10
s1.marks = 78 */

/* s2.name = 'jane'
s2.gender = 'f'
s2.roll = 1
s2.marks = 40 */

println s1.name
println s2.name
println s1.roll
println s2.roll


println s1.getDetails()
// Internally
// Student.getDetails(s1)

println s2.getDetails()
// Internally
// Student.getDetails(s2)

println s1.getGrade()
// Internally
// Student.getGrade(s1)

println s2.getGrade()