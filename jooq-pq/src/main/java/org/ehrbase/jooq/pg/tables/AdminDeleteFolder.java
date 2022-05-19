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

import java.util.UUID;
import org.ehrbase.jooq.pg.Ehr;
import org.ehrbase.jooq.pg.tables.records.AdminDeleteFolderRecord;
import org.jooq.Field;
import org.jooq.Name;
import org.jooq.Row3;
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
public class AdminDeleteFolder extends TableImpl<AdminDeleteFolderRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>ehr.admin_delete_folder</code>
     */
    public static final AdminDeleteFolder ADMIN_DELETE_FOLDER = new AdminDeleteFolder();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<AdminDeleteFolderRecord> getRecordType() {
        return AdminDeleteFolderRecord.class;
    }

    /**
     * The column <code>ehr.admin_delete_folder.contribution</code>.
     */
    public final TableField<AdminDeleteFolderRecord, UUID> CONTRIBUTION =
            createField(DSL.name("contribution"), SQLDataType.UUID, this, "");

    /**
     * The column <code>ehr.admin_delete_folder.child</code>.
     */
    public final TableField<AdminDeleteFolderRecord, UUID> CHILD =
            createField(DSL.name("child"), SQLDataType.UUID, this, "");

    /**
     * The column <code>ehr.admin_delete_folder.audit</code>.
     */
    public final TableField<AdminDeleteFolderRecord, UUID> AUDIT =
            createField(DSL.name("audit"), SQLDataType.UUID, this, "");

    private AdminDeleteFolder(Name alias, Table<AdminDeleteFolderRecord> aliased) {
        this(alias, aliased, new Field[] {DSL.val(null, SQLDataType.UUID)});
    }

    private AdminDeleteFolder(Name alias, Table<AdminDeleteFolderRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.function());
    }

    /**
     * Create an aliased <code>ehr.admin_delete_folder</code> table reference
     */
    public AdminDeleteFolder(String alias) {
        this(DSL.name(alias), ADMIN_DELETE_FOLDER);
    }

    /**
     * Create an aliased <code>ehr.admin_delete_folder</code> table reference
     */
    public AdminDeleteFolder(Name alias) {
        this(alias, ADMIN_DELETE_FOLDER);
    }

    /**
     * Create a <code>ehr.admin_delete_folder</code> table reference
     */
    public AdminDeleteFolder() {
        this(DSL.name("admin_delete_folder"), null);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : Ehr.EHR;
    }

    @Override
    public AdminDeleteFolder as(String alias) {
        return new AdminDeleteFolder(DSL.name(alias), this, parameters);
    }

    @Override
    public AdminDeleteFolder as(Name alias) {
        return new AdminDeleteFolder(alias, this, parameters);
    }

    /**
     * Rename this table
     */
    @Override
    public AdminDeleteFolder rename(String name) {
        return new AdminDeleteFolder(DSL.name(name), null, parameters);
    }

    /**
     * Rename this table
     */
    @Override
    public AdminDeleteFolder rename(Name name) {
        return new AdminDeleteFolder(name, null, parameters);
    }

    // -------------------------------------------------------------------------
    // Row3 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row3<UUID, UUID, UUID> fieldsRow() {
        return (Row3) super.fieldsRow();
    }

    /**
     * Call this table-valued function
     */
    public AdminDeleteFolder call(UUID folderIdInput) {
        AdminDeleteFolder result = new AdminDeleteFolder(
                DSL.name("admin_delete_folder"), null, new Field[] {DSL.val(folderIdInput, SQLDataType.UUID)});

        return aliased() ? result.as(getUnqualifiedName()) : result;
    }

    /**
     * Call this table-valued function
     */
    public AdminDeleteFolder call(Field<UUID> folderIdInput) {
        AdminDeleteFolder result =
                new AdminDeleteFolder(DSL.name("admin_delete_folder"), null, new Field[] {folderIdInput});

        return aliased() ? result.as(getUnqualifiedName()) : result;
    }
}
