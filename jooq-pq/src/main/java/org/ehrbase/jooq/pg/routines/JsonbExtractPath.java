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
public class JsonbExtractPath extends AbstractRoutine<JSONB> {

    private static final long serialVersionUID = -1838208769;

    /**
     * The parameter <code>ehr.jsonb_extract_path.RETURN_VALUE</code>.
     */
    public static final Parameter<JSONB> RETURN_VALUE = Internal.createParameter("RETURN_VALUE", org.jooq.impl.SQLDataType.JSONB, false, false);

    /**
     * The parameter <code>ehr.jsonb_extract_path.from_json</code>.
     */
    public static final Parameter<JSONB> FROM_JSON = Internal.createParameter("from_json", org.jooq.impl.SQLDataType.JSONB, false, false);

    /**
     * The parameter <code>ehr.jsonb_extract_path.path_elems</code>.
     */
    public static final Parameter<String[]> PATH_ELEMS = Internal.createParameter("path_elems", org.jooq.impl.SQLDataType.CLOB.getArrayDataType(), false, false);

    /**
     * Create a new routine call instance
     */
    public JsonbExtractPath() {
        super("jsonb_extract_path", Ehr.EHR, org.jooq.impl.SQLDataType.JSONB);

        setReturnParameter(RETURN_VALUE);
        addInParameter(FROM_JSON);
        addInParameter(PATH_ELEMS);
    }

    /**
     * Set the <code>from_json</code> parameter IN value to the routine
     */
    public void setFromJson(JSONB value) {
        setValue(FROM_JSON, value);
    }

    /**
     * Set the <code>from_json</code> parameter to the function to be used with a {@link org.jooq.Select} statement
     */
    public void setFromJson(Field<JSONB> field) {
        setField(FROM_JSON, field);
    }

    /**
     * Set the <code>path_elems</code> parameter IN value to the routine
     */
    public void setPathElems(String... value) {
        setValue(PATH_ELEMS, value);
    }

    /**
     * Set the <code>path_elems</code> parameter to the function to be used with a {@link org.jooq.Select} statement
     */
    public void setPathElems(Field<String[]> field) {
        setField(PATH_ELEMS, field);
    }
}
