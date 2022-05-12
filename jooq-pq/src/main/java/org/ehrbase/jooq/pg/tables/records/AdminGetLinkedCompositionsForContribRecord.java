/*
 * This file is generated by jOOQ.
 */
package org.ehrbase.jooq.pg.tables.records;


import java.util.UUID;

import org.ehrbase.jooq.pg.tables.AdminGetLinkedCompositionsForContrib;
import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Row1;
import org.jooq.impl.TableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class AdminGetLinkedCompositionsForContribRecord extends TableRecordImpl<AdminGetLinkedCompositionsForContribRecord> implements Record1<UUID> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for
     * <code>ehr.admin_get_linked_compositions_for_contrib.composition</code>.
     */
    public void setComposition(UUID value) {
        set(0, value);
    }

    /**
     * Getter for
     * <code>ehr.admin_get_linked_compositions_for_contrib.composition</code>.
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
        return AdminGetLinkedCompositionsForContrib.ADMIN_GET_LINKED_COMPOSITIONS_FOR_CONTRIB.COMPOSITION;
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
    public AdminGetLinkedCompositionsForContribRecord value1(UUID value) {
        setComposition(value);
        return this;
    }

    @Override
    public AdminGetLinkedCompositionsForContribRecord values(UUID value1) {
        value1(value1);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached AdminGetLinkedCompositionsForContribRecord
     */
    public AdminGetLinkedCompositionsForContribRecord() {
        super(AdminGetLinkedCompositionsForContrib.ADMIN_GET_LINKED_COMPOSITIONS_FOR_CONTRIB);
    }

    /**
     * Create a detached, initialised AdminGetLinkedCompositionsForContribRecord
     */
    public AdminGetLinkedCompositionsForContribRecord(UUID composition) {
        super(AdminGetLinkedCompositionsForContrib.ADMIN_GET_LINKED_COMPOSITIONS_FOR_CONTRIB);

        setComposition(composition);
    }
}