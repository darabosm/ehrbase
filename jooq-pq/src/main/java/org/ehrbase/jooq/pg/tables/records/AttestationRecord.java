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
package org.ehrbase.jooq.pg.tables.records;

import java.util.UUID;
import org.ehrbase.jooq.pg.tables.Attestation;
import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record6;
import org.jooq.Row6;
import org.jooq.impl.UpdatableRecordImpl;

/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({"all", "unchecked", "rawtypes"})
public class AttestationRecord extends UpdatableRecordImpl<AttestationRecord>
        implements Record6<UUID, String, String, Boolean, UUID, UUID> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>ehr.attestation.id</code>.
     */
    public void setId(UUID value) {
        set(0, value);
    }

    /**
     * Getter for <code>ehr.attestation.id</code>.
     */
    public UUID getId() {
        return (UUID) get(0);
    }

    /**
     * Setter for <code>ehr.attestation.proof</code>.
     */
    public void setProof(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>ehr.attestation.proof</code>.
     */
    public String getProof() {
        return (String) get(1);
    }

    /**
     * Setter for <code>ehr.attestation.reason</code>.
     */
    public void setReason(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>ehr.attestation.reason</code>.
     */
    public String getReason() {
        return (String) get(2);
    }

    /**
     * Setter for <code>ehr.attestation.is_pending</code>.
     */
    public void setIsPending(Boolean value) {
        set(3, value);
    }

    /**
     * Getter for <code>ehr.attestation.is_pending</code>.
     */
    public Boolean getIsPending() {
        return (Boolean) get(3);
    }

    /**
     * Setter for <code>ehr.attestation.has_audit</code>.
     */
    public void setHasAudit(UUID value) {
        set(4, value);
    }

    /**
     * Getter for <code>ehr.attestation.has_audit</code>.
     */
    public UUID getHasAudit() {
        return (UUID) get(4);
    }

    /**
     * Setter for <code>ehr.attestation.reference</code>.
     */
    public void setReference(UUID value) {
        set(5, value);
    }

    /**
     * Getter for <code>ehr.attestation.reference</code>.
     */
    public UUID getReference() {
        return (UUID) get(5);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<UUID> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record6 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row6<UUID, String, String, Boolean, UUID, UUID> fieldsRow() {
        return (Row6) super.fieldsRow();
    }

    @Override
    public Row6<UUID, String, String, Boolean, UUID, UUID> valuesRow() {
        return (Row6) super.valuesRow();
    }

    @Override
    public Field<UUID> field1() {
        return Attestation.ATTESTATION.ID;
    }

    @Override
    public Field<String> field2() {
        return Attestation.ATTESTATION.PROOF;
    }

    @Override
    public Field<String> field3() {
        return Attestation.ATTESTATION.REASON;
    }

    @Override
    public Field<Boolean> field4() {
        return Attestation.ATTESTATION.IS_PENDING;
    }

    @Override
    public Field<UUID> field5() {
        return Attestation.ATTESTATION.HAS_AUDIT;
    }

    @Override
    public Field<UUID> field6() {
        return Attestation.ATTESTATION.REFERENCE;
    }

    @Override
    public UUID component1() {
        return getId();
    }

    @Override
    public String component2() {
        return getProof();
    }

    @Override
    public String component3() {
        return getReason();
    }

    @Override
    public Boolean component4() {
        return getIsPending();
    }

    @Override
    public UUID component5() {
        return getHasAudit();
    }

    @Override
    public UUID component6() {
        return getReference();
    }

    @Override
    public UUID value1() {
        return getId();
    }

    @Override
    public String value2() {
        return getProof();
    }

    @Override
    public String value3() {
        return getReason();
    }

    @Override
    public Boolean value4() {
        return getIsPending();
    }

    @Override
    public UUID value5() {
        return getHasAudit();
    }

    @Override
    public UUID value6() {
        return getReference();
    }

    @Override
    public AttestationRecord value1(UUID value) {
        setId(value);
        return this;
    }

    @Override
    public AttestationRecord value2(String value) {
        setProof(value);
        return this;
    }

    @Override
    public AttestationRecord value3(String value) {
        setReason(value);
        return this;
    }

    @Override
    public AttestationRecord value4(Boolean value) {
        setIsPending(value);
        return this;
    }

    @Override
    public AttestationRecord value5(UUID value) {
        setHasAudit(value);
        return this;
    }

    @Override
    public AttestationRecord value6(UUID value) {
        setReference(value);
        return this;
    }

    @Override
    public AttestationRecord values(
            UUID value1, String value2, String value3, Boolean value4, UUID value5, UUID value6) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached AttestationRecord
     */
    public AttestationRecord() {
        super(Attestation.ATTESTATION);
    }

    /**
     * Create a detached, initialised AttestationRecord
     */
    public AttestationRecord(UUID id, String proof, String reason, Boolean isPending, UUID hasAudit, UUID reference) {
        super(Attestation.ATTESTATION);

        setId(id);
        setProof(proof);
        setReason(reason);
        setIsPending(isPending);
        setHasAudit(hasAudit);
        setReference(reference);
    }
}
