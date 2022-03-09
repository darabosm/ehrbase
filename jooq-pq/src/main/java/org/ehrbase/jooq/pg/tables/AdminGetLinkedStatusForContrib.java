/*
 * This file is generated by jOOQ.
 */
package org.ehrbase.jooq.pg.tables;


import java.util.UUID;

import javax.annotation.processing.Generated;

import org.ehrbase.jooq.pg.Ehr;
import org.ehrbase.jooq.pg.tables.records.AdminGetLinkedStatusForContribRecord;
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
public class AdminGetLinkedStatusForContrib extends TableImpl<AdminGetLinkedStatusForContribRecord> {

    private static final long serialVersionUID = 932303247;

    /**
     * The reference instance of <code>ehr.admin_get_linked_status_for_contrib</code>
     */
    public static final AdminGetLinkedStatusForContrib ADMIN_GET_LINKED_STATUS_FOR_CONTRIB = new AdminGetLinkedStatusForContrib();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<AdminGetLinkedStatusForContribRecord> getRecordType() {
        return AdminGetLinkedStatusForContribRecord.class;
    }

    /**
     * The column <code>ehr.admin_get_linked_status_for_contrib.status</code>.
     */
    public final TableField<AdminGetLinkedStatusForContribRecord, UUID> STATUS = createField(DSL.name("status"), org.jooq.impl.SQLDataType.UUID, this, "");

    /**
     * Create a <code>ehr.admin_get_linked_status_for_contrib</code> table reference
     */
    public AdminGetLinkedStatusForContrib() {
        this(DSL.name("admin_get_linked_status_for_contrib"), null);
    }

    /**
     * Create an aliased <code>ehr.admin_get_linked_status_for_contrib</code> table reference
     */
    public AdminGetLinkedStatusForContrib(String alias) {
        this(DSL.name(alias), ADMIN_GET_LINKED_STATUS_FOR_CONTRIB);
    }

    /**
     * Create an aliased <code>ehr.admin_get_linked_status_for_contrib</code> table reference
     */
    public AdminGetLinkedStatusForContrib(Name alias) {
        this(alias, ADMIN_GET_LINKED_STATUS_FOR_CONTRIB);
    }

    private AdminGetLinkedStatusForContrib(Name alias, Table<AdminGetLinkedStatusForContribRecord> aliased) {
        this(alias, aliased, new Field[1]);
    }

    private AdminGetLinkedStatusForContrib(Name alias, Table<AdminGetLinkedStatusForContribRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> AdminGetLinkedStatusForContrib(Table<O> child, ForeignKey<O, AdminGetLinkedStatusForContribRecord> key) {
        super(child, key, ADMIN_GET_LINKED_STATUS_FOR_CONTRIB);
    }

    @Override
    public Schema getSchema() {
        return Ehr.EHR;
    }

    @Override
    public AdminGetLinkedStatusForContrib as(String alias) {
        return new AdminGetLinkedStatusForContrib(DSL.name(alias), this, parameters);
    }

    @Override
    public AdminGetLinkedStatusForContrib as(Name alias) {
        return new AdminGetLinkedStatusForContrib(alias, this, parameters);
    }

    /**
     * Rename this table
     */
    @Override
    public AdminGetLinkedStatusForContrib rename(String name) {
        return new AdminGetLinkedStatusForContrib(DSL.name(name), null, parameters);
    }

    /**
     * Rename this table
     */
    @Override
    public AdminGetLinkedStatusForContrib rename(Name name) {
        return new AdminGetLinkedStatusForContrib(name, null, parameters);
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
    public AdminGetLinkedStatusForContrib call(UUID contribIdInput) {
        return new AdminGetLinkedStatusForContrib(DSL.name(getName()), null, new Field[] { 
              DSL.val(contribIdInput, org.jooq.impl.SQLDataType.UUID)
        });
    }

    /**
     * Call this table-valued function
     */
    public AdminGetLinkedStatusForContrib call(Field<UUID> contribIdInput) {
        return new AdminGetLinkedStatusForContrib(DSL.name(getName()), null, new Field[] { 
              contribIdInput
        });
    }
}