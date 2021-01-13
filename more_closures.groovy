def abc() {
    def i = 10 // i (abc) -> Integer object
    def j = 20 // j (abc) -> Integer object

    // pqr (abc) -> Closure object
    // a function is defined inside another function
    def pqr = {
        // closure can access the enclosing contexts variables
        println it + i
        j = j + 30 // avoid this pattern
    }

    // calling the closure
    pqr(8)
    println j // 50
}

abc()
// pqr() // will give an error as pqr code is private to the abc code


def xyz() {
    def a = 90 // a (xyz) -> Integer object

    // mno (xyz) -> Closure object
    def mno = {
        // Closures have a permanent memory binding of the enclosing environment variables,
        // even when the closures are returned from that enclosing environment
        a + (it ** 2)
    }

    // return a closure object
    // a function returning another function
    mno
}

m = xyz()
println m(6) // mno()