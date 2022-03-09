/*
 * This file is generated by jOOQ.
 */
package org.ehrbase.jooq.pg.routines;


import javax.annotation.processing.Generated;

import org.ehrbase.jooq.pg.Ehr;
import org.jooq.Field;
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
public class CamelToSnake extends AbstractRoutine<String> {

    private static final long serialVersionUID = -506862757;

    /**
     * The parameter <code>ehr.camel_to_snake.RETURN_VALUE</code>.
     */
    public static final Parameter<String> RETURN_VALUE = Internal.createParameter("RETURN_VALUE", org.jooq.impl.SQLDataType.CLOB, false, false);

    /**
     * The parameter <code>ehr.camel_to_snake.literal</code>.
     */
    public static final Parameter<String> LITERAL = Internal.createParameter("literal", org.jooq.impl.SQLDataType.CLOB, false, false);

    /**
     * Create a new routine call instance
     */
    public CamelToSnake() {
        super("camel_to_snake", Ehr.EHR, org.jooq.impl.SQLDataType.CLOB);

        setReturnParameter(RETURN_VALUE);
        addInParameter(LITERAL);
    }

    /**
     * Set the <code>literal</code> parameter IN value to the routine
     */
    public void setLiteral(String value) {
        setValue(LITERAL, value);
    }

    /**
     * Set the <code>literal</code> parameter to the function to be used with a {@link org.jooq.Select} statement
     */
    public void setLiteral(Field<String> field) {
        setField(LITERAL, field);
    }
}