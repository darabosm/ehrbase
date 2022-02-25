/*
 * This file is generated by jOOQ.
 */
package org.ehrbase.jooq.pg.routines;


import java.util.UUID;

import javax.annotation.processing.Generated;

import org.ehrbase.jooq.pg.Ehr;
import org.jooq.Field;
import org.jooq.JSON;
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
public class JsContextSetting extends AbstractRoutine<JSON> {

    private static final long serialVersionUID = -1698798164;

    /**
     * The parameter <code>ehr.js_context_setting.RETURN_VALUE</code>.
     */
    public static final Parameter<JSON> RETURN_VALUE = Internal.createParameter("RETURN_VALUE", org.jooq.impl.SQLDataType.JSON, false, false);

    /**
     * The parameter <code>ehr.js_context_setting._1</code>.
     */
    public static final Parameter<UUID> _1 = Internal.createParameter("_1", org.jooq.impl.SQLDataType.UUID, false, true);

    /**
     * Create a new routine call instance
     */
    public JsContextSetting() {
        super("js_context_setting", Ehr.EHR, org.jooq.impl.SQLDataType.JSON);

        setReturnParameter(RETURN_VALUE);
        addInParameter(_1);
    }

    /**
     * Set the <code>_1</code> parameter IN value to the routine
     */
    public void set__1(UUID value) {
        setValue(_1, value);
    }

    /**
     * Set the <code>_1</code> parameter to the function to be used with a {@link org.jooq.Select} statement
     */
    public void set__1(Field<UUID> field) {
        setField(_1, field);
    }
}
