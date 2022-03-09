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
import org.ehrbase.jooq.pg.enums.ContributionDataType;
import org.ehrbase.jooq.pg.enums.ContributionState;
import org.ehrbase.jooq.pg.tables.records.ContributionRecord;
import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Index;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row6;
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
public class Contribution extends TableImpl<ContributionRecord> {

    private static final long serialVersionUID = 1111770825;

    /**
     * The reference instance of <code>ehr.contribution</code>
     */
    public static final Contribution CONTRIBUTION = new Contribution();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<ContributionRecord> getRecordType() {
        return ContributionRecord.class;
    }

    /**
     * The column <code>ehr.contribution.id</code>.
     */
    public final TableField<ContributionRecord, UUID> ID = createField(DSL.name("id"), org.jooq.impl.SQLDataType.UUID.nullable(false).defaultValue(org.jooq.impl.DSL.field("uuid_generate_v4()", org.jooq.impl.SQLDataType.UUID)), this, "");

    /**
     * The column <code>ehr.contribution.ehr_id</code>.
     */
    public final TableField<ContributionRecord, UUID> EHR_ID = createField(DSL.name("ehr_id"), org.jooq.impl.SQLDataType.UUID, this, "");

    /**
     * The column <code>ehr.contribution.contribution_type</code>.
     */
    public final TableField<ContributionRecord, ContributionDataType> CONTRIBUTION_TYPE = createField(DSL.name("contribution_type"), org.jooq.impl.SQLDataType.VARCHAR.asEnumDataType(ContributionDataType.class), this, "");

    /**
     * The column <code>ehr.contribution.state</code>.
     */
    public final TableField<ContributionRecord, ContributionState> STATE = createField(DSL.name("state"), org.jooq.impl.SQLDataType.VARCHAR.asEnumDataType(ContributionState.class), this, "");

    /**
     * The column <code>ehr.contribution.signature</code>.
     */
    public final TableField<ContributionRecord, String> SIGNATURE = createField(DSL.name("signature"), org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * The column <code>ehr.contribution.has_audit</code>.
     */
    public final TableField<ContributionRecord, UUID> HAS_AUDIT = createField(DSL.name("has_audit"), org.jooq.impl.SQLDataType.UUID, this, "");

    /**
     * Create a <code>ehr.contribution</code> table reference
     */
    public Contribution() {
        this(DSL.name("contribution"), null);
    }

    /**
     * Create an aliased <code>ehr.contribution</code> table reference
     */
    public Contribution(String alias) {
        this(DSL.name(alias), CONTRIBUTION);
    }

    /**
     * Create an aliased <code>ehr.contribution</code> table reference
     */
    public Contribution(Name alias) {
        this(alias, CONTRIBUTION);
    }

    private Contribution(Name alias, Table<ContributionRecord> aliased) {
        this(alias, aliased, null);
    }

    private Contribution(Name alias, Table<ContributionRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> Contribution(Table<O> child, ForeignKey<O, ContributionRecord> key) {
        super(child, key, CONTRIBUTION);
    }

    @Override
    public Schema getSchema() {
        return Ehr.EHR;
    }

    @Override
    public List<Index> getIndexes() {
        return Arrays.<Index>asList(Indexes.CONTRIBUTION_EHR_IDX, Indexes.CONTRIBUTION_PKEY);
    }

    @Override
    public UniqueKey<ContributionRecord> getPrimaryKey() {
        return Keys.CONTRIBUTION_PKEY;
    }

    @Override
    public List<UniqueKey<ContributionRecord>> getKeys() {
        return Arrays.<UniqueKey<ContributionRecord>>asList(Keys.CONTRIBUTION_PKEY);
    }

    @Override
    public List<ForeignKey<ContributionRecord, ?>> getReferences() {
        return Arrays.<ForeignKey<ContributionRecord, ?>>asList(Keys.CONTRIBUTION__CONTRIBUTION_EHR_ID_FKEY, Keys.CONTRIBUTION__CONTRIBUTION_HAS_AUDIT_FKEY);
    }

    public org.ehrbase.jooq.pg.tables.Ehr ehr() {
        return new org.ehrbase.jooq.pg.tables.Ehr(this, Keys.CONTRIBUTION__CONTRIBUTION_EHR_ID_FKEY);
    }

    public AuditDetails auditDetails() {
        return new AuditDetails(this, Keys.CONTRIBUTION__CONTRIBUTION_HAS_AUDIT_FKEY);
    }

    @Override
    public Contribution as(String alias) {
        return new Contribution(DSL.name(alias), this);
    }

    @Override
    public Contribution as(Name alias) {
        return new Contribution(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Contribution rename(String name) {
        return new Contribution(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Contribution rename(Name name) {
        return new Contribution(name, null);
    }

    // -------------------------------------------------------------------------
    // Row6 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row6<UUID, UUID, ContributionDataType, ContributionState, String, UUID> fieldsRow() {
        return (Row6) super.fieldsRow();
    }
}