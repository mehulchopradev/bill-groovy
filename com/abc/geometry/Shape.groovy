package com.abc.geometry

// a class has to be abstract if it has even one abstract method
// we cannnot create an object of an abstract class
abstract class Shape {
    // can have all the things that a non abstract class can have

    abstract Integer area()
    abstract Integer perimeter()
}