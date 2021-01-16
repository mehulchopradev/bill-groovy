import xyz.supercoders.college.domain.Professor
import xyz.supercoders.college.domain.Student
import xyz.supercoders.college.domain.CollegeUser

// import com.abc.salary.SalaryProcessor

final def p1 = new Professor(name: 'mehul', gender: 'm', subjects: ['Physics', 'Chemistry'], noOfDaysWorked: 20, costPerDay: 10000)
p1.subjects << 'Math' // valid inspite of p1 being final
// println p1.getDetails()
// Internally
// println Professor.getDetails(p1)

// println(SalaryProcessor.compute p1)

println p1.compute()

def s1 = new Student(name: 'jane', roll: 10, gender: 'm', marks: 90)
// println s1.getDetails()
// Internally
// println Student.getDetails(s1)

println p1.name
println s1.name

// p1 is final
// p1 = "abc"

final def i = 10

println i
// Internally
// println i.toString()
// println Integer.toString(i)

println p1
// Internally
// println p1.toString()
// println Professor.toString(p1)

println s1

// cannot create an object of an abstract class
// def c = new CollegeUser()
// println c

// a final class cannot be extended further
/* class Dummy extends Student {

} */


println p1.getDetails()

def p2 = new Professor(name: 'jill', gender: 'f', noOfDaysWorked: 20, costPerDay: 20000)
p2 << 'Maths' << 'Chemistry'
// Internally
// p2.leftShift('Maths')

// println p2.subjects

// wanna know whether the professor teaches Chemistry
// println(p2.subjects.contains 'Chemistry')

println('Chemistry' in p2)
// Internally
// p2.isCase('Chemistry')
println('Physics' in p2)