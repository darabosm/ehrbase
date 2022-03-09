/*
 * This file is generated by jOOQ.
 */
package org.ehrbase.jooq.pg.tables.records;


import java.sql.Timestamp;
import java.util.UUID;

import javax.annotation.processing.Generated;

import org.ehrbase.jooq.pg.tables.FolderHierarchy;
import org.jooq.Field;
import org.jooq.Record2;
import org.jooq.Record5;
import org.jooq.Row5;
import org.jooq.impl.UpdatableRecordImpl;


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
public class FolderHierarchyRecord extends UpdatableRecordImpl<FolderHierarchyRecord> implements Record5<UUID, UUID, UUID, Timestamp, java.util.AbstractMap.SimpleEntry<java.time.OffsetDateTime,
                                        java.time.OffsetDateTime>> {

    private static final long serialVersionUID = -792527959;

    /**
     * Setter for <code>ehr.folder_hierarchy.parent_folder</code>.
     */
    public void setParentFolder(UUID value) {
        set(0, value);
    }

    /**
     * Getter for <code>ehr.folder_hierarchy.parent_folder</code>.
     */
    public UUID getParentFolder() {
        return (UUID) get(0);
    }

    /**
     * Setter for <code>ehr.folder_hierarchy.child_folder</code>.
     */
    public void setChildFolder(UUID value) {
        set(1, value);
    }

    /**
     * Getter for <code>ehr.folder_hierarchy.child_folder</code>.
     */
    public UUID getChildFolder() {
        return (UUID) get(1);
    }

    /**
     * Setter for <code>ehr.folder_hierarchy.in_contribution</code>.
     */
    public void setInContribution(UUID value) {
        set(2, value);
    }

    /**
     * Getter for <code>ehr.folder_hierarchy.in_contribution</code>.
     */
    public UUID getInContribution() {
        return (UUID) get(2);
    }

    /**
     * Setter for <code>ehr.folder_hierarchy.sys_transaction</code>.
     */
    public void setSysTransaction(Timestamp value) {
        set(3, value);
    }

    /**
     * Getter for <code>ehr.folder_hierarchy.sys_transaction</code>.
     */
    public Timestamp getSysTransaction() {
        return (Timestamp) get(3);
    }

    /**
     * Setter for <code>ehr.folder_hierarchy.sys_period</code>.
     */
    public void setSysPeriod(java.util.AbstractMap.SimpleEntry<java.time.OffsetDateTime,
                                        java.time.OffsetDateTime> value) {
        set(4, value);
    }

    /**
     * Getter for <code>ehr.folder_hierarchy.sys_period</code>.
     */
    public java.util.AbstractMap.SimpleEntry<java.time.OffsetDateTime,
                                        java.time.OffsetDateTime> getSysPeriod() {
        return (java.util.AbstractMap.SimpleEntry<java.time.OffsetDateTime,
                                        java.time.OffsetDateTime>) get(4);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record2<UUID, UUID> key() {
        return (Record2) super.key();
    }

    // -------------------------------------------------------------------------
    // Record5 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row5<UUID, UUID, UUID, Timestamp, java.util.AbstractMap.SimpleEntry<java.time.OffsetDateTime,
                                        java.time.OffsetDateTime>> fieldsRow() {
        return (Row5) super.fieldsRow();
    }

    @Override
    public Row5<UUID, UUID, UUID, Timestamp, java.util.AbstractMap.SimpleEntry<java.time.OffsetDateTime,
                                        java.time.OffsetDateTime>> valuesRow() {
        return (Row5) super.valuesRow();
    }

    @Override
    public Field<UUID> field1() {
        return FolderHierarchy.FOLDER_HIERARCHY.PARENT_FOLDER;
    }

    @Override
    public Field<UUID> field2() {
        return FolderHierarchy.FOLDER_HIERARCHY.CHILD_FOLDER;
    }

    @Override
    public Field<UUID> field3() {
        return FolderHierarchy.FOLDER_HIERARCHY.IN_CONTRIBUTION;
    }

    @Override
    public Field<Timestamp> field4() {
        return FolderHierarchy.FOLDER_HIERARCHY.SYS_TRANSACTION;
    }

    @Override
    public Field<java.util.AbstractMap.SimpleEntry<java.time.OffsetDateTime,
                                        java.time.OffsetDateTime>> field5() {
        return FolderHierarchy.FOLDER_HIERARCHY.SYS_PERIOD;
    }

    @Override
    public UUID component1() {
        return getParentFolder();
    }

    @Override
    public UUID component2() {
        return getChildFolder();
    }

    @Override
    public UUID component3() {
        return getInContribution();
    }

    @Override
    public Timestamp component4() {
        return getSysTransaction();
    }

    @Override
    public java.util.AbstractMap.SimpleEntry<java.time.OffsetDateTime,
                                        java.time.OffsetDateTime> component5() {
        return getSysPeriod();
    }

    @Override
    public UUID value1() {
        return getParentFolder();
    }

    @Override
    public UUID value2() {
        return getChildFolder();
    }

    @Override
    public UUID value3() {
        return getInContribution();
    }

    @Override
    public Timestamp value4() {
        return getSysTransaction();
    }

    @Override
    public java.util.AbstractMap.SimpleEntry<java.time.OffsetDateTime,
                                        java.time.OffsetDateTime> value5() {
        return getSysPeriod();
    }

    @Override
    public FolderHierarchyRecord value1(UUID value) {
        setParentFolder(value);
        return this;
    }

    @Override
    public FolderHierarchyRecord value2(UUID value) {
        setChildFolder(value);
        return this;
    }

    @Override
    public FolderHierarchyRecord value3(UUID value) {
        setInContribution(value);
        return this;
    }

    @Override
    public FolderHierarchyRecord value4(Timestamp value) {
        setSysTransaction(value);
        return this;
    }

    @Override
    public FolderHierarchyRecord value5(java.util.AbstractMap.SimpleEntry<java.time.OffsetDateTime,
                                        java.time.OffsetDateTime> value) {
        setSysPeriod(value);
        return this;
    }

    @Override
    public FolderHierarchyRecord values(UUID value1, UUID value2, UUID value3, Timestamp value4, java.util.AbstractMap.SimpleEntry<java.time.OffsetDateTime,
                                        java.time.OffsetDateTime> value5) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached FolderHierarchyRecord
     */
    public FolderHierarchyRecord() {
        super(FolderHierarchy.FOLDER_HIERARCHY);
    }

    /**
     * Create a detached, initialised FolderHierarchyRecord
     */
    public FolderHierarchyRecord(UUID parentFolder, UUID childFolder, UUID inContribution, Timestamp sysTransaction, java.util.AbstractMap.SimpleEntry<java.time.OffsetDateTime,
                                        java.time.OffsetDateTime> sysPeriod) {
        super(FolderHierarchy.FOLDER_HIERARCHY);

        set(0, parentFolder);
        set(1, childFolder);
        set(2, inContribution);
        set(3, sysTransaction);
        set(4, sysPeriod);
    }
}