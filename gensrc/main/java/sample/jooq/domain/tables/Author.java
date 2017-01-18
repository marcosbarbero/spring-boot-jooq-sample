/**
 * This class is generated by jOOQ
 */
package sample.jooq.domain.tables;


import java.sql.Date;
import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.TableImpl;

import sample.jooq.domain.Keys;
import sample.jooq.domain.Public;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.8.6"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Author extends TableImpl<Record> {

    private static final long serialVersionUID = -219610347;

    /**
     * The reference instance of <code>PUBLIC.AUTHOR</code>
     */
    public static final Author AUTHOR = new Author();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<Record> getRecordType() {
        return Record.class;
    }

    /**
     * The column <code>PUBLIC.AUTHOR.ID</code>.
     */
    public final TableField<Record, Integer> ID = createField("ID", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>PUBLIC.AUTHOR.FIRST_NAME</code>.
     */
    public final TableField<Record, String> FIRST_NAME = createField("FIRST_NAME", org.jooq.impl.SQLDataType.VARCHAR.length(50), this, "");

    /**
     * The column <code>PUBLIC.AUTHOR.LAST_NAME</code>.
     */
    public final TableField<Record, String> LAST_NAME = createField("LAST_NAME", org.jooq.impl.SQLDataType.VARCHAR.length(50).nullable(false), this, "");

    /**
     * The column <code>PUBLIC.AUTHOR.DATE_OF_BIRTH</code>.
     */
    public final TableField<Record, Date> DATE_OF_BIRTH = createField("DATE_OF_BIRTH", org.jooq.impl.SQLDataType.DATE, this, "");

    /**
     * The column <code>PUBLIC.AUTHOR.YEAR_OF_BIRTH</code>.
     */
    public final TableField<Record, Integer> YEAR_OF_BIRTH = createField("YEAR_OF_BIRTH", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>PUBLIC.AUTHOR.DISTINGUISHED</code>.
     */
    public final TableField<Record, Byte> DISTINGUISHED = createField("DISTINGUISHED", org.jooq.impl.SQLDataType.TINYINT, this, "");

    /**
     * Create a <code>PUBLIC.AUTHOR</code> table reference
     */
    public Author() {
        this("AUTHOR", null);
    }

    /**
     * Create an aliased <code>PUBLIC.AUTHOR</code> table reference
     */
    public Author(String alias) {
        this(alias, AUTHOR);
    }

    private Author(String alias, Table<Record> aliased) {
        this(alias, aliased, null);
    }

    private Author(String alias, Table<Record> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, "");
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Schema getSchema() {
        return Public.PUBLIC;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<Record> getPrimaryKey() {
        return Keys.CONSTRAINT_7;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<Record>> getKeys() {
        return Arrays.<UniqueKey<Record>>asList(Keys.CONSTRAINT_7);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Author as(String alias) {
        return new Author(alias, this);
    }

    /**
     * Rename this table
     */
    public Author rename(String name) {
        return new Author(name, null);
    }
}
