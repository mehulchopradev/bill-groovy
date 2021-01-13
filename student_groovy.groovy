import xyz.supercoders.college.domain.Student

//
println Student.count

def s1 = new Student()

s1.roll = -34
// Internally
// s1.setRoll(-34)
// Student.setRoll(s1, -34)

// s1.roll = 45
// Internally
// s1.setRoll(45)

s1.gender = 't'
// s1.setGender('t')

println s1.name
// println s1.getName()

println s1.getDetails()

println Student.count

// def s2 = new Student([name: 'mehul', gender: 'm', roll: 10, marks: 90])
def s2 = new Student(marks: 90, name: 'mehul', gender: 't', roll: 10)

/* println s1.name
println s2.name
println s2.roll */

println s2.getDetails()
println s2.getGrade()

println s2.name // give the name in upper case
// Internally
// println s2.getName()
// println Student.getName(s2)

// 
println Student.count

// Called the method directly on the class
// static methods in a class
def s3 = Student.newInstance('jane', 'f', 14, 98)
println s3.getDetails()