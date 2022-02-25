/*
 * This file is generated by jOOQ.
 */
package org.ehrbase.jooq.pg.tables;


import java.util.UUID;

import javax.annotation.processing.Generated;

import org.ehrbase.jooq.pg.Ehr;
import org.ehrbase.jooq.pg.tables.records.AdminDeleteAttestationRecord;
import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row1;
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
public class AdminDeleteAttestation extends TableImpl<AdminDeleteAttestationRecord> {

    private static final long serialVersionUID = -88084492;

    /**
     * The reference instance of <code>ehr.admin_delete_attestation</code>
     */
    public static final AdminDeleteAttestation ADMIN_DELETE_ATTESTATION = new AdminDeleteAttestation();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<AdminDeleteAttestationRecord> getRecordType() {
        return AdminDeleteAttestationRecord.class;
    }

    /**
     * The column <code>ehr.admin_delete_attestation.audit</code>.
     */
    public final TableField<AdminDeleteAttestationRecord, UUID> AUDIT = createField(DSL.name("audit"), org.jooq.impl.SQLDataType.UUID, this, "");

    /**
     * Create a <code>ehr.admin_delete_attestation</code> table reference
     */
    public AdminDeleteAttestation() {
        this(DSL.name("admin_delete_attestation"), null);
    }

    /**
     * Create an aliased <code>ehr.admin_delete_attestation</code> table reference
     */
    public AdminDeleteAttestation(String alias) {
        this(DSL.name(alias), ADMIN_DELETE_ATTESTATION);
    }

    /**
     * Create an aliased <code>ehr.admin_delete_attestation</code> table reference
     */
    public AdminDeleteAttestation(Name alias) {
        this(alias, ADMIN_DELETE_ATTESTATION);
    }

    private AdminDeleteAttestation(Name alias, Table<AdminDeleteAttestationRecord> aliased) {
        this(alias, aliased, new Field[1]);
    }

    private AdminDeleteAttestation(Name alias, Table<AdminDeleteAttestationRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> AdminDeleteAttestation(Table<O> child, ForeignKey<O, AdminDeleteAttestationRecord> key) {
        super(child, key, ADMIN_DELETE_ATTESTATION);
    }

    @Override
    public Schema getSchema() {
        return Ehr.EHR;
    }

    @Override
    public AdminDeleteAttestation as(String alias) {
        return new AdminDeleteAttestation(DSL.name(alias), this, parameters);
    }

    @Override
    public AdminDeleteAttestation as(Name alias) {
        return new AdminDeleteAttestation(alias, this, parameters);
    }

    /**
     * Rename this table
     */
    @Override
    public AdminDeleteAttestation rename(String name) {
        return new AdminDeleteAttestation(DSL.name(name), null, parameters);
    }

    /**
     * Rename this table
     */
    @Override
    public AdminDeleteAttestation rename(Name name) {
        return new AdminDeleteAttestation(name, null, parameters);
    }

    // -------------------------------------------------------------------------
    // Row1 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row1<UUID> fieldsRow() {
        return (Row1) super.fieldsRow();
    }

    /**
     * Call this table-valued function
     */
    public AdminDeleteAttestation call(UUID attestRefInput) {
        return new AdminDeleteAttestation(DSL.name(getName()), null, new Field[] { 
              DSL.val(attestRefInput, org.jooq.impl.SQLDataType.UUID)
        });
    }

    /**
     * Call this table-valued function
     */
    public AdminDeleteAttestation call(Field<UUID> attestRefInput) {
        return new AdminDeleteAttestation(DSL.name(getName()), null, new Field[] { 
              attestRefInput
        });
    }
}
