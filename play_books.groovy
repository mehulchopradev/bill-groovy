import xyz.supercoders.college.domain.Book
import com.abc.col.LibBook

def bl1 = new BookList(books: [
    new Book(title: 'Book 1', price: 900, pages: 340),
    new Book(title: 'Book 2', price: 500, pages: 800),
    new Book(title: 'Book 3', price: 900, pages: 500)
])

// In the BookList object we are trying to define a DSL (Domain specific language)
// findByPropertyName (propertyName is defined in the appropriate domain)
// Methods are suppose to be dynamic based on the domain that BookList is housing

// println(bl1.findByTitle 'Book 3')
// println(bl1.findByPrice 500)
println(bl1.findByPages 500)


def bl2 = new BookList(books: [
    new LibBook(bookName: 'Prog in java', noOfPages: 900, price: 450),
    new LibBook(bookName: 'Prog in C', price: 340, noOfPages: 500)
])

println(bl2.findByNoOfPages 500)
println(bl2.findByBookName 'Prog')

