def nos = [5, 6, 3, 7, 8, 4, 5, 7, 6, 2, 9]

// higher order function
def forEach(nos, logic) {
    for(def n in nos) {

        // some logic has to be written which is consumer specific
        logic(n) // call closure
    }
}

println '*********Even nos**************'
// print all even nos from the nos list
/* def printEven(n) {
    if (n % 2 == 0) {
        println n
    }
} */

// Closures (there are very much like functions "that can be passed around" as regular values)

// lower order functions
def printEven = {n ->
    if (n % 2 == 0) {
        println n
    }
}

forEach(nos, printEven) // functional programming
/* for(def n in nos) {

    //
    if (n % 2 == 0) {
        println n
    }
} */

println '*********Odd nos**************'
// print all odd nos more than 5 from the nos list
// forEach(nos, <<pass logic over here>>)
/* for(def n in nos) {

    //
    if (n % 2 && n > 5) {
        println n
    }
} */

/* def printOddMorethan5 = {ele ->
    if (ele % 2 && ele > 5) {
        println ele
    }
} */

/* def printOddMorethan5 = {
    if (it % 2 && it > 5) {
        println it
    }
}
forEach(nos, printOddMorethan5) */

/* forEach(nos, {
    if (it % 2 && it > 5) {
        println it
    }
}) */

// passing code to another code
forEach(nos) {
    if (it % 2 && it > 5) {
        println it
    }
}

// groovy has defined many such higher order functions
println('********** even nos ****************')
nos.each {
    if (it % 2 == 0) {
        println it
    }
}

println '********** odds more than 5 **************'
nos.each {
    if (it % 2 && it > 5) {
        println it
    }
}

// get a new list consisting of even elements more than 3 from the nos list (filtering)
l1 = nos.findAll { it % 2 == 0 && it > 3 }
println l1

// get a new list consisting of elements from the nos list, but each element deducted by 1 (mapping)
l2 = nos.collect { it - 1 }
println l2

// get a new list consisting of cubes of odd elements more than 3 from the nos list (filtering + mapping)
l3 = nos.findAll { it % 2 && it > 3 }.collect { it ** 3 }
println l3

// know whether there was any student who scored more than 8 in the test
a = nos.any { it > 8 }
println a

// know whether all students passed the exam (passing criteria is marks  more than 1)
b = nos.every { it > 1 }
println b

println '******** Sort list in ascending order ***************'
def s1 = nos.sort(false)
println s1

println '********** Sort list in descending order ***********'

def s2 = nos.sort(false) {Integer a, Integer b ->
    // ascending order
    // a < b => -1
    // a > b => 1
    // a == b => 0

    // descending
    b.compareTo(a)
}
println s2

def s3 = nos.sort(false) { a, b -> b <=> a } // spaceship operator that overloads the compareTo()
println s3

