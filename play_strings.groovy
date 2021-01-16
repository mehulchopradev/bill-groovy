// Metaprogramming
// to every class groovy adds a static property called as metaClass
// using the metaClass we can inject any dynamic thing to the class

String.metaClass.pipefy = {
    // delegate (current object) --- this
    def newStr = ''
    for(ch in delegate) {
        newStr += ch + it
    }

    newStr[0..-2]
}

def message = 'good morning'

// build up a new string consisting of characters of the above string; but separated with a pipe symbol
println message.pipefy('|')

def name = 'mehul chopra'
println name.pipefy(',')

