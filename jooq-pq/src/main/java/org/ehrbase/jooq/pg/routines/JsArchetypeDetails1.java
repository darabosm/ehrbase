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
public class JsArchetypeDetails1 extends AbstractRoutine<JSONB> {

    private static final long serialVersionUID = 1329477247;

    /**
     * The parameter <code>ehr.js_archetype_details.RETURN_VALUE</code>.
     */
    public static final Parameter<JSONB> RETURN_VALUE = Internal.createParameter("RETURN_VALUE", org.jooq.impl.SQLDataType.JSONB, false, false);

    /**
     * The parameter <code>ehr.js_archetype_details.archetype_node_id</code>.
     */
    public static final Parameter<String> ARCHETYPE_NODE_ID = Internal.createParameter("archetype_node_id", org.jooq.impl.SQLDataType.CLOB, false, false);

    /**
     * The parameter <code>ehr.js_archetype_details.template_id</code>.
     */
    public static final Parameter<String> TEMPLATE_ID = Internal.createParameter("template_id", org.jooq.impl.SQLDataType.CLOB, false, false);

    /**
     * Create a new routine call instance
     */
    public JsArchetypeDetails1() {
        super("js_archetype_details", Ehr.EHR, org.jooq.impl.SQLDataType.JSONB);

        setReturnParameter(RETURN_VALUE);
        addInParameter(ARCHETYPE_NODE_ID);
        addInParameter(TEMPLATE_ID);
        setOverloaded(true);
    }

    /**
     * Set the <code>archetype_node_id</code> parameter IN value to the routine
     */
    public void setArchetypeNodeId(String value) {
        setValue(ARCHETYPE_NODE_ID, value);
    }

    /**
     * Set the <code>archetype_node_id</code> parameter to the function to be used with a {@link org.jooq.Select} statement
     */
    public void setArchetypeNodeId(Field<String> field) {
        setField(ARCHETYPE_NODE_ID, field);
    }

    /**
     * Set the <code>template_id</code> parameter IN value to the routine
     */
    public void setTemplateId(String value) {
        setValue(TEMPLATE_ID, value);
    }

    /**
     * Set the <code>template_id</code> parameter to the function to be used with a {@link org.jooq.Select} statement
     */
    public void setTemplateId(Field<String> field) {
        setField(TEMPLATE_ID, field);
    }
}
