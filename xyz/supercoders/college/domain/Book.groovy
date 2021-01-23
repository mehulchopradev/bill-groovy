package xyz.supercoders.college.domain

class Book {
    String title
    Integer pages
    Double price
    List<Author> authors = []

    String toString() {
        "${this.title}\n${this.pages}\n${this.price}"
    }
}