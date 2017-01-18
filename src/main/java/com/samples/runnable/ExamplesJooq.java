package com.samples.runnable;

import org.jooq.DSLContext;
import org.jooq.Record;
import org.jooq.Result;
import org.springframework.boot.CommandLineRunner;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import lombok.extern.slf4j.Slf4j;

import static sample.jooq.domain.Author.AUTHOR;
import static sample.jooq.domain.Book.BOOK;


/**
 * @author Marcos Barbero
 * @since 2017-01-18
 */
@Slf4j
@Component
public class ExamplesJooq implements CommandLineRunner {
    private final DSLContext dsl;

    private final JdbcTemplate jdbc;

    public ExamplesJooq(DSLContext dsl, JdbcTemplate jdbc) {
        this.dsl = dsl;
        this.jdbc = jdbc;
    }

    @Override
    public void run(String... args) throws Exception {
        jooqFetch();
        jooqSql();
    }

    private void jooqFetch() {
        Result<Record> results = this.dsl.select().from(AUTHOR).fetch();
        for (Record result : results) {
            Integer id = result.getValue(AUTHOR.ID);
            String firstName = result.getValue(AUTHOR.FIRST_NAME);
            String lastName = result.getValue(AUTHOR.LAST_NAME);
            System.out.println("jOOQ Fetch " + id + " " + firstName + " " + lastName);
        }
    }

    private void jooqSql() {
        Query query = this.dsl.select(BOOK.TITLE, AUTHOR.FIRST_NAME, AUTHOR.LAST_NAME)
                .from(BOOK).join(AUTHOR).on(BOOK.AUTHOR_ID.equal(AUTHOR.ID))
                .where(BOOK.PUBLISHED_IN.equal(2015));
        Object[] bind = query.getBindValues().toArray(new Object[] {});
        List<String> list = this.jdbc.query(query.getSQL(), bind,
                new RowMapper<String>() {
                    @Override
                    public String mapRow(ResultSet rs, int rowNum) throws SQLException {
                        return rs.getString(1) + " : " + rs.getString(2) + " "
                                + rs.getString(3);
                    }
                });
        log.info("jOOQ SQL {}", list);
    }
}
