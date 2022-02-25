/*
 * This file is generated by jOOQ.
 */
package org.ehrbase.jooq.pg.enums;


import javax.annotation.processing.Generated;

import org.ehrbase.jooq.pg.Ehr;
import org.jooq.Catalog;
import org.jooq.EnumType;
import org.jooq.Schema;


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
public enum PartyType implements EnumType {

    party_identified("party_identified"),

    party_self("party_self"),

    party_related("party_related");

    private final String literal;

    private PartyType(String literal) {
        this.literal = literal;
    }

    @Override
    public Catalog getCatalog() {
        return getSchema() == null ? null : getSchema().getCatalog();
    }

    @Override
    public Schema getSchema() {
        return Ehr.EHR;
    }

    @Override
    public String getName() {
        return "party_type";
    }

    @Override
    public String getLiteral() {
        return literal;
    }
}
