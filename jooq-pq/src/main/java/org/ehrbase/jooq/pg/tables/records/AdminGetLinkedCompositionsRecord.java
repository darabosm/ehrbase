/*
 * This file is generated by jOOQ.
 */
package org.ehrbase.jooq.pg.tables.records;


import java.util.UUID;

import javax.annotation.processing.Generated;

import org.ehrbase.jooq.pg.tables.AdminGetLinkedCompositions;
import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Row1;
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
public class AdminGetLinkedCompositionsRecord extends TableRecordImpl<AdminGetLinkedCompositionsRecord> implements Record1<UUID> {

    private static final long serialVersionUID = 748018883;

    /**
     * Setter for <code>ehr.admin_get_linked_compositions.composition</code>.
     */
    public void setComposition(UUID value) {
        set(0, value);
    }

    /**
     * Getter for <code>ehr.admin_get_linked_compositions.composition</code>.
     */
    public UUID getComposition() {
        return (UUID) get(0);
    }

    // -------------------------------------------------------------------------
    // Record1 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row1<UUID> fieldsRow() {
        return (Row1) super.fieldsRow();
    }

    @Override
    public Row1<UUID> valuesRow() {
        return (Row1) super.valuesRow();
    }

    @Override
    public Field<UUID> field1() {
        return AdminGetLinkedCompositions.ADMIN_GET_LINKED_COMPOSITIONS.COMPOSITION;
    }

    @Override
    public UUID component1() {
        return getComposition();
    }

    @Override
    public UUID value1() {
        return getComposition();
    }

    @Override
    public AdminGetLinkedCompositionsRecord value1(UUID value) {
        setComposition(value);
        return this;
    }

    @Override
    public AdminGetLinkedCompositionsRecord values(UUID value1) {
        value1(value1);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached AdminGetLinkedCompositionsRecord
     */
    public AdminGetLinkedCompositionsRecord() {
        super(AdminGetLinkedCompositions.ADMIN_GET_LINKED_COMPOSITIONS);
    }

    /**
     * Create a detached, initialised AdminGetLinkedCompositionsRecord
     */
    public AdminGetLinkedCompositionsRecord(UUID composition) {
        super(AdminGetLinkedCompositions.ADMIN_GET_LINKED_COMPOSITIONS);

        set(0, composition);
    }
}
