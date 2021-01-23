package com.abc.db

import groovy.sql.Sql

@GrabConfig(systemClassLoader=true)
@Grab('mysql:mysql-connector-java:8.0.23')

class DbConnect {
    String url
    String username
    String password
    String driver

    def execute(fn) {
        Sql.withInstance(this.url, this.username, this.password, this.driver) {conn ->
            fn(conn)
        }
    }
}