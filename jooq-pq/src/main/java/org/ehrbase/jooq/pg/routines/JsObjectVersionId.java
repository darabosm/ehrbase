/*
 * This file is generated by jOOQ.
 */
package org.ehrbase.jooq.pg.routines;


import javax.annotation.processing.Generated;

import org.ehrbase.jooq.pg.Ehr;
import org.jooq.Field;
import org.jooq.JSONB;
import org.jooq.Parameter;
import org.jooq.impl.AbstractRoutine;
import org.jooq.impl.Internal;


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
public class JsObjectVersionId extends AbstractRoutine<JSONB> {

    private static final long serialVersionUID = 538378073;

    /**
     * The parameter <code>ehr.js_object_version_id.RETURN_VALUE</code>.
     */
    public static final Parameter<JSONB> RETURN_VALUE = Internal.createParameter("RETURN_VALUE", org.jooq.impl.SQLDataType.JSONB, false, false);

    /**
     * The parameter <code>ehr.js_object_version_id.version_id</code>.
     */
    public static final Parameter<String> VERSION_ID = Internal.createParameter("version_id", org.jooq.impl.SQLDataType.CLOB, false, false);

    /**
     * Create a new routine call instance
     */
    public JsObjectVersionId() {
        super("js_object_version_id", Ehr.EHR, org.jooq.impl.SQLDataType.JSONB);

        setReturnParameter(RETURN_VALUE);
        addInParameter(VERSION_ID);
    }

    /**
     * Set the <code>version_id</code> parameter IN value to the routine
     */
    public void setVersionId(String value) {
        setValue(VERSION_ID, value);
    }

    /**
     * Set the <code>version_id</code> parameter to the function to be used with a {@link org.jooq.Select} statement
     */
    public void setVersionId(Field<String> field) {
        setField(VERSION_ID, field);
    }
}