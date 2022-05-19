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
package org.ehrbase.jooq.pg.routines;

import org.ehrbase.jooq.pg.Ehr;
import org.ehrbase.jooq.pg.enums.PartyRefIdType;
import org.jooq.Field;
import org.jooq.JSON;
import org.jooq.Parameter;
import org.jooq.impl.AbstractRoutine;
import org.jooq.impl.Internal;
import org.jooq.impl.SQLDataType;

/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({"all", "unchecked", "rawtypes"})
public class JsCanonicalObjectId extends AbstractRoutine<JSON> {

    private static final long serialVersionUID = 1L;

    /**
     * The parameter <code>ehr.js_canonical_object_id.RETURN_VALUE</code>.
     */
    public static final Parameter<JSON> RETURN_VALUE =
            Internal.createParameter("RETURN_VALUE", SQLDataType.JSON, false, false);

    /**
     * The parameter <code>ehr.js_canonical_object_id.objectid_type</code>.
     */
    public static final Parameter<PartyRefIdType> OBJECTID_TYPE = Internal.createParameter(
            "objectid_type",
            SQLDataType.VARCHAR.asEnumDataType(org.ehrbase.jooq.pg.enums.PartyRefIdType.class),
            false,
            false);

    /**
     * The parameter <code>ehr.js_canonical_object_id.scheme</code>.
     */
    public static final Parameter<String> SCHEME = Internal.createParameter("scheme", SQLDataType.CLOB, false, false);

    /**
     * The parameter <code>ehr.js_canonical_object_id.id_value</code>.
     */
    public static final Parameter<String> ID_VALUE =
            Internal.createParameter("id_value", SQLDataType.CLOB, false, false);

    /**
     * Create a new routine call instance
     */
    public JsCanonicalObjectId() {
        super("js_canonical_object_id", Ehr.EHR, SQLDataType.JSON);

        setReturnParameter(RETURN_VALUE);
        addInParameter(OBJECTID_TYPE);
        addInParameter(SCHEME);
        addInParameter(ID_VALUE);
    }

    /**
     * Set the <code>objectid_type</code> parameter IN value to the routine
     */
    public void setObjectidType(PartyRefIdType value) {
        setValue(OBJECTID_TYPE, value);
    }

    /**
     * Set the <code>objectid_type</code> parameter to the function to be used
     * with a {@link org.jooq.Select} statement
     */
    public void setObjectidType(Field<PartyRefIdType> field) {
        setField(OBJECTID_TYPE, field);
    }

    /**
     * Set the <code>scheme</code> parameter IN value to the routine
     */
    public void setScheme(String value) {
        setValue(SCHEME, value);
    }

    /**
     * Set the <code>scheme</code> parameter to the function to be used with a
     * {@link org.jooq.Select} statement
     */
    public void setScheme(Field<String> field) {
        setField(SCHEME, field);
    }

    /**
     * Set the <code>id_value</code> parameter IN value to the routine
     */
    public void setIdValue(String value) {
        setValue(ID_VALUE, value);
    }

    /**
     * Set the <code>id_value</code> parameter to the function to be used with a
     * {@link org.jooq.Select} statement
     */
    public void setIdValue(Field<String> field) {
        setField(ID_VALUE, field);
    }
}
