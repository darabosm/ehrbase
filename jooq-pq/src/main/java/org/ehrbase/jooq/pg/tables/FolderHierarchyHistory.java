/*
 * This file is generated by jOOQ.
 */
package org.ehrbase.jooq.pg.tables;


import java.sql.Timestamp;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;

import javax.annotation.processing.Generated;

import org.ehrbase.jooq.binding.SysPeriodBinder;
import org.ehrbase.jooq.pg.Ehr;
import org.ehrbase.jooq.pg.Indexes;
import org.ehrbase.jooq.pg.Keys;
import org.ehrbase.jooq.pg.tables.records.FolderHierarchyHistoryRecord;
import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Index;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row5;
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
public class FolderHierarchyHistory extends TableImpl<FolderHierarchyHistoryRecord> {

    private static final long serialVersionUID = -22841695;

    /**
     * The reference instance of <code>ehr.folder_hierarchy_history</code>
     */
    public static final FolderHierarchyHistory FOLDER_HIERARCHY_HISTORY = new FolderHierarchyHistory();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<FolderHierarchyHistoryRecord> getRecordType() {
        return FolderHierarchyHistoryRecord.class;
    }

    /**
     * The column <code>ehr.folder_hierarchy_history.parent_folder</code>.
     */
    public final TableField<FolderHierarchyHistoryRecord, UUID> PARENT_FOLDER = createField(DSL.name("parent_folder"), org.jooq.impl.SQLDataType.UUID.nullable(false), this, "");

    /**
     * The column <code>ehr.folder_hierarchy_history.child_folder</code>.
     */
    public final TableField<FolderHierarchyHistoryRecord, UUID> CHILD_FOLDER = createField(DSL.name("child_folder"), org.jooq.impl.SQLDataType.UUID.nullable(false), this, "");

    /**
     * The column <code>ehr.folder_hierarchy_history.in_contribution</code>.
     */
    public final TableField<FolderHierarchyHistoryRecord, UUID> IN_CONTRIBUTION = createField(DSL.name("in_contribution"), org.jooq.impl.SQLDataType.UUID.nullable(false), this, "");

    /**
     * The column <code>ehr.folder_hierarchy_history.sys_transaction</code>.
     */
    public final TableField<FolderHierarchyHistoryRecord, Timestamp> SYS_TRANSACTION = createField(DSL.name("sys_transaction"), org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false), this, "");

    /**
     * The column <code>ehr.folder_hierarchy_history.sys_period</code>.
     */
    public final TableField<FolderHierarchyHistoryRecord, java.util.AbstractMap.SimpleEntry<java.time.OffsetDateTime,
                                        java.time.OffsetDateTime>> SYS_PERIOD = createField(DSL.name("sys_period"), org.jooq.impl.DefaultDataType.getDefaultDataType("\"pg_catalog\".\"tstzrange\"").nullable(false), this, "", new SysPeriodBinder());

    /**
     * Create a <code>ehr.folder_hierarchy_history</code> table reference
     */
    public FolderHierarchyHistory() {
        this(DSL.name("folder_hierarchy_history"), null);
    }

    /**
     * Create an aliased <code>ehr.folder_hierarchy_history</code> table reference
     */
    public FolderHierarchyHistory(String alias) {
        this(DSL.name(alias), FOLDER_HIERARCHY_HISTORY);
    }

    /**
     * Create an aliased <code>ehr.folder_hierarchy_history</code> table reference
     */
    public FolderHierarchyHistory(Name alias) {
        this(alias, FOLDER_HIERARCHY_HISTORY);
    }

    private FolderHierarchyHistory(Name alias, Table<FolderHierarchyHistoryRecord> aliased) {
        this(alias, aliased, null);
    }

    private FolderHierarchyHistory(Name alias, Table<FolderHierarchyHistoryRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> FolderHierarchyHistory(Table<O> child, ForeignKey<O, FolderHierarchyHistoryRecord> key) {
        super(child, key, FOLDER_HIERARCHY_HISTORY);
    }

    @Override
    public Schema getSchema() {
        return Ehr.EHR;
    }

    @Override
    public List<Index> getIndexes() {
        return Arrays.<Index>asList(Indexes.FOLDER_HIERARCHY_HISTORY_CONTRIBUTION_IDX, Indexes.FOLDER_HIERARCHY_HISTORY_PKEY);
    }

    @Override
    public UniqueKey<FolderHierarchyHistoryRecord> getPrimaryKey() {
        return Keys.FOLDER_HIERARCHY_HISTORY_PKEY;
    }

    @Override
    public List<UniqueKey<FolderHierarchyHistoryRecord>> getKeys() {
        return Arrays.<UniqueKey<FolderHierarchyHistoryRecord>>asList(Keys.FOLDER_HIERARCHY_HISTORY_PKEY);
    }

    @Override
    public FolderHierarchyHistory as(String alias) {
        return new FolderHierarchyHistory(DSL.name(alias), this);
    }

    @Override
    public FolderHierarchyHistory as(Name alias) {
        return new FolderHierarchyHistory(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public FolderHierarchyHistory rename(String name) {
        return new FolderHierarchyHistory(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public FolderHierarchyHistory rename(Name name) {
        return new FolderHierarchyHistory(name, null);
    }

    // -------------------------------------------------------------------------
    // Row5 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row5<UUID, UUID, UUID, Timestamp, java.util.AbstractMap.SimpleEntry<java.time.OffsetDateTime,
                                        java.time.OffsetDateTime>> fieldsRow() {
        return (Row5) super.fieldsRow();
    }
}