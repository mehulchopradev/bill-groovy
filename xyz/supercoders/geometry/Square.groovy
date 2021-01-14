package xyz.supercoders.geometry
import com.abc.geometry.Shape

class Square extends Shape {
    Integer side

    Integer area() {
        this.side ** 2
    }

    Integer perimeter() {
        4 * this.side
    }
}