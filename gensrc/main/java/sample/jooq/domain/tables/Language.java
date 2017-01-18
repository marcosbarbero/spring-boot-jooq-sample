/**
 * This class is generated by jOOQ
 */
package sample.jooq.domain.tables;


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
public class Language extends TableImpl<Record> {

    private static final long serialVersionUID = -1746563226;

    /**
     * The reference instance of <code>PUBLIC.LANGUAGE</code>
     */
    public static final Language LANGUAGE = new Language();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<Record> getRecordType() {
        return Record.class;
    }

    /**
     * The column <code>PUBLIC.LANGUAGE.ID</code>.
     */
    public final TableField<Record, Integer> ID = createField("ID", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>PUBLIC.LANGUAGE.CD</code>.
     */
    public final TableField<Record, String> CD = createField("CD", org.jooq.impl.SQLDataType.CHAR.length(2).nullable(false), this, "");

    /**
     * The column <code>PUBLIC.LANGUAGE.DESCRIPTION</code>.
     */
    public final TableField<Record, String> DESCRIPTION = createField("DESCRIPTION", org.jooq.impl.SQLDataType.VARCHAR.length(50), this, "");

    /**
     * Create a <code>PUBLIC.LANGUAGE</code> table reference
     */
    public Language() {
        this("LANGUAGE", null);
    }

    /**
     * Create an aliased <code>PUBLIC.LANGUAGE</code> table reference
     */
    public Language(String alias) {
        this(alias, LANGUAGE);
    }

    private Language(String alias, Table<Record> aliased) {
        this(alias, aliased, null);
    }

    private Language(String alias, Table<Record> aliased, Field<?>[] parameters) {
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
        return Keys.CONSTRAINT_C;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<Record>> getKeys() {
        return Arrays.<UniqueKey<Record>>asList(Keys.CONSTRAINT_C);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Language as(String alias) {
        return new Language(alias, this);
    }

    /**
     * Rename this table
     */
    public Language rename(String name) {
        return new Language(name, null);
    }
}
