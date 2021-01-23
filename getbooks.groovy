import com.abc.db.DbConnect

def dbConnect = new DbConnect(url: Constants.url, username: Constants.username, 
    password: Constants.password, driver: Constants.driver)

dbConnect.execute {conn ->
    conn.eachRow("select * from books") {row->
        println "Title : ${row.title}"
        println "Price: ${row.price}"
        println "Pages: ${row.pages}"
    }
}