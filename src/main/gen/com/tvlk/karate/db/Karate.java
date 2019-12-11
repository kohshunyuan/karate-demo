/*
 * This file is generated by jOOQ.
 */
package com.tvlk.karate.db;


import com.tvlk.karate.db.tables.AvailablePaymentOption;
import com.tvlk.karate.db.tables.Order;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.jooq.Catalog;
import org.jooq.Sequence;
import org.jooq.Table;
import org.jooq.impl.SchemaImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Karate extends SchemaImpl {

    private static final long serialVersionUID = 1655619480;

    /**
     * The reference instance of <code>karate</code>
     */
    public static final Karate KARATE = new Karate();

    /**
     * The table <code>karate.available_payment_option</code>.
     */
    public final AvailablePaymentOption AVAILABLE_PAYMENT_OPTION = com.tvlk.karate.db.tables.AvailablePaymentOption.AVAILABLE_PAYMENT_OPTION;

    /**
     * The table <code>karate.order</code>.
     */
    public final Order ORDER = com.tvlk.karate.db.tables.Order.ORDER;

    /**
     * No further instances allowed
     */
    private Karate() {
        super("karate", null);
    }


    @Override
    public Catalog getCatalog() {
        return DefaultCatalog.DEFAULT_CATALOG;
    }

    @Override
    public final List<Sequence<?>> getSequences() {
        List result = new ArrayList();
        result.addAll(getSequences0());
        return result;
    }

    private final List<Sequence<?>> getSequences0() {
        return Arrays.<Sequence<?>>asList(
            Sequences.AVAILABLE_PAYMENT_OPTION_ID_SEQ,
            Sequences.ORDER_ID_SEQ);
    }

    @Override
    public final List<Table<?>> getTables() {
        List result = new ArrayList();
        result.addAll(getTables0());
        return result;
    }

    private final List<Table<?>> getTables0() {
        return Arrays.<Table<?>>asList(
            AvailablePaymentOption.AVAILABLE_PAYMENT_OPTION,
            Order.ORDER);
    }
}
