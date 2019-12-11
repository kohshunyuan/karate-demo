/*
 * This file is generated by jOOQ.
 */
package com.tvlk.karate.db.enums;


import com.tvlk.karate.db.Karate;

import org.jooq.Catalog;
import org.jooq.EnumType;
import org.jooq.Schema;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public enum ProductType implements EnumType {

    HOTEL("HOTEL"),

    FLIGHT("FLIGHT");

    private final String literal;

    private ProductType(String literal) {
        this.literal = literal;
    }

    @Override
    public Catalog getCatalog() {
        return getSchema() == null ? null : getSchema().getCatalog();
    }

    @Override
    public Schema getSchema() {
        return Karate.KARATE;
    }

    @Override
    public String getName() {
        return "product_type";
    }

    @Override
    public String getLiteral() {
        return literal;
    }
}
