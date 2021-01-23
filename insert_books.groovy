import com.abc.db.DbConnect

def dbConnect = new DbConnect(url: Constants.url, username: Constants.username, 
    password: Constants.password, driver: Constants.driver)

def scanner = new Scanner(System.in)
println "Enter title"
def title = scanner.nextLine()

println "Enter price"
def price = scanner.nextFloat()

println "Enter pages"
def pages = scanner.nextInt()

dbConnect.execute {conn ->
    def keys = conn.executeInsert "insert into books (title, price, pages) values(${title}, ${price}, ${pages})"
    println keys
}

