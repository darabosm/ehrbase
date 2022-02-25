/*
 * This file is generated by jOOQ.
 */
package org.ehrbase.jooq.pg.tables.records;


import java.util.UUID;

import javax.annotation.processing.Generated;

import org.ehrbase.jooq.pg.tables.AdminDeleteAudit;
import org.jooq.Field;
import org.jooq.Record2;
import org.jooq.Row2;
import org.jooq.impl.TableRecordImpl;


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
public class AdminDeleteAuditRecord extends TableRecordImpl<AdminDeleteAuditRecord> implements Record2<Integer, UUID> {

    private static final long serialVersionUID = 100846264;

    /**
     * Setter for <code>ehr.admin_delete_audit.num</code>.
     */
    public void setNum(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>ehr.admin_delete_audit.num</code>.
     */
    public Integer getNum() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>ehr.admin_delete_audit.party</code>.
     */
    public void setParty(UUID value) {
        set(1, value);
    }

    /**
     * Getter for <code>ehr.admin_delete_audit.party</code>.
     */
    public UUID getParty() {
        return (UUID) get(1);
    }

    // -------------------------------------------------------------------------
    // Record2 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row2<Integer, UUID> fieldsRow() {
        return (Row2) super.fieldsRow();
    }

    @Override
    public Row2<Integer, UUID> valuesRow() {
        return (Row2) super.valuesRow();
    }

    @Override
    public Field<Integer> field1() {
        return AdminDeleteAudit.ADMIN_DELETE_AUDIT.NUM;
    }

    @Override
    public Field<UUID> field2() {
        return AdminDeleteAudit.ADMIN_DELETE_AUDIT.PARTY;
    }

    @Override
    public Integer component1() {
        return getNum();
    }

    @Override
    public UUID component2() {
        return getParty();
    }

    @Override
    public Integer value1() {
        return getNum();
    }

    @Override
    public UUID value2() {
        return getParty();
    }

    @Override
    public AdminDeleteAuditRecord value1(Integer value) {
        setNum(value);
        return this;
    }

    @Override
    public AdminDeleteAuditRecord value2(UUID value) {
        setParty(value);
        return this;
    }

    @Override
    public AdminDeleteAuditRecord values(Integer value1, UUID value2) {
        value1(value1);
        value2(value2);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached AdminDeleteAuditRecord
     */
    public AdminDeleteAuditRecord() {
        super(AdminDeleteAudit.ADMIN_DELETE_AUDIT);
    }

    /**
     * Create a detached, initialised AdminDeleteAuditRecord
     */
    public AdminDeleteAuditRecord(Integer num, UUID party) {
        super(AdminDeleteAudit.ADMIN_DELETE_AUDIT);

        set(0, num);
        set(1, party);
    }
}
