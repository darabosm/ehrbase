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
import org.ehrbase.jooq.pg.udt.records.DvCodedTextRecord;
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
public class JsDvCodedTextInner1 extends AbstractRoutine<JSON> {

    private static final long serialVersionUID = 1L;

    /**
     * The parameter <code>ehr.js_dv_coded_text_inner.RETURN_VALUE</code>.
     */
    public static final Parameter<JSON> RETURN_VALUE =
            Internal.createParameter("RETURN_VALUE", SQLDataType.JSON, false, false);

    /**
     * The parameter <code>ehr.js_dv_coded_text_inner.dvcodedtext</code>.
     */
    public static final Parameter<DvCodedTextRecord> DVCODEDTEXT = Internal.createParameter(
            "dvcodedtext", org.ehrbase.jooq.pg.udt.DvCodedText.DV_CODED_TEXT.getDataType(), false, false);

    /**
     * Create a new routine call instance
     */
    public JsDvCodedTextInner1() {
        super("js_dv_coded_text_inner", Ehr.EHR, SQLDataType.JSON);

        setReturnParameter(RETURN_VALUE);
        addInParameter(DVCODEDTEXT);
        setOverloaded(true);
    }

    /**
     * Set the <code>dvcodedtext</code> parameter IN value to the routine
     */
    public void setDvcodedtext(DvCodedTextRecord value) {
        setValue(DVCODEDTEXT, value);
    }

    /**
     * Set the <code>dvcodedtext</code> parameter to the function to be used
     * with a {@link org.jooq.Select} statement
     */
    public void setDvcodedtext(Field<DvCodedTextRecord> field) {
        setField(DVCODEDTEXT, field);
    }
}
