import xyz.supercoders.geometry.Square
import xyz.supercoders.geometry.Rectangle

import com.abc.geometry.ShapeStatistics

def s1 = new Square(side: 9)
ShapeStatistics.compute s1

def r1 = new Rectangle(length: 8, breadth: 4)
ShapeStatistics.compute r1