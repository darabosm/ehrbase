/*
 * This file is generated by jOOQ.
 */
package org.ehrbase.jooq.pg.routines;


import javax.annotation.processing.Generated;

import org.ehrbase.jooq.pg.Ehr;
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
public class AdminDeleteAllTemplates extends AbstractRoutine<Integer> {

    private static final long serialVersionUID = 1895612722;

    /**
     * The parameter <code>ehr.admin_delete_all_templates.RETURN_VALUE</code>.
     */
    public static final Parameter<Integer> RETURN_VALUE = Internal.createParameter("RETURN_VALUE", org.jooq.impl.SQLDataType.INTEGER, false, false);

    /**
     * Create a new routine call instance
     */
    public AdminDeleteAllTemplates() {
        super("admin_delete_all_templates", Ehr.EHR, org.jooq.impl.SQLDataType.INTEGER);

        setReturnParameter(RETURN_VALUE);
    }
}