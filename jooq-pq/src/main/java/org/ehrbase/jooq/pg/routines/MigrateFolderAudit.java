/*
 * This file is generated by jOOQ.
 */
package org.ehrbase.jooq.pg.routines;


import java.util.UUID;

import org.ehrbase.jooq.pg.Ehr;
import org.jooq.Parameter;
import org.jooq.impl.AbstractRoutine;
import org.jooq.impl.Internal;
import org.jooq.impl.SQLDataType;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class MigrateFolderAudit extends AbstractRoutine<java.lang.Void> {

    private static final long serialVersionUID = 1L;

    /**
     * The parameter <code>ehr.migrate_folder_audit.ret_id</code>.
     */
    public static final Parameter<UUID> RET_ID = Internal.createParameter("ret_id", SQLDataType.UUID, false, false);

    /**
     * Create a new routine call instance
     */
    public MigrateFolderAudit() {
        super("migrate_folder_audit", Ehr.EHR);

        addOutParameter(RET_ID);
    }

    /**
     * Get the <code>ret_id</code> parameter OUT value from the routine
     */
    public UUID getRetId() {
        return get(RET_ID);
    }
}