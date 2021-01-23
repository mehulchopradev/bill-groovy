@GrabConfig(systemClassLoader=true)
@Grab('mysql:mysql-connector-java:8.0.23')

import groovy.sql.Sql

def url = 'jdbc:mysql://localhost:3306/library'
def username = 'root'
def password = 'root'
def driver = 'com.mysql.cj.jdbc.Driver'

/* def conn = Sql.newInstance(url, username, password, driver)
println conn
// do all the db operations
conn.close() */

Sql.withInstance(url, username, password, driver) {conn ->
    // do whatever with the conn
    // do not have to manully close the conn as once the closure fnishes, the conn closes on its own
    println conn
}

