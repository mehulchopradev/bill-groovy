import xyz.supercoders.college.domain.Book
import xyz.supercoders.college.domain.Author
import xyz.supercoders.college.domain.Contact

import groovy.json.JsonBuilder
import groovy.json.JsonOutput

/* def book = new Book(title: 'Book 1', price: 900, pages: 1000, authors: [
    new Author(name: 'mehul', ratings: 3, contact: new Contact(email: 'mehulc@hey.com', mobile: '543534535', country: 'IN')),
    new Author(name: 'bill', ratings: 4, contact: new Contact(email: 'bill@gmail.com', mobile: '9878677', country: 'US'))
]) */

def ogb = new ObjectGraphBuilder(classNameResolver: 'xyz.supercoders.college.domain')

def book = ogb.book(title: 'Book 1', price: 900, pages: 1000) {
    author(name: 'mehul', ratings: 3) {
        contact email: 'mehulc@hey.com', mobile: '543534535', country: 'IN'
    }

    author(name: 'bill', ratings: 4) {
        contact email: 'bill@gmail.com', mobile: '9878677', country: 'US'
    }
}

println book
println book.authors
println book.authors[0].contact

// JSON output
def job = new JsonBuilder()
job.book {
    title 'Book 1'
    price 900
    pages 1000

    author {
        name 'mehul'
        ratings 3

        contact {
            email 'mehulc@hey.com'
            mobile '543534535'
            country 'IN'
        }
    },

    author {
        name 'bill'
        ratings 4

        contact {
            email 'bill@gmail.com'
            mobile '9878677'
            country 'US'
        }
    }
}

String json = JsonOutput.prettyPrint(job.toString())
println json
