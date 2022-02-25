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
import org.ehrbase.jooq.pg.tables.records.AttestationRecord;
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
public class Attestation extends TableImpl<AttestationRecord> {

    private static final long serialVersionUID = -1202557703;

    /**
     * The reference instance of <code>ehr.attestation</code>
     */
    public static final Attestation ATTESTATION = new Attestation();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<AttestationRecord> getRecordType() {
        return AttestationRecord.class;
    }

    /**
     * The column <code>ehr.attestation.id</code>.
     */
    public final TableField<AttestationRecord, UUID> ID = createField(DSL.name("id"), org.jooq.impl.SQLDataType.UUID.nullable(false).defaultValue(org.jooq.impl.DSL.field("uuid_generate_v4()", org.jooq.impl.SQLDataType.UUID)), this, "");

    /**
     * The column <code>ehr.attestation.proof</code>.
     */
    public final TableField<AttestationRecord, String> PROOF = createField(DSL.name("proof"), org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * The column <code>ehr.attestation.reason</code>.
     */
    public final TableField<AttestationRecord, String> REASON = createField(DSL.name("reason"), org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * The column <code>ehr.attestation.is_pending</code>.
     */
    public final TableField<AttestationRecord, Boolean> IS_PENDING = createField(DSL.name("is_pending"), org.jooq.impl.SQLDataType.BOOLEAN, this, "");

    /**
     * The column <code>ehr.attestation.has_audit</code>.
     */
    public final TableField<AttestationRecord, UUID> HAS_AUDIT = createField(DSL.name("has_audit"), org.jooq.impl.SQLDataType.UUID.nullable(false), this, "");

    /**
     * The column <code>ehr.attestation.reference</code>.
     */
    public final TableField<AttestationRecord, UUID> REFERENCE = createField(DSL.name("reference"), org.jooq.impl.SQLDataType.UUID.nullable(false), this, "");

    /**
     * Create a <code>ehr.attestation</code> table reference
     */
    public Attestation() {
        this(DSL.name("attestation"), null);
    }

    /**
     * Create an aliased <code>ehr.attestation</code> table reference
     */
    public Attestation(String alias) {
        this(DSL.name(alias), ATTESTATION);
    }

    /**
     * Create an aliased <code>ehr.attestation</code> table reference
     */
    public Attestation(Name alias) {
        this(alias, ATTESTATION);
    }

    private Attestation(Name alias, Table<AttestationRecord> aliased) {
        this(alias, aliased, null);
    }

    private Attestation(Name alias, Table<AttestationRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> Attestation(Table<O> child, ForeignKey<O, AttestationRecord> key) {
        super(child, key, ATTESTATION);
    }

    @Override
    public Schema getSchema() {
        return Ehr.EHR;
    }

    @Override
    public List<Index> getIndexes() {
        return Arrays.<Index>asList(Indexes.ATTESTATION_PKEY, Indexes.ATTESTATION_REFERENCE_IDX);
    }

    @Override
    public UniqueKey<AttestationRecord> getPrimaryKey() {
        return Keys.ATTESTATION_PKEY;
    }

    @Override
    public List<UniqueKey<AttestationRecord>> getKeys() {
        return Arrays.<UniqueKey<AttestationRecord>>asList(Keys.ATTESTATION_PKEY);
    }

    @Override
    public List<ForeignKey<AttestationRecord, ?>> getReferences() {
        return Arrays.<ForeignKey<AttestationRecord, ?>>asList(Keys.ATTESTATION__ATTESTATION_HAS_AUDIT_FKEY, Keys.ATTESTATION__ATTESTATION_REFERENCE_FKEY);
    }

    public AuditDetails auditDetails() {
        return new AuditDetails(this, Keys.ATTESTATION__ATTESTATION_HAS_AUDIT_FKEY);
    }

    public AttestationRef attestationRef() {
        return new AttestationRef(this, Keys.ATTESTATION__ATTESTATION_REFERENCE_FKEY);
    }

    @Override
    public Attestation as(String alias) {
        return new Attestation(DSL.name(alias), this);
    }

    @Override
    public Attestation as(Name alias) {
        return new Attestation(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Attestation rename(String name) {
        return new Attestation(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Attestation rename(Name name) {
        return new Attestation(name, null);
    }

    // -------------------------------------------------------------------------
    // Row6 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row6<UUID, String, String, Boolean, UUID, UUID> fieldsRow() {
        return (Row6) super.fieldsRow();
    }
}
