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
import org.ehrbase.jooq.pg.enums.EntryType;
import org.ehrbase.jooq.pg.tables.records.EntryHistoryRecord;
import org.ehrbase.jooq.pg.udt.records.DvCodedTextRecord;
import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Index;
import org.jooq.JSONB;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row13;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.TableOptions;
import org.jooq.impl.DSL;
import org.jooq.impl.SQLDataType;
import org.jooq.impl.TableImpl;

/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({"all", "unchecked", "rawtypes"})
public class EntryHistory extends TableImpl<EntryHistoryRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>ehr.entry_history</code>
     */
    public static final EntryHistory ENTRY_HISTORY = new EntryHistory();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<EntryHistoryRecord> getRecordType() {
        return EntryHistoryRecord.class;
    }

    /**
     * The column <code>ehr.entry_history.id</code>.
     */
    public final TableField<EntryHistoryRecord, UUID> ID =
            createField(DSL.name("id"), SQLDataType.UUID.nullable(false), this, "");

    /**
     * The column <code>ehr.entry_history.composition_id</code>.
     */
    public final TableField<EntryHistoryRecord, UUID> COMPOSITION_ID =
            createField(DSL.name("composition_id"), SQLDataType.UUID, this, "");

    /**
     * The column <code>ehr.entry_history.sequence</code>.
     */
    public final TableField<EntryHistoryRecord, Integer> SEQUENCE =
            createField(DSL.name("sequence"), SQLDataType.INTEGER, this, "");

    /**
     * The column <code>ehr.entry_history.item_type</code>.
     */
    public final TableField<EntryHistoryRecord, EntryType> ITEM_TYPE = createField(
            DSL.name("item_type"),
            SQLDataType.VARCHAR.asEnumDataType(org.ehrbase.jooq.pg.enums.EntryType.class),
            this,
            "");

    /**
     * The column <code>ehr.entry_history.template_id</code>.
     */
    public final TableField<EntryHistoryRecord, String> TEMPLATE_ID =
            createField(DSL.name("template_id"), SQLDataType.CLOB, this, "");

    /**
     * The column <code>ehr.entry_history.template_uuid</code>.
     */
    public final TableField<EntryHistoryRecord, UUID> TEMPLATE_UUID =
            createField(DSL.name("template_uuid"), SQLDataType.UUID, this, "");

    /**
     * The column <code>ehr.entry_history.archetype_id</code>.
     */
    public final TableField<EntryHistoryRecord, String> ARCHETYPE_ID =
            createField(DSL.name("archetype_id"), SQLDataType.CLOB, this, "");

    /**
     * The column <code>ehr.entry_history.category</code>.
     */
    public final TableField<EntryHistoryRecord, DvCodedTextRecord> CATEGORY = createField(
            DSL.name("category"), org.ehrbase.jooq.pg.udt.DvCodedText.DV_CODED_TEXT.getDataType(), this, "");

    /**
     * The column <code>ehr.entry_history.entry</code>.
     */
    public final TableField<EntryHistoryRecord, JSONB> ENTRY =
            createField(DSL.name("entry"), SQLDataType.JSONB, this, "");

    /**
     * The column <code>ehr.entry_history.sys_transaction</code>.
     */
    public final TableField<EntryHistoryRecord, Timestamp> SYS_TRANSACTION =
            createField(DSL.name("sys_transaction"), SQLDataType.TIMESTAMP(6).nullable(false), this, "");

    /**
     * The column <code>ehr.entry_history.sys_period</code>.
     */
    public final TableField<EntryHistoryRecord, SimpleEntry<java.time.OffsetDateTime, java.time.OffsetDateTime>>
            SYS_PERIOD = createField(
                    DSL.name("sys_period"),
                    org.jooq.impl.DefaultDataType.getDefaultDataType("\"pg_catalog\".\"tstzrange\"")
                            .nullable(false),
                    this,
                    "",
                    new SysPeriodBinder());

    /**
     * The column <code>ehr.entry_history.rm_version</code>.
     */
    public final TableField<EntryHistoryRecord, String> RM_VERSION =
            createField(DSL.name("rm_version"), SQLDataType.CLOB, this, "");

    /**
     * The column <code>ehr.entry_history.name</code>.
     */
    public final TableField<EntryHistoryRecord, DvCodedTextRecord> NAME =
            createField(DSL.name("name"), org.ehrbase.jooq.pg.udt.DvCodedText.DV_CODED_TEXT.getDataType(), this, "");

    private EntryHistory(Name alias, Table<EntryHistoryRecord> aliased) {
        this(alias, aliased, null);
    }

    private EntryHistory(Name alias, Table<EntryHistoryRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>ehr.entry_history</code> table reference
     */
    public EntryHistory(String alias) {
        this(DSL.name(alias), ENTRY_HISTORY);
    }

    /**
     * Create an aliased <code>ehr.entry_history</code> table reference
     */
    public EntryHistory(Name alias) {
        this(alias, ENTRY_HISTORY);
    }

    /**
     * Create a <code>ehr.entry_history</code> table reference
     */
    public EntryHistory() {
        this(DSL.name("entry_history"), null);
    }

    public <O extends Record> EntryHistory(Table<O> child, ForeignKey<O, EntryHistoryRecord> key) {
        super(child, key, ENTRY_HISTORY);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : Ehr.EHR;
    }

    @Override
    public List<Index> getIndexes() {
        return Arrays.asList(Indexes.EHR_ENTRY_HISTORY, Indexes.ENTRY_HISTORY_COMPOSITION_IDX);
    }

    @Override
    public EntryHistory as(String alias) {
        return new EntryHistory(DSL.name(alias), this);
    }

    @Override
    public EntryHistory as(Name alias) {
        return new EntryHistory(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public EntryHistory rename(String name) {
        return new EntryHistory(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public EntryHistory rename(Name name) {
        return new EntryHistory(name, null);
    }

    // -------------------------------------------------------------------------
    // Row13 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row13<
                    UUID,
                    UUID,
                    Integer,
                    EntryType,
                    String,
                    UUID,
                    String,
                    DvCodedTextRecord,
                    JSONB,
                    Timestamp,
                    SimpleEntry<java.time.OffsetDateTime, java.time.OffsetDateTime>,
                    String,
                    DvCodedTextRecord>
            fieldsRow() {
        return (Row13) super.fieldsRow();
    }
}
