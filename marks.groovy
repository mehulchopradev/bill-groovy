def getGrade(marks) {
    /*
        >= 70 - A
        >= 60 - B
        >= 40 - C
        < 40 - F
        < 0 or > 100 - I
    */
    // if - else if - else if ...... - else

    /* if (marks > 100 || marks < 0) {
        'I'
    } else if (marks >= 70) {
        'A'
    } else if (marks >= 60) {
        'B'
    } else if (marks >= 40) {
        'C'
    } else {
        'F'
    } */

    // groovy Range data

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

def g = getGrade 34
println g