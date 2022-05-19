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
import org.ehrbase.jooq.pg.tables.records.CompositionHistoryRecord;
import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Index;
import org.jooq.JSONB;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row14;
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
public class CompositionHistory extends TableImpl<CompositionHistoryRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>ehr.composition_history</code>
     */
    public static final CompositionHistory COMPOSITION_HISTORY = new CompositionHistory();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<CompositionHistoryRecord> getRecordType() {
        return CompositionHistoryRecord.class;
    }

    /**
     * The column <code>ehr.composition_history.id</code>.
     */
    public final TableField<CompositionHistoryRecord, UUID> ID =
            createField(DSL.name("id"), SQLDataType.UUID.nullable(false), this, "");

    /**
     * The column <code>ehr.composition_history.ehr_id</code>.
     */
    public final TableField<CompositionHistoryRecord, UUID> EHR_ID =
            createField(DSL.name("ehr_id"), SQLDataType.UUID, this, "");

    /**
     * The column <code>ehr.composition_history.in_contribution</code>.
     */
    public final TableField<CompositionHistoryRecord, UUID> IN_CONTRIBUTION =
            createField(DSL.name("in_contribution"), SQLDataType.UUID, this, "");

    /**
     * The column <code>ehr.composition_history.active</code>.
     */
    public final TableField<CompositionHistoryRecord, Boolean> ACTIVE =
            createField(DSL.name("active"), SQLDataType.BOOLEAN, this, "");

    /**
     * The column <code>ehr.composition_history.is_persistent</code>.
     */
    public final TableField<CompositionHistoryRecord, Boolean> IS_PERSISTENT =
            createField(DSL.name("is_persistent"), SQLDataType.BOOLEAN, this, "");

    /**
     * The column <code>ehr.composition_history.language</code>.
     */
    public final TableField<CompositionHistoryRecord, String> LANGUAGE =
            createField(DSL.name("language"), SQLDataType.VARCHAR(5), this, "");

    /**
     * The column <code>ehr.composition_history.territory</code>.
     */
    public final TableField<CompositionHistoryRecord, Integer> TERRITORY =
            createField(DSL.name("territory"), SQLDataType.INTEGER, this, "");

    /**
     * The column <code>ehr.composition_history.composer</code>.
     */
    public final TableField<CompositionHistoryRecord, UUID> COMPOSER =
            createField(DSL.name("composer"), SQLDataType.UUID.nullable(false), this, "");

    /**
     * The column <code>ehr.composition_history.sys_transaction</code>.
     */
    public final TableField<CompositionHistoryRecord, Timestamp> SYS_TRANSACTION =
            createField(DSL.name("sys_transaction"), SQLDataType.TIMESTAMP(6).nullable(false), this, "");

    /**
     * The column <code>ehr.composition_history.sys_period</code>.
     */
    public final TableField<CompositionHistoryRecord, SimpleEntry<java.time.OffsetDateTime, java.time.OffsetDateTime>>
            SYS_PERIOD = createField(
                    DSL.name("sys_period"),
                    org.jooq.impl.DefaultDataType.getDefaultDataType("\"pg_catalog\".\"tstzrange\"")
                            .nullable(false),
                    this,
                    "",
                    new SysPeriodBinder());

    /**
     * The column <code>ehr.composition_history.has_audit</code>.
     */
    public final TableField<CompositionHistoryRecord, UUID> HAS_AUDIT =
            createField(DSL.name("has_audit"), SQLDataType.UUID, this, "");

    /**
     * The column <code>ehr.composition_history.attestation_ref</code>.
     */
    public final TableField<CompositionHistoryRecord, UUID> ATTESTATION_REF =
            createField(DSL.name("attestation_ref"), SQLDataType.UUID, this, "");

    /**
     * The column <code>ehr.composition_history.feeder_audit</code>.
     */
    public final TableField<CompositionHistoryRecord, JSONB> FEEDER_AUDIT =
            createField(DSL.name("feeder_audit"), SQLDataType.JSONB, this, "");

    /**
     * The column <code>ehr.composition_history.links</code>.
     */
    public final TableField<CompositionHistoryRecord, JSONB> LINKS =
            createField(DSL.name("links"), SQLDataType.JSONB, this, "");

    private CompositionHistory(Name alias, Table<CompositionHistoryRecord> aliased) {
        this(alias, aliased, null);
    }

    private CompositionHistory(Name alias, Table<CompositionHistoryRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>ehr.composition_history</code> table reference
     */
    public CompositionHistory(String alias) {
        this(DSL.name(alias), COMPOSITION_HISTORY);
    }

    /**
     * Create an aliased <code>ehr.composition_history</code> table reference
     */
    public CompositionHistory(Name alias) {
        this(alias, COMPOSITION_HISTORY);
    }

    /**
     * Create a <code>ehr.composition_history</code> table reference
     */
    public CompositionHistory() {
        this(DSL.name("composition_history"), null);
    }

    public <O extends Record> CompositionHistory(Table<O> child, ForeignKey<O, CompositionHistoryRecord> key) {
        super(child, key, COMPOSITION_HISTORY);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : Ehr.EHR;
    }

    @Override
    public List<Index> getIndexes() {
        return Arrays.asList(Indexes.COMPOSITION_HISTORY_EHR_IDX, Indexes.EHR_COMPOSITION_HISTORY);
    }

    @Override
    public CompositionHistory as(String alias) {
        return new CompositionHistory(DSL.name(alias), this);
    }

    @Override
    public CompositionHistory as(Name alias) {
        return new CompositionHistory(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public CompositionHistory rename(String name) {
        return new CompositionHistory(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public CompositionHistory rename(Name name) {
        return new CompositionHistory(name, null);
    }

    // -------------------------------------------------------------------------
    // Row14 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row14<
                    UUID,
                    UUID,
                    UUID,
                    Boolean,
                    Boolean,
                    String,
                    Integer,
                    UUID,
                    Timestamp,
                    SimpleEntry<java.time.OffsetDateTime, java.time.OffsetDateTime>,
                    UUID,
                    UUID,
                    JSONB,
                    JSONB>
            fieldsRow() {
        return (Row14) super.fieldsRow();
    }
}
