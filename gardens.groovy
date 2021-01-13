def areaRectangle(length, breadth) {
    length * breadth
}

def perimeterRectangle(length, breadth) {
    2 * (length + breadth)
}

def l1 = 5
def b1 = 3

def l2 = 10
def b2 = 6

def a1 = areaRectangle l1, b1
def p1 = perimeterRectangle l1, b1

def a2 = areaRectangle l2, b2
def p2 = perimeterRectangle l2, b2


println "Area of garden 1 is ${a1}"
println "Perimeter of garden 1 is ${p1}"

println "Area of garden 2 is ${a2}"
println "Perimeter of garden 2 is ${p2}"