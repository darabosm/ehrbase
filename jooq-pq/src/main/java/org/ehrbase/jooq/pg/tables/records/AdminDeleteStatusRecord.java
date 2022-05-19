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
import org.ehrbase.jooq.pg.tables.AdminDeleteStatus;
import org.jooq.Field;
import org.jooq.Record3;
import org.jooq.Row3;
import org.jooq.impl.TableRecordImpl;

/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({"all", "unchecked", "rawtypes"})
public class AdminDeleteStatusRecord extends TableRecordImpl<AdminDeleteStatusRecord>
        implements Record3<Integer, UUID, UUID> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>ehr.admin_delete_status.num</code>.
     */
    public void setNum(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>ehr.admin_delete_status.num</code>.
     */
    public Integer getNum() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>ehr.admin_delete_status.status_audit</code>.
     */
    public void setStatusAudit(UUID value) {
        set(1, value);
    }

    /**
     * Getter for <code>ehr.admin_delete_status.status_audit</code>.
     */
    public UUID getStatusAudit() {
        return (UUID) get(1);
    }

    /**
     * Setter for <code>ehr.admin_delete_status.status_party</code>.
     */
    public void setStatusParty(UUID value) {
        set(2, value);
    }

    /**
     * Getter for <code>ehr.admin_delete_status.status_party</code>.
     */
    public UUID getStatusParty() {
        return (UUID) get(2);
    }

    // -------------------------------------------------------------------------
    // Record3 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row3<Integer, UUID, UUID> fieldsRow() {
        return (Row3) super.fieldsRow();
    }

    @Override
    public Row3<Integer, UUID, UUID> valuesRow() {
        return (Row3) super.valuesRow();
    }

    @Override
    public Field<Integer> field1() {
        return AdminDeleteStatus.ADMIN_DELETE_STATUS.NUM;
    }

    @Override
    public Field<UUID> field2() {
        return AdminDeleteStatus.ADMIN_DELETE_STATUS.STATUS_AUDIT;
    }

    @Override
    public Field<UUID> field3() {
        return AdminDeleteStatus.ADMIN_DELETE_STATUS.STATUS_PARTY;
    }

    @Override
    public Integer component1() {
        return getNum();
    }

    @Override
    public UUID component2() {
        return getStatusAudit();
    }

    @Override
    public UUID component3() {
        return getStatusParty();
    }

    @Override
    public Integer value1() {
        return getNum();
    }

    @Override
    public UUID value2() {
        return getStatusAudit();
    }

    @Override
    public UUID value3() {
        return getStatusParty();
    }

    @Override
    public AdminDeleteStatusRecord value1(Integer value) {
        setNum(value);
        return this;
    }

    @Override
    public AdminDeleteStatusRecord value2(UUID value) {
        setStatusAudit(value);
        return this;
    }

    @Override
    public AdminDeleteStatusRecord value3(UUID value) {
        setStatusParty(value);
        return this;
    }

    @Override
    public AdminDeleteStatusRecord values(Integer value1, UUID value2, UUID value3) {
        value1(value1);
        value2(value2);
        value3(value3);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached AdminDeleteStatusRecord
     */
    public AdminDeleteStatusRecord() {
        super(AdminDeleteStatus.ADMIN_DELETE_STATUS);
    }

    /**
     * Create a detached, initialised AdminDeleteStatusRecord
     */
    public AdminDeleteStatusRecord(Integer num, UUID statusAudit, UUID statusParty) {
        super(AdminDeleteStatus.ADMIN_DELETE_STATUS);

        setNum(num);
        setStatusAudit(statusAudit);
        setStatusParty(statusParty);
    }
}
