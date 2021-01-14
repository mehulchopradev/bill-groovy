import xyz.supercoders.college.domain.Professor
import xyz.supercoders.college.domain.Student

def p1 = new Professor(name: 'mehul', gender: 'm', subjects: ['Physics', 'Chemistry'])
// println p1.getDetails()
// Internally
// println Professor.getDetails(p1)

def s1 = new Student(name: 'jane', roll: 10, gender: 'm', marks: 90)
// println s1.getDetails()
// Internally
// println Student.getDetails(s1)

// println p1.name
// println s1.name

def i = 10

println i
// Internally
// println i.toString()
// println Integer.toString(i)

println p1
// Internally
// println p1.toString()
// println Professor.toString(p1)

println s1