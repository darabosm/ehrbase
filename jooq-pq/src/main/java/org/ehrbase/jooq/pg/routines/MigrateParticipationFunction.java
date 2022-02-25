/*
 * This file is generated by jOOQ.
 */
package org.ehrbase.jooq.pg.routines;


import javax.annotation.processing.Generated;

import org.ehrbase.jooq.pg.Ehr;
import org.ehrbase.jooq.pg.udt.DvCodedText;
import org.ehrbase.jooq.pg.udt.records.DvCodedTextRecord;
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
public class MigrateParticipationFunction extends AbstractRoutine<DvCodedTextRecord> {

    private static final long serialVersionUID = -317789528;

    /**
     * The parameter <code>ehr.migrate_participation_function.RETURN_VALUE</code>.
     */
    public static final Parameter<DvCodedTextRecord> RETURN_VALUE = Internal.createParameter("RETURN_VALUE", DvCodedText.DV_CODED_TEXT.getDataType(), false, false);

    /**
     * The parameter <code>ehr.migrate_participation_function.mode</code>.
     */
    public static final Parameter<String> MODE = Internal.createParameter("mode", org.jooq.impl.SQLDataType.CLOB, false, false);

    /**
     * Create a new routine call instance
     */
    public MigrateParticipationFunction() {
        super("migrate_participation_function", Ehr.EHR, DvCodedText.DV_CODED_TEXT.getDataType());

        setReturnParameter(RETURN_VALUE);
        addInParameter(MODE);
    }

    /**
     * Set the <code>mode</code> parameter IN value to the routine
     */
    public void setMode(String value) {
        setValue(MODE, value);
    }

    /**
     * Set the <code>mode</code> parameter to the function to be used with a {@link org.jooq.Select} statement
     */
    public void setMode(Field<String> field) {
        setField(MODE, field);
    }
}
