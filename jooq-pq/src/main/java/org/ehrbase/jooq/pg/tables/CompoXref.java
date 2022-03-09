/*
 * This file is generated by jOOQ.
 */
package org.ehrbase.jooq.pg.tables;


import java.sql.Timestamp;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;

import javax.annotation.processing.Generated;

import org.ehrbase.jooq.pg.Ehr;
import org.ehrbase.jooq.pg.Indexes;
import org.ehrbase.jooq.pg.tables.records.CompoXrefRecord;
import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Index;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row3;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
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
public class CompoXref extends TableImpl<CompoXrefRecord> {

    private static final long serialVersionUID = -2129789273;

    /**
     * The reference instance of <code>ehr.compo_xref</code>
     */
    public static final CompoXref COMPO_XREF = new CompoXref();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<CompoXrefRecord> getRecordType() {
        return CompoXrefRecord.class;
    }

    /**
     * The column <code>ehr.compo_xref.master_uuid</code>.
     */
    public final TableField<CompoXrefRecord, UUID> MASTER_UUID = createField(DSL.name("master_uuid"), org.jooq.impl.SQLDataType.UUID, this, "");

    /**
     * The column <code>ehr.compo_xref.child_uuid</code>.
     */
    public final TableField<CompoXrefRecord, UUID> CHILD_UUID = createField(DSL.name("child_uuid"), org.jooq.impl.SQLDataType.UUID, this, "");

    /**
     * The column <code>ehr.compo_xref.sys_transaction</code>.
     */
    public final TableField<CompoXrefRecord, Timestamp> SYS_TRANSACTION = createField(DSL.name("sys_transaction"), org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false), this, "");

    /**
     * Create a <code>ehr.compo_xref</code> table reference
     */
    public CompoXref() {
        this(DSL.name("compo_xref"), null);
    }

    /**
     * Create an aliased <code>ehr.compo_xref</code> table reference
     */
    public CompoXref(String alias) {
        this(DSL.name(alias), COMPO_XREF);
    }

    /**
     * Create an aliased <code>ehr.compo_xref</code> table reference
     */
    public CompoXref(Name alias) {
        this(alias, COMPO_XREF);
    }

    private CompoXref(Name alias, Table<CompoXrefRecord> aliased) {
        this(alias, aliased, null);
    }

    private CompoXref(Name alias, Table<CompoXrefRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> CompoXref(Table<O> child, ForeignKey<O, CompoXrefRecord> key) {
        super(child, key, COMPO_XREF);
    }

    @Override
    public Schema getSchema() {
        return Ehr.EHR;
    }

    @Override
    public List<Index> getIndexes() {
        return Arrays.<Index>asList(Indexes.COMPO_XREF_CHILD_IDX, Indexes.EHR_COMPO_XREF);
    }

    @Override
    public CompoXref as(String alias) {
        return new CompoXref(DSL.name(alias), this);
    }

    @Override
    public CompoXref as(Name alias) {
        return new CompoXref(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public CompoXref rename(String name) {
        return new CompoXref(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public CompoXref rename(Name name) {
        return new CompoXref(name, null);
    }

    // -------------------------------------------------------------------------
    // Row3 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row3<UUID, UUID, Timestamp> fieldsRow() {
        return (Row3) super.fieldsRow();
    }
}