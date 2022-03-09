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
import org.ehrbase.jooq.pg.udt.DvCodedText;
import org.ehrbase.jooq.pg.udt.records.DvCodedTextRecord;
import org.ehrbase.jooq.pg.tables.records.EventContextRecord;
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
public class EventContext extends TableImpl<EventContextRecord> {

    private static final long serialVersionUID = 519729488;

    /**
     * The reference instance of <code>ehr.event_context</code>
     */
    public static final EventContext EVENT_CONTEXT = new EventContext();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<EventContextRecord> getRecordType() {
        return EventContextRecord.class;
    }

    /**
     * The column <code>ehr.event_context.id</code>.
     */
    public final TableField<EventContextRecord, UUID> ID = createField(DSL.name("id"), org.jooq.impl.SQLDataType.UUID.nullable(false).defaultValue(org.jooq.impl.DSL.field("uuid_generate_v4()", org.jooq.impl.SQLDataType.UUID)), this, "");

    /**
     * The column <code>ehr.event_context.composition_id</code>.
     */
    public final TableField<EventContextRecord, UUID> COMPOSITION_ID = createField(DSL.name("composition_id"), org.jooq.impl.SQLDataType.UUID, this, "");

    /**
     * The column <code>ehr.event_context.start_time</code>.
     */
    public final TableField<EventContextRecord, Timestamp> START_TIME = createField(DSL.name("start_time"), org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false), this, "");

    /**
     * The column <code>ehr.event_context.start_time_tzid</code>.
     */
    public final TableField<EventContextRecord, String> START_TIME_TZID = createField(DSL.name("start_time_tzid"), org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * The column <code>ehr.event_context.end_time</code>.
     */
    public final TableField<EventContextRecord, Timestamp> END_TIME = createField(DSL.name("end_time"), org.jooq.impl.SQLDataType.TIMESTAMP, this, "");

    /**
     * The column <code>ehr.event_context.end_time_tzid</code>.
     */
    public final TableField<EventContextRecord, String> END_TIME_TZID = createField(DSL.name("end_time_tzid"), org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * The column <code>ehr.event_context.facility</code>.
     */
    public final TableField<EventContextRecord, UUID> FACILITY = createField(DSL.name("facility"), org.jooq.impl.SQLDataType.UUID, this, "");

    /**
     * The column <code>ehr.event_context.location</code>.
     */
    public final TableField<EventContextRecord, String> LOCATION = createField(DSL.name("location"), org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * The column <code>ehr.event_context.other_context</code>.
     */
    public final TableField<EventContextRecord, JSONB> OTHER_CONTEXT = createField(DSL.name("other_context"), org.jooq.impl.SQLDataType.JSONB, this, "");

    /**
     * The column <code>ehr.event_context.setting</code>.
     */
    public final TableField<EventContextRecord, DvCodedTextRecord> SETTING = createField(DSL.name("setting"), DvCodedText.DV_CODED_TEXT.getDataType(), this, "");

    /**
     * The column <code>ehr.event_context.sys_transaction</code>.
     */
    public final TableField<EventContextRecord, Timestamp> SYS_TRANSACTION = createField(DSL.name("sys_transaction"), org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false), this, "");

    /**
     * The column <code>ehr.event_context.sys_period</code>.
     */
    public final TableField<EventContextRecord, java.util.AbstractMap.SimpleEntry<java.time.OffsetDateTime,
                                        java.time.OffsetDateTime>> SYS_PERIOD = createField(DSL.name("sys_period"), org.jooq.impl.DefaultDataType.getDefaultDataType("\"pg_catalog\".\"tstzrange\"").defaultValue(org.jooq.impl.DSL.field("tstzrange(now(), NULL::timestamp with time zone)", org.jooq.impl.SQLDataType.OTHER)), this, "", new SysPeriodBinder());

    /**
     * The column <code>ehr.event_context.ehr_id</code>.
     */
    public final TableField<EventContextRecord, UUID> EHR_ID = createField(DSL.name("ehr_id"), org.jooq.impl.SQLDataType.UUID.nullable(false), this, "");

    /**
     * Create a <code>ehr.event_context</code> table reference
     */
    public EventContext() {
        this(DSL.name("event_context"), null);
    }

    /**
     * Create an aliased <code>ehr.event_context</code> table reference
     */
    public EventContext(String alias) {
        this(DSL.name(alias), EVENT_CONTEXT);
    }

    /**
     * Create an aliased <code>ehr.event_context</code> table reference
     */
    public EventContext(Name alias) {
        this(alias, EVENT_CONTEXT);
    }

    private EventContext(Name alias, Table<EventContextRecord> aliased) {
        this(alias, aliased, null);
    }

    private EventContext(Name alias, Table<EventContextRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> EventContext(Table<O> child, ForeignKey<O, EventContextRecord> key) {
        super(child, key, EVENT_CONTEXT);
    }

    @Override
    public Schema getSchema() {
        return Ehr.EHR;
    }

    @Override
    public List<Index> getIndexes() {
        return Arrays.<Index>asList(Indexes.CONTEXT_COMPOSITION_ID_IDX, Indexes.CONTEXT_FACILITY_IDX, Indexes.CONTEXT_SETTING_IDX, Indexes.EVENT_CONTEXT_PKEY);
    }

    @Override
    public UniqueKey<EventContextRecord> getPrimaryKey() {
        return Keys.EVENT_CONTEXT_PKEY;
    }

    @Override
    public List<UniqueKey<EventContextRecord>> getKeys() {
        return Arrays.<UniqueKey<EventContextRecord>>asList(Keys.EVENT_CONTEXT_PKEY);
    }

    @Override
    public List<ForeignKey<EventContextRecord, ?>> getReferences() {
        return Arrays.<ForeignKey<EventContextRecord, ?>>asList(Keys.EVENT_CONTEXT__EVENT_CONTEXT_COMPOSITION_ID_FKEY, Keys.EVENT_CONTEXT__EVENT_CONTEXT_FACILITY_FKEY);
    }

    public Composition composition() {
        return new Composition(this, Keys.EVENT_CONTEXT__EVENT_CONTEXT_COMPOSITION_ID_FKEY);
    }

    public PartyIdentified partyIdentified() {
        return new PartyIdentified(this, Keys.EVENT_CONTEXT__EVENT_CONTEXT_FACILITY_FKEY);
    }

    @Override
    public EventContext as(String alias) {
        return new EventContext(DSL.name(alias), this);
    }

    @Override
    public EventContext as(Name alias) {
        return new EventContext(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public EventContext rename(String name) {
        return new EventContext(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public EventContext rename(Name name) {
        return new EventContext(name, null);
    }

    // -------------------------------------------------------------------------
    // Row13 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row13<UUID, UUID, Timestamp, String, Timestamp, String, UUID, String, JSONB, DvCodedTextRecord, Timestamp, java.util.AbstractMap.SimpleEntry<java.time.OffsetDateTime,
                                        java.time.OffsetDateTime>, UUID> fieldsRow() {
        return (Row13) super.fieldsRow();
    }
}