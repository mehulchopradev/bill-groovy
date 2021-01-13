def evenNos(n) {
    def result = ''
    // def i = 0 // looping variable

    // while loop
    /* while (i <= n) {
        if (i % 2 == 0) {
            result += i + ' '
        }
        i ++;
    } */

    /* do {
        if (i % 2 == 0) {
            result += i + ' '
        }
        i ++;
    } while (i <= n) */

    // for loop (traditional)
    /* for(def i = 0; i <=n; i++) {
        if (i % 2 == 0) {
            result += i + ' '
        }
    } */

    // for loop (groovier way)
    /*
       for (some-variable in <<range of elements>>) {
           // stmt1
           // stmt2
           // stmt3
       }
    */
    for (def v in 0..n) {
        if (v % 2 == 0) {
            result += v + ' '
        }
    }

    result
}

def r = evenNos 21
println r