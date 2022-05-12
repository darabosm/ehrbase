/*
 * This file is generated by jOOQ.
 */
package org.ehrbase.jooq.pg.tables.records;


import java.sql.Timestamp;
import java.util.AbstractMap.SimpleEntry;
import java.util.UUID;

import org.ehrbase.jooq.pg.tables.FolderItemsHistory;
import org.jooq.Field;
import org.jooq.Record3;
import org.jooq.Record5;
import org.jooq.Row5;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class FolderItemsHistoryRecord extends UpdatableRecordImpl<FolderItemsHistoryRecord> implements Record5<UUID, UUID, UUID, Timestamp, SimpleEntry<java.time.OffsetDateTime, java.time.OffsetDateTime>> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>ehr.folder_items_history.folder_id</code>.
     */
    public void setFolderId(UUID value) {
        set(0, value);
    }

    /**
     * Getter for <code>ehr.folder_items_history.folder_id</code>.
     */
    public UUID getFolderId() {
        return (UUID) get(0);
    }

    /**
     * Setter for <code>ehr.folder_items_history.object_ref_id</code>.
     */
    public void setObjectRefId(UUID value) {
        set(1, value);
    }

    /**
     * Getter for <code>ehr.folder_items_history.object_ref_id</code>.
     */
    public UUID getObjectRefId() {
        return (UUID) get(1);
    }

    /**
     * Setter for <code>ehr.folder_items_history.in_contribution</code>.
     */
    public void setInContribution(UUID value) {
        set(2, value);
    }

    /**
     * Getter for <code>ehr.folder_items_history.in_contribution</code>.
     */
    public UUID getInContribution() {
        return (UUID) get(2);
    }

    /**
     * Setter for <code>ehr.folder_items_history.sys_transaction</code>.
     */
    public void setSysTransaction(Timestamp value) {
        set(3, value);
    }

    /**
     * Getter for <code>ehr.folder_items_history.sys_transaction</code>.
     */
    public Timestamp getSysTransaction() {
        return (Timestamp) get(3);
    }

    /**
     * Setter for <code>ehr.folder_items_history.sys_period</code>.
     */
    public void setSysPeriod(SimpleEntry<java.time.OffsetDateTime, java.time.OffsetDateTime> value) {
        set(4, value);
    }

    /**
     * Getter for <code>ehr.folder_items_history.sys_period</code>.
     */
    public SimpleEntry<java.time.OffsetDateTime, java.time.OffsetDateTime> getSysPeriod() {
        return (SimpleEntry<java.time.OffsetDateTime, java.time.OffsetDateTime>) get(4);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record3<UUID, UUID, UUID> key() {
        return (Record3) super.key();
    }

    // -------------------------------------------------------------------------
    // Record5 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row5<UUID, UUID, UUID, Timestamp, SimpleEntry<java.time.OffsetDateTime, java.time.OffsetDateTime>> fieldsRow() {
        return (Row5) super.fieldsRow();
    }

    @Override
    public Row5<UUID, UUID, UUID, Timestamp, SimpleEntry<java.time.OffsetDateTime, java.time.OffsetDateTime>> valuesRow() {
        return (Row5) super.valuesRow();
    }

    @Override
    public Field<UUID> field1() {
        return FolderItemsHistory.FOLDER_ITEMS_HISTORY.FOLDER_ID;
    }

    @Override
    public Field<UUID> field2() {
        return FolderItemsHistory.FOLDER_ITEMS_HISTORY.OBJECT_REF_ID;
    }

    @Override
    public Field<UUID> field3() {
        return FolderItemsHistory.FOLDER_ITEMS_HISTORY.IN_CONTRIBUTION;
    }

    @Override
    public Field<Timestamp> field4() {
        return FolderItemsHistory.FOLDER_ITEMS_HISTORY.SYS_TRANSACTION;
    }

    @Override
    public Field<SimpleEntry<java.time.OffsetDateTime, java.time.OffsetDateTime>> field5() {
        return FolderItemsHistory.FOLDER_ITEMS_HISTORY.SYS_PERIOD;
    }

    @Override
    public UUID component1() {
        return getFolderId();
    }

    @Override
    public UUID component2() {
        return getObjectRefId();
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
    public SimpleEntry<java.time.OffsetDateTime, java.time.OffsetDateTime> component5() {
        return getSysPeriod();
    }

    @Override
    public UUID value1() {
        return getFolderId();
    }

    @Override
    public UUID value2() {
        return getObjectRefId();
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
    public SimpleEntry<java.time.OffsetDateTime, java.time.OffsetDateTime> value5() {
        return getSysPeriod();
    }

    @Override
    public FolderItemsHistoryRecord value1(UUID value) {
        setFolderId(value);
        return this;
    }

    @Override
    public FolderItemsHistoryRecord value2(UUID value) {
        setObjectRefId(value);
        return this;
    }

    @Override
    public FolderItemsHistoryRecord value3(UUID value) {
        setInContribution(value);
        return this;
    }

    @Override
    public FolderItemsHistoryRecord value4(Timestamp value) {
        setSysTransaction(value);
        return this;
    }

    @Override
    public FolderItemsHistoryRecord value5(SimpleEntry<java.time.OffsetDateTime, java.time.OffsetDateTime> value) {
        setSysPeriod(value);
        return this;
    }

    @Override
    public FolderItemsHistoryRecord values(UUID value1, UUID value2, UUID value3, Timestamp value4, SimpleEntry<java.time.OffsetDateTime, java.time.OffsetDateTime> value5) {
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
     * Create a detached FolderItemsHistoryRecord
     */
    public FolderItemsHistoryRecord() {
        super(FolderItemsHistory.FOLDER_ITEMS_HISTORY);
    }

    /**
     * Create a detached, initialised FolderItemsHistoryRecord
     */
    public FolderItemsHistoryRecord(UUID folderId, UUID objectRefId, UUID inContribution, Timestamp sysTransaction, SimpleEntry<java.time.OffsetDateTime, java.time.OffsetDateTime> sysPeriod) {
        super(FolderItemsHistory.FOLDER_ITEMS_HISTORY);

        setFolderId(folderId);
        setObjectRefId(objectRefId);
        setInContribution(inContribution);
        setSysTransaction(sysTransaction);
        setSysPeriod(sysPeriod);
    }
}