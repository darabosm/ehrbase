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

import java.util.Arrays;
import java.util.List;
import java.util.UUID;
import org.ehrbase.jooq.pg.Ehr;
import org.ehrbase.jooq.pg.Indexes;
import org.ehrbase.jooq.pg.Keys;
import org.ehrbase.jooq.pg.enums.PartyRefIdType;
import org.ehrbase.jooq.pg.enums.PartyType;
import org.ehrbase.jooq.pg.tables.records.PartyIdentifiedRecord;
import org.ehrbase.jooq.pg.udt.records.DvCodedTextRecord;
import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Index;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row9;
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
public class PartyIdentified extends TableImpl<PartyIdentifiedRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>ehr.party_identified</code>
     */
    public static final PartyIdentified PARTY_IDENTIFIED = new PartyIdentified();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<PartyIdentifiedRecord> getRecordType() {
        return PartyIdentifiedRecord.class;
    }

    /**
     * The column <code>ehr.party_identified.id</code>.
     */
    public final TableField<PartyIdentifiedRecord, UUID> ID = createField(
            DSL.name("id"),
            SQLDataType.UUID.nullable(false).defaultValue(DSL.field("uuid_generate_v4()", SQLDataType.UUID)),
            this,
            "");

    /**
     * The column <code>ehr.party_identified.name</code>.
     */
    public final TableField<PartyIdentifiedRecord, String> NAME =
            createField(DSL.name("name"), SQLDataType.CLOB, this, "");

    /**
     * The column <code>ehr.party_identified.party_ref_value</code>.
     */
    public final TableField<PartyIdentifiedRecord, String> PARTY_REF_VALUE =
            createField(DSL.name("party_ref_value"), SQLDataType.CLOB, this, "");

    /**
     * The column <code>ehr.party_identified.party_ref_scheme</code>.
     */
    public final TableField<PartyIdentifiedRecord, String> PARTY_REF_SCHEME =
            createField(DSL.name("party_ref_scheme"), SQLDataType.CLOB, this, "");

    /**
     * The column <code>ehr.party_identified.party_ref_namespace</code>.
     */
    public final TableField<PartyIdentifiedRecord, String> PARTY_REF_NAMESPACE =
            createField(DSL.name("party_ref_namespace"), SQLDataType.CLOB, this, "");

    /**
     * The column <code>ehr.party_identified.party_ref_type</code>.
     */
    public final TableField<PartyIdentifiedRecord, String> PARTY_REF_TYPE =
            createField(DSL.name("party_ref_type"), SQLDataType.CLOB, this, "");

    /**
     * The column <code>ehr.party_identified.party_type</code>.
     */
    public final TableField<PartyIdentifiedRecord, PartyType> PARTY_TYPE = createField(
            DSL.name("party_type"),
            SQLDataType.VARCHAR
                    .defaultValue(DSL.field("'party_identified'::ehr.party_type", SQLDataType.VARCHAR))
                    .asEnumDataType(org.ehrbase.jooq.pg.enums.PartyType.class),
            this,
            "");

    /**
     * The column <code>ehr.party_identified.relationship</code>.
     */
    public final TableField<PartyIdentifiedRecord, DvCodedTextRecord> RELATIONSHIP = createField(
            DSL.name("relationship"), org.ehrbase.jooq.pg.udt.DvCodedText.DV_CODED_TEXT.getDataType(), this, "");

    /**
     * The column <code>ehr.party_identified.object_id_type</code>.
     */
    public final TableField<PartyIdentifiedRecord, PartyRefIdType> OBJECT_ID_TYPE = createField(
            DSL.name("object_id_type"),
            SQLDataType.VARCHAR
                    .defaultValue(DSL.field("'generic_id'::ehr.party_ref_id_type", SQLDataType.VARCHAR))
                    .asEnumDataType(org.ehrbase.jooq.pg.enums.PartyRefIdType.class),
            this,
            "");

    private PartyIdentified(Name alias, Table<PartyIdentifiedRecord> aliased) {
        this(alias, aliased, null);
    }

    private PartyIdentified(Name alias, Table<PartyIdentifiedRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>ehr.party_identified</code> table reference
     */
    public PartyIdentified(String alias) {
        this(DSL.name(alias), PARTY_IDENTIFIED);
    }

    /**
     * Create an aliased <code>ehr.party_identified</code> table reference
     */
    public PartyIdentified(Name alias) {
        this(alias, PARTY_IDENTIFIED);
    }

    /**
     * Create a <code>ehr.party_identified</code> table reference
     */
    public PartyIdentified() {
        this(DSL.name("party_identified"), null);
    }

    public <O extends Record> PartyIdentified(Table<O> child, ForeignKey<O, PartyIdentifiedRecord> key) {
        super(child, key, PARTY_IDENTIFIED);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : Ehr.EHR;
    }

    @Override
    public List<Index> getIndexes() {
        return Arrays.asList(Indexes.PARTY_IDENTIFIED_PARTY_REF_IDX, Indexes.PARTY_IDENTIFIED_PARTY_TYPE_IDX);
    }

    @Override
    public UniqueKey<PartyIdentifiedRecord> getPrimaryKey() {
        return Keys.PARTY_IDENTIFIED_PKEY;
    }

    @Override
    public PartyIdentified as(String alias) {
        return new PartyIdentified(DSL.name(alias), this);
    }

    @Override
    public PartyIdentified as(Name alias) {
        return new PartyIdentified(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public PartyIdentified rename(String name) {
        return new PartyIdentified(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public PartyIdentified rename(Name name) {
        return new PartyIdentified(name, null);
    }

    // -------------------------------------------------------------------------
    // Row9 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row9<UUID, String, String, String, String, String, PartyType, DvCodedTextRecord, PartyRefIdType>
            fieldsRow() {
        return (Row9) super.fieldsRow();
    }
}
