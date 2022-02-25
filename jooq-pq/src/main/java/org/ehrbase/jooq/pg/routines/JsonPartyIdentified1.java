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
public class JsonPartyIdentified1 extends AbstractRoutine<JSON> {

    private static final long serialVersionUID = 1517492813;

    /**
     * The parameter <code>ehr.json_party_identified.RETURN_VALUE</code>.
     */
    public static final Parameter<JSON> RETURN_VALUE = Internal.createParameter("RETURN_VALUE", org.jooq.impl.SQLDataType.JSON, false, false);

    /**
     * The parameter <code>ehr.json_party_identified.name</code>.
     */
    public static final Parameter<String> NAME = Internal.createParameter("name", org.jooq.impl.SQLDataType.CLOB, false, false);

    /**
     * The parameter <code>ehr.json_party_identified.refid</code>.
     */
    public static final Parameter<UUID> REFID = Internal.createParameter("refid", org.jooq.impl.SQLDataType.UUID, false, false);

    /**
     * The parameter <code>ehr.json_party_identified.namespace</code>.
     */
    public static final Parameter<String> NAMESPACE = Internal.createParameter("namespace", org.jooq.impl.SQLDataType.CLOB, false, false);

    /**
     * The parameter <code>ehr.json_party_identified.ref_type</code>.
     */
    public static final Parameter<String> REF_TYPE = Internal.createParameter("ref_type", org.jooq.impl.SQLDataType.CLOB, false, false);

    /**
     * The parameter <code>ehr.json_party_identified.scheme</code>.
     */
    public static final Parameter<String> SCHEME = Internal.createParameter("scheme", org.jooq.impl.SQLDataType.CLOB, false, false);

    /**
     * The parameter <code>ehr.json_party_identified.id_value</code>.
     */
    public static final Parameter<String> ID_VALUE = Internal.createParameter("id_value", org.jooq.impl.SQLDataType.CLOB, false, false);

    /**
     * Create a new routine call instance
     */
    public JsonPartyIdentified1() {
        super("json_party_identified", Ehr.EHR, org.jooq.impl.SQLDataType.JSON);

        setReturnParameter(RETURN_VALUE);
        addInParameter(NAME);
        addInParameter(REFID);
        addInParameter(NAMESPACE);
        addInParameter(REF_TYPE);
        addInParameter(SCHEME);
        addInParameter(ID_VALUE);
        setOverloaded(true);
    }

    /**
     * Set the <code>name</code> parameter IN value to the routine
     */
    public void setName_(String value) {
        setValue(NAME, value);
    }

    /**
     * Set the <code>name</code> parameter to the function to be used with a {@link org.jooq.Select} statement
     */
    public void setName_(Field<String> field) {
        setField(NAME, field);
    }

    /**
     * Set the <code>refid</code> parameter IN value to the routine
     */
    public void setRefid(UUID value) {
        setValue(REFID, value);
    }

    /**
     * Set the <code>refid</code> parameter to the function to be used with a {@link org.jooq.Select} statement
     */
    public void setRefid(Field<UUID> field) {
        setField(REFID, field);
    }

    /**
     * Set the <code>namespace</code> parameter IN value to the routine
     */
    public void setNamespace(String value) {
        setValue(NAMESPACE, value);
    }

    /**
     * Set the <code>namespace</code> parameter to the function to be used with a {@link org.jooq.Select} statement
     */
    public void setNamespace(Field<String> field) {
        setField(NAMESPACE, field);
    }

    /**
     * Set the <code>ref_type</code> parameter IN value to the routine
     */
    public void setRefType(String value) {
        setValue(REF_TYPE, value);
    }

    /**
     * Set the <code>ref_type</code> parameter to the function to be used with a {@link org.jooq.Select} statement
     */
    public void setRefType(Field<String> field) {
        setField(REF_TYPE, field);
    }

    /**
     * Set the <code>scheme</code> parameter IN value to the routine
     */
    public void setScheme(String value) {
        setValue(SCHEME, value);
    }

    /**
     * Set the <code>scheme</code> parameter to the function to be used with a {@link org.jooq.Select} statement
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
     * Set the <code>id_value</code> parameter to the function to be used with a {@link org.jooq.Select} statement
     */
    public void setIdValue(Field<String> field) {
        setField(ID_VALUE, field);
    }
}
