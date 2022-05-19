/*
 * Copyright (c) 2022 vitasystems GmbH and Hannover Medical School.
 *
 * This file is part of project EHRbase
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.ehrbase.jooq.pg.tables;

import java.sql.Timestamp;
import java.util.AbstractMap.SimpleEntry;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;
import org.ehrbase.jooq.binding.SysPeriodBinder;
import org.ehrbase.jooq.pg.Ehr;
import org.ehrbase.jooq.pg.Indexes;
import org.ehrbase.jooq.pg.Keys;
import org.ehrbase.jooq.pg.tables.records.FolderHierarchyRecord;
import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Index;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row5;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.TableOptions;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.SQLDataType;
import org.jooq.impl.TableImpl;

/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({"all", "unchecked", "rawtypes"})
public class FolderHierarchy extends TableImpl<FolderHierarchyRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>ehr.folder_hierarchy</code>
     */
    public static final FolderHierarchy FOLDER_HIERARCHY = new FolderHierarchy();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<FolderHierarchyRecord> getRecordType() {
        return FolderHierarchyRecord.class;
    }

    /**
     * The column <code>ehr.folder_hierarchy.parent_folder</code>.
     */
    public final TableField<FolderHierarchyRecord, UUID> PARENT_FOLDER =
            createField(DSL.name("parent_folder"), SQLDataType.UUID.nullable(false), this, "");

    /**
     * The column <code>ehr.folder_hierarchy.child_folder</code>.
     */
    public final TableField<FolderHierarchyRecord, UUID> CHILD_FOLDER =
            createField(DSL.name("child_folder"), SQLDataType.UUID.nullable(false), this, "");

    /**
     * The column <code>ehr.folder_hierarchy.in_contribution</code>.
     */
    public final TableField<FolderHierarchyRecord, UUID> IN_CONTRIBUTION =
            createField(DSL.name("in_contribution"), SQLDataType.UUID, this, "");

    /**
     * The column <code>ehr.folder_hierarchy.sys_transaction</code>.
     */
    public final TableField<FolderHierarchyRecord, Timestamp> SYS_TRANSACTION =
            createField(DSL.name("sys_transaction"), SQLDataType.TIMESTAMP(6).nullable(false), this, "");

    /**
     * The column <code>ehr.folder_hierarchy.sys_period</code>.
     */
    public final TableField<FolderHierarchyRecord, SimpleEntry<java.time.OffsetDateTime, java.time.OffsetDateTime>>
            SYS_PERIOD = createField(
                    DSL.name("sys_period"),
                    org.jooq.impl.DefaultDataType.getDefaultDataType("\"pg_catalog\".\"tstzrange\"")
                            .nullable(false),
                    this,
                    "",
                    new SysPeriodBinder());

    private FolderHierarchy(Name alias, Table<FolderHierarchyRecord> aliased) {
        this(alias, aliased, null);
    }

    private FolderHierarchy(Name alias, Table<FolderHierarchyRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>ehr.folder_hierarchy</code> table reference
     */
    public FolderHierarchy(String alias) {
        this(DSL.name(alias), FOLDER_HIERARCHY);
    }

    /**
     * Create an aliased <code>ehr.folder_hierarchy</code> table reference
     */
    public FolderHierarchy(Name alias) {
        this(alias, FOLDER_HIERARCHY);
    }

    /**
     * Create a <code>ehr.folder_hierarchy</code> table reference
     */
    public FolderHierarchy() {
        this(DSL.name("folder_hierarchy"), null);
    }

    public <O extends Record> FolderHierarchy(Table<O> child, ForeignKey<O, FolderHierarchyRecord> key) {
        super(child, key, FOLDER_HIERARCHY);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : Ehr.EHR;
    }

    @Override
    public List<Index> getIndexes() {
        return Arrays.asList(Indexes.FKI_FOLDER_HIERARCHY_PARENT_FK, Indexes.FOLDER_HIERARCHY_IN_CONTRIBUTION_IDX);
    }

    @Override
    public UniqueKey<FolderHierarchyRecord> getPrimaryKey() {
        return Keys.FOLDER_HIERARCHY_PKEY;
    }

    @Override
    public List<UniqueKey<FolderHierarchyRecord>> getUniqueKeys() {
        return Arrays.asList(Keys.UQ_FOLDERHIERARCHY_PARENT_CHILD);
    }

    @Override
    public List<ForeignKey<FolderHierarchyRecord, ?>> getReferences() {
        return Arrays.asList(
                Keys.FOLDER_HIERARCHY__FOLDER_HIERARCHY_PARENT_FK,
                Keys.FOLDER_HIERARCHY__FOLDER_HIERARCHY_IN_CONTRIBUTION_FK);
    }

    private transient Folder _folder;
    private transient Contribution _contribution;

    /**
     * Get the implicit join path to the <code>ehr.folder</code> table.
     */
    public Folder folder() {
        if (_folder == null) _folder = new Folder(this, Keys.FOLDER_HIERARCHY__FOLDER_HIERARCHY_PARENT_FK);

        return _folder;
    }

    /**
     * Get the implicit join path to the <code>ehr.contribution</code> table.
     */
    public Contribution contribution() {
        if (_contribution == null)
            _contribution = new Contribution(this, Keys.FOLDER_HIERARCHY__FOLDER_HIERARCHY_IN_CONTRIBUTION_FK);

        return _contribution;
    }

    @Override
    public FolderHierarchy as(String alias) {
        return new FolderHierarchy(DSL.name(alias), this);
    }

    @Override
    public FolderHierarchy as(Name alias) {
        return new FolderHierarchy(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public FolderHierarchy rename(String name) {
        return new FolderHierarchy(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public FolderHierarchy rename(Name name) {
        return new FolderHierarchy(name, null);
    }

    // -------------------------------------------------------------------------
    // Row5 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row5<UUID, UUID, UUID, Timestamp, SimpleEntry<java.time.OffsetDateTime, java.time.OffsetDateTime>>
            fieldsRow() {
        return (Row5) super.fieldsRow();
    }
}
