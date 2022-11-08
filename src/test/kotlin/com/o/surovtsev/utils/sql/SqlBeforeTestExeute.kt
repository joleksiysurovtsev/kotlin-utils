package com.o.surovtsev.utils.sql

import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith
import org.springframework.test.context.ContextConfiguration
import org.springframework.test.context.jdbc.Sql
import org.springframework.test.context.junit.jupiter.SpringExtension

/**
 * @see "https://www.concretepage.com/spring-5/sql-example-spring-test#Sql"
 * */
@Sql("/sql/drop_schema.sql")
@Sql(scripts = ["/sql/update_schema.sql"], statements = ["insert into student(id, name) values (100, 'Shiva')"])
class SqlBeforeTestExeute {

    @Test
    fun `tested create jira issue`() {

    }

}