package com.abc.geometry

class ShapeStatistics {
    static def compute(shape) {
        if (shape instanceof Shape) {
            println "Area computed is: ${shape.area()}"
            println "Perimeter computed is: ${shape.perimeter()}"
        } else {
            println "Hey please extend com.abc.geometry.Shape and then pass to this method"
        }
    }
}