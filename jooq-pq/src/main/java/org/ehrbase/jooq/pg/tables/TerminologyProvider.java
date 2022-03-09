/*
 * This file is generated by jOOQ.
 */
package org.ehrbase.jooq.pg.tables;


import java.util.Arrays;
import java.util.List;

import javax.annotation.processing.Generated;

import org.ehrbase.jooq.pg.Ehr;
import org.ehrbase.jooq.pg.Indexes;
import org.ehrbase.jooq.pg.Keys;
import org.ehrbase.jooq.pg.tables.records.TerminologyProviderRecord;
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
 * openEHR identified terminology provider
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.12.3"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class TerminologyProvider extends TableImpl<TerminologyProviderRecord> {

    private static final long serialVersionUID = -1633975788;

    /**
     * The reference instance of <code>ehr.terminology_provider</code>
     */
    public static final TerminologyProvider TERMINOLOGY_PROVIDER = new TerminologyProvider();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<TerminologyProviderRecord> getRecordType() {
        return TerminologyProviderRecord.class;
    }

    /**
     * The column <code>ehr.terminology_provider.code</code>.
     */
    public final TableField<TerminologyProviderRecord, String> CODE = createField(DSL.name("code"), org.jooq.impl.SQLDataType.CLOB.nullable(false), this, "");

    /**
     * The column <code>ehr.terminology_provider.source</code>.
     */
    public final TableField<TerminologyProviderRecord, String> SOURCE = createField(DSL.name("source"), org.jooq.impl.SQLDataType.CLOB.nullable(false), this, "");

    /**
     * The column <code>ehr.terminology_provider.authority</code>.
     */
    public final TableField<TerminologyProviderRecord, String> AUTHORITY = createField(DSL.name("authority"), org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * Create a <code>ehr.terminology_provider</code> table reference
     */
    public TerminologyProvider() {
        this(DSL.name("terminology_provider"), null);
    }

    /**
     * Create an aliased <code>ehr.terminology_provider</code> table reference
     */
    public TerminologyProvider(String alias) {
        this(DSL.name(alias), TERMINOLOGY_PROVIDER);
    }

    /**
     * Create an aliased <code>ehr.terminology_provider</code> table reference
     */
    public TerminologyProvider(Name alias) {
        this(alias, TERMINOLOGY_PROVIDER);
    }

    private TerminologyProvider(Name alias, Table<TerminologyProviderRecord> aliased) {
        this(alias, aliased, null);
    }

    private TerminologyProvider(Name alias, Table<TerminologyProviderRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment("openEHR identified terminology provider"));
    }

    public <O extends Record> TerminologyProvider(Table<O> child, ForeignKey<O, TerminologyProviderRecord> key) {
        super(child, key, TERMINOLOGY_PROVIDER);
    }

    @Override
    public Schema getSchema() {
        return Ehr.EHR;
    }

    @Override
    public List<Index> getIndexes() {
        return Arrays.<Index>asList(Indexes.TERMINOLOGY_PROVIDER_PKEY);
    }

    @Override
    public UniqueKey<TerminologyProviderRecord> getPrimaryKey() {
        return Keys.TERMINOLOGY_PROVIDER_PKEY;
    }

    @Override
    public List<UniqueKey<TerminologyProviderRecord>> getKeys() {
        return Arrays.<UniqueKey<TerminologyProviderRecord>>asList(Keys.TERMINOLOGY_PROVIDER_PKEY);
    }

    @Override
    public TerminologyProvider as(String alias) {
        return new TerminologyProvider(DSL.name(alias), this);
    }

    @Override
    public TerminologyProvider as(Name alias) {
        return new TerminologyProvider(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public TerminologyProvider rename(String name) {
        return new TerminologyProvider(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public TerminologyProvider rename(Name name) {
        return new TerminologyProvider(name, null);
    }

    // -------------------------------------------------------------------------
    // Row3 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row3<String, String, String> fieldsRow() {
        return (Row3) super.fieldsRow();
    }
}