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
public class AqlNodeNamePredicate extends AbstractRoutine<JSONB> {

    private static final long serialVersionUID = 2056115589;

    /**
     * The parameter <code>ehr.aql_node_name_predicate.RETURN_VALUE</code>.
     */
    public static final Parameter<JSONB> RETURN_VALUE = Internal.createParameter("RETURN_VALUE", org.jooq.impl.SQLDataType.JSONB, false, false);

    /**
     * The parameter <code>ehr.aql_node_name_predicate.entry</code>.
     */
    public static final Parameter<JSONB> ENTRY = Internal.createParameter("entry", org.jooq.impl.SQLDataType.JSONB, false, false);

    /**
     * The parameter <code>ehr.aql_node_name_predicate.name_value_predicate</code>.
     */
    public static final Parameter<String> NAME_VALUE_PREDICATE = Internal.createParameter("name_value_predicate", org.jooq.impl.SQLDataType.CLOB, false, false);

    /**
     * The parameter <code>ehr.aql_node_name_predicate.jsonb_path</code>.
     */
    public static final Parameter<String> JSONB_PATH = Internal.createParameter("jsonb_path", org.jooq.impl.SQLDataType.CLOB, false, false);

    /**
     * Create a new routine call instance
     */
    public AqlNodeNamePredicate() {
        super("aql_node_name_predicate", Ehr.EHR, org.jooq.impl.SQLDataType.JSONB);

        setReturnParameter(RETURN_VALUE);
        addInParameter(ENTRY);
        addInParameter(NAME_VALUE_PREDICATE);
        addInParameter(JSONB_PATH);
    }

    /**
     * Set the <code>entry</code> parameter IN value to the routine
     */
    public void setEntry(JSONB value) {
        setValue(ENTRY, value);
    }

    /**
     * Set the <code>entry</code> parameter to the function to be used with a {@link org.jooq.Select} statement
     */
    public void setEntry(Field<JSONB> field) {
        setField(ENTRY, field);
    }

    /**
     * Set the <code>name_value_predicate</code> parameter IN value to the routine
     */
    public void setNameValuePredicate(String value) {
        setValue(NAME_VALUE_PREDICATE, value);
    }

    /**
     * Set the <code>name_value_predicate</code> parameter to the function to be used with a {@link org.jooq.Select} statement
     */
    public void setNameValuePredicate(Field<String> field) {
        setField(NAME_VALUE_PREDICATE, field);
    }

    /**
     * Set the <code>jsonb_path</code> parameter IN value to the routine
     */
    public void setJsonbPath(String value) {
        setValue(JSONB_PATH, value);
    }

    /**
     * Set the <code>jsonb_path</code> parameter to the function to be used with a {@link org.jooq.Select} statement
     */
    public void setJsonbPath(Field<String> field) {
        setField(JSONB_PATH, field);
    }
}
