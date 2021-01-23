class BookList {
    List books

    def methodMissing(String methodName, args) {
        // println methodName
        // println args
        // propertyName
        // methodName - findByPropertyName
        if (!methodName.startsWith('findBy')) {
            throw new Exception('Make sure you start with findBy in your call')
        }

        // findByTitle
        def propertyName = methodName['findBy'.size()..methodName.size()-1]
        propertyName = propertyName[0].toLowerCase() + propertyName[1..propertyName.size()-1]
        
        this.books.findAll { it[propertyName] ==  args[0]}
    }
}