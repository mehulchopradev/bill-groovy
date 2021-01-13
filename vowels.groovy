def isVowel(ch) {
    // ch (a, e, i, o, u) -> Vowel
    // Rest - Not a Vowel

    // switch cases
    switch(ch) {
        case 'a':
        case 'e':
        case 'i':
        case 'o':
        case 'u': 'Vowel'
            break
        default: 'Not a Vowel'
    }
}

def a = isVowel 'a'
println a