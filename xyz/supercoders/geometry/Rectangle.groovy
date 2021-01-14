package xyz.supercoders.geometry
import com.abc.geometry.Shape

class Rectangle extends Shape {
    Integer length
    Integer breadth

    Integer area() {
        this.length * this.breadth
    }

    Integer perimeter() {
        2 * (this.length + this.breadth)
    }
}