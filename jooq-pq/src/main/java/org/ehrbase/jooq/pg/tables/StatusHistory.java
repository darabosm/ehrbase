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
import org.ehrbase.jooq.pg.udt.DvCodedText;
import org.ehrbase.jooq.pg.tables.records.StatusHistoryRecord;
import org.ehrbase.jooq.pg.udt.records.DvCodedTextRecord;
import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Index;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row13;
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
public class StatusHistory extends TableImpl<StatusHistoryRecord> {

    private static final long serialVersionUID = -1327502989;

    /**
     * The reference instance of <code>ehr.status_history</code>
     */
    public static final StatusHistory STATUS_HISTORY = new StatusHistory();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<StatusHistoryRecord> getRecordType() {
        return StatusHistoryRecord.class;
    }

    /**
     * The column <code>ehr.status_history.id</code>.
     */
    public final TableField<StatusHistoryRecord, UUID> ID = createField(DSL.name("id"), org.jooq.impl.SQLDataType.UUID.nullable(false), this, "");

    /**
     * The column <code>ehr.status_history.ehr_id</code>.
     */
    public final TableField<StatusHistoryRecord, UUID> EHR_ID = createField(DSL.name("ehr_id"), org.jooq.impl.SQLDataType.UUID, this, "");

    /**
     * The column <code>ehr.status_history.is_queryable</code>.
     */
    public final TableField<StatusHistoryRecord, Boolean> IS_QUERYABLE = createField(DSL.name("is_queryable"), org.jooq.impl.SQLDataType.BOOLEAN, this, "");

    /**
     * The column <code>ehr.status_history.is_modifiable</code>.
     */
    public final TableField<StatusHistoryRecord, Boolean> IS_MODIFIABLE = createField(DSL.name("is_modifiable"), org.jooq.impl.SQLDataType.BOOLEAN, this, "");

    /**
     * The column <code>ehr.status_history.party</code>.
     */
    public final TableField<StatusHistoryRecord, UUID> PARTY = createField(DSL.name("party"), org.jooq.impl.SQLDataType.UUID.nullable(false), this, "");

    /**
     * The column <code>ehr.status_history.other_details</code>.
     */
    public final TableField<StatusHistoryRecord, ItemStructure> OTHER_DETAILS = createField(DSL.name("other_details"), org.jooq.impl.SQLDataType.JSONB, this, "", new OtherDetailsJsonbBinder());

    /**
     * The column <code>ehr.status_history.sys_transaction</code>.
     */
    public final TableField<StatusHistoryRecord, Timestamp> SYS_TRANSACTION = createField(DSL.name("sys_transaction"), org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false), this, "");

    /**
     * The column <code>ehr.status_history.sys_period</code>.
     */
    public final TableField<StatusHistoryRecord, java.util.AbstractMap.SimpleEntry<java.time.OffsetDateTime,
                                        java.time.OffsetDateTime>> SYS_PERIOD = createField(DSL.name("sys_period"), org.jooq.impl.DefaultDataType.getDefaultDataType("\"pg_catalog\".\"tstzrange\"").nullable(false), this, "", new SysPeriodBinder());

    /**
     * The column <code>ehr.status_history.has_audit</code>.
     */
    public final TableField<StatusHistoryRecord, UUID> HAS_AUDIT = createField(DSL.name("has_audit"), org.jooq.impl.SQLDataType.UUID.nullable(false), this, "");

    /**
     * The column <code>ehr.status_history.attestation_ref</code>.
     */
    public final TableField<StatusHistoryRecord, UUID> ATTESTATION_REF = createField(DSL.name("attestation_ref"), org.jooq.impl.SQLDataType.UUID, this, "");

    /**
     * The column <code>ehr.status_history.in_contribution</code>.
     */
    public final TableField<StatusHistoryRecord, UUID> IN_CONTRIBUTION = createField(DSL.name("in_contribution"), org.jooq.impl.SQLDataType.UUID.nullable(false), this, "");

    /**
     * The column <code>ehr.status_history.archetype_node_id</code>.
     */
    public final TableField<StatusHistoryRecord, String> ARCHETYPE_NODE_ID = createField(DSL.name("archetype_node_id"), org.jooq.impl.SQLDataType.CLOB.nullable(false).defaultValue(org.jooq.impl.DSL.field("'openEHR-EHR-EHR_STATUS.generic.v1'::text", org.jooq.impl.SQLDataType.CLOB)), this, "");

    /**
     * The column <code>ehr.status_history.name</code>.
     */
    public final TableField<StatusHistoryRecord, DvCodedTextRecord> NAME = createField(DSL.name("name"), DvCodedText.DV_CODED_TEXT.getDataType(), this, "");

    /**
     * Create a <code>ehr.status_history</code> table reference
     */
    public StatusHistory() {
        this(DSL.name("status_history"), null);
    }

    /**
     * Create an aliased <code>ehr.status_history</code> table reference
     */
    public StatusHistory(String alias) {
        this(DSL.name(alias), STATUS_HISTORY);
    }

    /**
     * Create an aliased <code>ehr.status_history</code> table reference
     */
    public StatusHistory(Name alias) {
        this(alias, STATUS_HISTORY);
    }

    private StatusHistory(Name alias, Table<StatusHistoryRecord> aliased) {
        this(alias, aliased, null);
    }

    private StatusHistory(Name alias, Table<StatusHistoryRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> StatusHistory(Table<O> child, ForeignKey<O, StatusHistoryRecord> key) {
        super(child, key, STATUS_HISTORY);
    }

    @Override
    public Schema getSchema() {
        return Ehr.EHR;
    }

    @Override
    public List<Index> getIndexes() {
        return Arrays.<Index>asList(Indexes.EHR_STATUS_HISTORY, Indexes.STATUS_HISTORY_EHR_IDX);
    }

    @Override
    public StatusHistory as(String alias) {
        return new StatusHistory(DSL.name(alias), this);
    }

    @Override
    public StatusHistory as(Name alias) {
        return new StatusHistory(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public StatusHistory rename(String name) {
        return new StatusHistory(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public StatusHistory rename(Name name) {
        return new StatusHistory(name, null);
    }

    // -------------------------------------------------------------------------
    // Row13 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row13<UUID, UUID, Boolean, Boolean, UUID, ItemStructure, Timestamp, java.util.AbstractMap.SimpleEntry<java.time.OffsetDateTime,
                                        java.time.OffsetDateTime>, UUID, UUID, UUID, String, DvCodedTextRecord> fieldsRow() {
        return (Row13) super.fieldsRow();
    }
}
