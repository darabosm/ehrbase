/*
 * This file is generated by jOOQ.
 */
package org.ehrbase.jooq.pg.tables;


import com.nedap.archie.rm.datastructures.ItemStructure;

import java.sql.Timestamp;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;

import javax.annotation.processing.Generated;

import org.ehrbase.jooq.binding.OtherDetailsJsonbBinder;
import org.ehrbase.jooq.binding.SysPeriodBinder;
import org.ehrbase.jooq.pg.Ehr;
import org.ehrbase.jooq.pg.Indexes;
import org.ehrbase.jooq.pg.Keys;
import org.ehrbase.jooq.pg.tables.records.FolderRecord;
import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Index;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row9;
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
public class Folder extends TableImpl<FolderRecord> {

    private static final long serialVersionUID = -1668255719;

    /**
     * The reference instance of <code>ehr.folder</code>
     */
    public static final Folder FOLDER = new Folder();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<FolderRecord> getRecordType() {
        return FolderRecord.class;
    }

    /**
     * The column <code>ehr.folder.id</code>.
     */
    public final TableField<FolderRecord, UUID> ID = createField(DSL.name("id"), org.jooq.impl.SQLDataType.UUID.nullable(false).defaultValue(org.jooq.impl.DSL.field("uuid_generate_v4()", org.jooq.impl.SQLDataType.UUID)), this, "");

    /**
     * The column <code>ehr.folder.in_contribution</code>.
     */
    public final TableField<FolderRecord, UUID> IN_CONTRIBUTION = createField(DSL.name("in_contribution"), org.jooq.impl.SQLDataType.UUID.nullable(false), this, "");

    /**
     * The column <code>ehr.folder.name</code>.
     */
    public final TableField<FolderRecord, String> NAME = createField(DSL.name("name"), org.jooq.impl.SQLDataType.CLOB.nullable(false), this, "");

    /**
     * The column <code>ehr.folder.archetype_node_id</code>.
     */
    public final TableField<FolderRecord, String> ARCHETYPE_NODE_ID = createField(DSL.name("archetype_node_id"), org.jooq.impl.SQLDataType.CLOB.nullable(false), this, "");

    /**
     * The column <code>ehr.folder.active</code>.
     */
    public final TableField<FolderRecord, Boolean> ACTIVE = createField(DSL.name("active"), org.jooq.impl.SQLDataType.BOOLEAN.defaultValue(org.jooq.impl.DSL.field("true", org.jooq.impl.SQLDataType.BOOLEAN)), this, "");

    /**
     * The column <code>ehr.folder.details</code>.
     */
    public final TableField<FolderRecord, ItemStructure> DETAILS = createField(DSL.name("details"), org.jooq.impl.SQLDataType.JSONB, this, "", new OtherDetailsJsonbBinder());

    /**
     * The column <code>ehr.folder.sys_transaction</code>.
     */
    public final TableField<FolderRecord, Timestamp> SYS_TRANSACTION = createField(DSL.name("sys_transaction"), org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false), this, "");

    /**
     * The column <code>ehr.folder.sys_period</code>.
     */
    public final TableField<FolderRecord, java.util.AbstractMap.SimpleEntry<java.time.OffsetDateTime,
                                        java.time.OffsetDateTime>> SYS_PERIOD = createField(DSL.name("sys_period"), org.jooq.impl.DefaultDataType.getDefaultDataType("\"pg_catalog\".\"tstzrange\"").nullable(false), this, "", new SysPeriodBinder());

    /**
     * The column <code>ehr.folder.has_audit</code>.
     */
    public final TableField<FolderRecord, UUID> HAS_AUDIT = createField(DSL.name("has_audit"), org.jooq.impl.SQLDataType.UUID.nullable(false), this, "");

    /**
     * Create a <code>ehr.folder</code> table reference
     */
    public Folder() {
        this(DSL.name("folder"), null);
    }

    /**
     * Create an aliased <code>ehr.folder</code> table reference
     */
    public Folder(String alias) {
        this(DSL.name(alias), FOLDER);
    }

    /**
     * Create an aliased <code>ehr.folder</code> table reference
     */
    public Folder(Name alias) {
        this(alias, FOLDER);
    }

    private Folder(Name alias, Table<FolderRecord> aliased) {
        this(alias, aliased, null);
    }

    private Folder(Name alias, Table<FolderRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> Folder(Table<O> child, ForeignKey<O, FolderRecord> key) {
        super(child, key, FOLDER);
    }

    @Override
    public Schema getSchema() {
        return Ehr.EHR;
    }

    @Override
    public List<Index> getIndexes() {
        return Arrays.<Index>asList(Indexes.FOLDER_IN_CONTRIBUTION_IDX, Indexes.FOLDER_PK);
    }

    @Override
    public UniqueKey<FolderRecord> getPrimaryKey() {
        return Keys.FOLDER_PK;
    }

    @Override
    public List<UniqueKey<FolderRecord>> getKeys() {
        return Arrays.<UniqueKey<FolderRecord>>asList(Keys.FOLDER_PK);
    }

    @Override
    public List<ForeignKey<FolderRecord, ?>> getReferences() {
        return Arrays.<ForeignKey<FolderRecord, ?>>asList(Keys.FOLDER__FOLDER_IN_CONTRIBUTION_FKEY, Keys.FOLDER__FOLDER_HAS_AUDIT_FKEY);
    }

    public Contribution contribution() {
        return new Contribution(this, Keys.FOLDER__FOLDER_IN_CONTRIBUTION_FKEY);
    }

    public AuditDetails auditDetails() {
        return new AuditDetails(this, Keys.FOLDER__FOLDER_HAS_AUDIT_FKEY);
    }

    @Override
    public Folder as(String alias) {
        return new Folder(DSL.name(alias), this);
    }

    @Override
    public Folder as(Name alias) {
        return new Folder(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Folder rename(String name) {
        return new Folder(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Folder rename(Name name) {
        return new Folder(name, null);
    }

    // -------------------------------------------------------------------------
    // Row9 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row9<UUID, UUID, String, String, Boolean, ItemStructure, Timestamp, java.util.AbstractMap.SimpleEntry<java.time.OffsetDateTime,
                                        java.time.OffsetDateTime>, UUID> fieldsRow() {
        return (Row9) super.fieldsRow();
    }
}