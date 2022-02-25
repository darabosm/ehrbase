/*
 * This file is generated by jOOQ.
 */
package org.ehrbase.jooq.pg.tables;


import java.util.UUID;

import javax.annotation.processing.Generated;

import org.ehrbase.jooq.pg.Ehr;
import org.ehrbase.jooq.pg.tables.records.AdminDeleteAuditRecord;
import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row2;
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
public class AdminDeleteAudit extends TableImpl<AdminDeleteAuditRecord> {

    private static final long serialVersionUID = 747680704;

    /**
     * The reference instance of <code>ehr.admin_delete_audit</code>
     */
    public static final AdminDeleteAudit ADMIN_DELETE_AUDIT = new AdminDeleteAudit();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<AdminDeleteAuditRecord> getRecordType() {
        return AdminDeleteAuditRecord.class;
    }

    /**
     * The column <code>ehr.admin_delete_audit.num</code>.
     */
    public final TableField<AdminDeleteAuditRecord, Integer> NUM = createField(DSL.name("num"), org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>ehr.admin_delete_audit.party</code>.
     */
    public final TableField<AdminDeleteAuditRecord, UUID> PARTY = createField(DSL.name("party"), org.jooq.impl.SQLDataType.UUID, this, "");

    /**
     * Create a <code>ehr.admin_delete_audit</code> table reference
     */
    public AdminDeleteAudit() {
        this(DSL.name("admin_delete_audit"), null);
    }

    /**
     * Create an aliased <code>ehr.admin_delete_audit</code> table reference
     */
    public AdminDeleteAudit(String alias) {
        this(DSL.name(alias), ADMIN_DELETE_AUDIT);
    }

    /**
     * Create an aliased <code>ehr.admin_delete_audit</code> table reference
     */
    public AdminDeleteAudit(Name alias) {
        this(alias, ADMIN_DELETE_AUDIT);
    }

    private AdminDeleteAudit(Name alias, Table<AdminDeleteAuditRecord> aliased) {
        this(alias, aliased, new Field[1]);
    }

    private AdminDeleteAudit(Name alias, Table<AdminDeleteAuditRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> AdminDeleteAudit(Table<O> child, ForeignKey<O, AdminDeleteAuditRecord> key) {
        super(child, key, ADMIN_DELETE_AUDIT);
    }

    @Override
    public Schema getSchema() {
        return Ehr.EHR;
    }

    @Override
    public AdminDeleteAudit as(String alias) {
        return new AdminDeleteAudit(DSL.name(alias), this, parameters);
    }

    @Override
    public AdminDeleteAudit as(Name alias) {
        return new AdminDeleteAudit(alias, this, parameters);
    }

    /**
     * Rename this table
     */
    @Override
    public AdminDeleteAudit rename(String name) {
        return new AdminDeleteAudit(DSL.name(name), null, parameters);
    }

    /**
     * Rename this table
     */
    @Override
    public AdminDeleteAudit rename(Name name) {
        return new AdminDeleteAudit(name, null, parameters);
    }

    // -------------------------------------------------------------------------
    // Row2 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row2<Integer, UUID> fieldsRow() {
        return (Row2) super.fieldsRow();
    }

    /**
     * Call this table-valued function
     */
    public AdminDeleteAudit call(UUID auditInput) {
        return new AdminDeleteAudit(DSL.name(getName()), null, new Field[] { 
              DSL.val(auditInput, org.jooq.impl.SQLDataType.UUID)
        });
    }

    /**
     * Call this table-valued function
     */
    public AdminDeleteAudit call(Field<UUID> auditInput) {
        return new AdminDeleteAudit(DSL.name(getName()), null, new Field[] { 
              auditInput
        });
    }
}
