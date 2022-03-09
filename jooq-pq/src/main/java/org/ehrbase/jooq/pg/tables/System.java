/*
 * This file is generated by jOOQ.
 */
package org.ehrbase.jooq.pg.tables;


import java.util.Arrays;
import java.util.List;
import java.util.UUID;

import javax.annotation.processing.Generated;

import org.ehrbase.jooq.pg.Ehr;
import org.ehrbase.jooq.pg.Indexes;
import org.ehrbase.jooq.pg.Keys;
import org.ehrbase.jooq.pg.tables.records.SystemRecord;
import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Index;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row3;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.TableImpl;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.12.3"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class System extends TableImpl<SystemRecord> {

    private static final long serialVersionUID = -1932868702;

    /**
     * The reference instance of <code>ehr.system</code>
     */
    public static final System SYSTEM = new System();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<SystemRecord> getRecordType() {
        return SystemRecord.class;
    }

    /**
     * The column <code>ehr.system.id</code>.
     */
    public final TableField<SystemRecord, UUID> ID = createField(DSL.name("id"), org.jooq.impl.SQLDataType.UUID.nullable(false).defaultValue(org.jooq.impl.DSL.field("uuid_generate_v4()", org.jooq.impl.SQLDataType.UUID)), this, "");

    /**
     * The column <code>ehr.system.description</code>.
     */
    public final TableField<SystemRecord, String> DESCRIPTION = createField(DSL.name("description"), org.jooq.impl.SQLDataType.CLOB.nullable(false), this, "");

    /**
     * The column <code>ehr.system.settings</code>.
     */
    public final TableField<SystemRecord, String> SETTINGS = createField(DSL.name("settings"), org.jooq.impl.SQLDataType.CLOB.nullable(false), this, "");

    /**
     * Create a <code>ehr.system</code> table reference
     */
    public System() {
        this(DSL.name("system"), null);
    }

    /**
     * Create an aliased <code>ehr.system</code> table reference
     */
    public System(String alias) {
        this(DSL.name(alias), SYSTEM);
    }

    /**
     * Create an aliased <code>ehr.system</code> table reference
     */
    public System(Name alias) {
        this(alias, SYSTEM);
    }

    private System(Name alias, Table<SystemRecord> aliased) {
        this(alias, aliased, null);
    }

    private System(Name alias, Table<SystemRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> System(Table<O> child, ForeignKey<O, SystemRecord> key) {
        super(child, key, SYSTEM);
    }

    @Override
    public Schema getSchema() {
        return Ehr.EHR;
    }

    @Override
    public List<Index> getIndexes() {
        return Arrays.<Index>asList(Indexes.SYSTEM_PKEY);
    }

    @Override
    public UniqueKey<SystemRecord> getPrimaryKey() {
        return Keys.SYSTEM_PKEY;
    }

    @Override
    public List<UniqueKey<SystemRecord>> getKeys() {
        return Arrays.<UniqueKey<SystemRecord>>asList(Keys.SYSTEM_PKEY);
    }

    @Override
    public System as(String alias) {
        return new System(DSL.name(alias), this);
    }

    @Override
    public System as(Name alias) {
        return new System(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public System rename(String name) {
        return new System(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public System rename(Name name) {
        return new System(name, null);
    }

    // -------------------------------------------------------------------------
    // Row3 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row3<UUID, String, String> fieldsRow() {
        return (Row3) super.fieldsRow();
    }
}