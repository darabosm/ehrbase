/*
 * This file is generated by jOOQ.
 */
package org.ehrbase.jooq.pg.routines;


import javax.annotation.processing.Generated;

import org.ehrbase.jooq.pg.Ehr;
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
public class JsonEntryMigrate extends AbstractRoutine<java.lang.Void> {

    private static final long serialVersionUID = 1405299977;

    /**
     * The parameter <code>ehr.json_entry_migrate.jsonb_entry</code>.
     */
    public static final Parameter<JSONB> JSONB_ENTRY = Internal.createParameter("jsonb_entry", org.jooq.impl.SQLDataType.JSONB, false, false);

    /**
     * The parameter <code>ehr.json_entry_migrate.out_composition_name</code>.
     */
    public static final Parameter<String> OUT_COMPOSITION_NAME = Internal.createParameter("out_composition_name", org.jooq.impl.SQLDataType.CLOB, false, false);

    /**
     * The parameter <code>ehr.json_entry_migrate.out_new_entry</code>.
     */
    public static final Parameter<JSONB> OUT_NEW_ENTRY = Internal.createParameter("out_new_entry", org.jooq.impl.SQLDataType.JSONB, false, false);

    /**
     * Create a new routine call instance
     */
    public JsonEntryMigrate() {
        super("json_entry_migrate", Ehr.EHR);

        addInParameter(JSONB_ENTRY);
        addOutParameter(OUT_COMPOSITION_NAME);
        addOutParameter(OUT_NEW_ENTRY);
    }

    /**
     * Set the <code>jsonb_entry</code> parameter IN value to the routine
     */
    public void setJsonbEntry(JSONB value) {
        setValue(JSONB_ENTRY, value);
    }

    /**
     * Get the <code>out_composition_name</code> parameter OUT value from the routine
     */
    public String getOutCompositionName() {
        return get(OUT_COMPOSITION_NAME);
    }

    /**
     * Get the <code>out_new_entry</code> parameter OUT value from the routine
     */
    public JSONB getOutNewEntry() {
        return get(OUT_NEW_ENTRY);
    }
}