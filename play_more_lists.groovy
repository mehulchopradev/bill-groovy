List.metaClass.evens = {
    delegate.findAll { it % 2 == 0 }
}

def nos = [5, 4, 4, 8, 9, 10, 3, 2, 6, 7]

// get a new list consisting of evens from the nos list
println nos.evens()