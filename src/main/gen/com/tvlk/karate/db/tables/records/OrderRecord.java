/*
 * This file is generated by jOOQ.
 */
package com.tvlk.karate.db.tables.records;


import com.tvlk.karate.db.enums.PaymentOption;
import com.tvlk.karate.db.enums.PaymentStatus;
import com.tvlk.karate.db.enums.ProductType;
import com.tvlk.karate.db.tables.Order;

import java.time.OffsetDateTime;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record8;
import org.jooq.Row8;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class OrderRecord extends UpdatableRecordImpl<OrderRecord> implements Record8<Integer, ProductType, String, String, PaymentStatus, PaymentOption, OffsetDateTime, OffsetDateTime> {

    private static final long serialVersionUID = 897730936;

    /**
     * Setter for <code>karate.order.id</code>.
     */
    public void setId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>karate.order.id</code>.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>karate.order.product_type</code>.
     */
    public void setProductType(ProductType value) {
        set(1, value);
    }

    /**
     * Getter for <code>karate.order.product_type</code>.
     */
    public ProductType getProductType() {
        return (ProductType) get(1);
    }

    /**
     * Setter for <code>karate.order.product_name</code>.
     */
    public void setProductName(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>karate.order.product_name</code>.
     */
    public String getProductName() {
        return (String) get(2);
    }

    /**
     * Setter for <code>karate.order.product_desc</code>.
     */
    public void setProductDesc(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>karate.order.product_desc</code>.
     */
    public String getProductDesc() {
        return (String) get(3);
    }

    /**
     * Setter for <code>karate.order.payment_status</code>.
     */
    public void setPaymentStatus(PaymentStatus value) {
        set(4, value);
    }

    /**
     * Getter for <code>karate.order.payment_status</code>.
     */
    public PaymentStatus getPaymentStatus() {
        return (PaymentStatus) get(4);
    }

    /**
     * Setter for <code>karate.order.payment_option</code>.
     */
    public void setPaymentOption(PaymentOption value) {
        set(5, value);
    }

    /**
     * Getter for <code>karate.order.payment_option</code>.
     */
    public PaymentOption getPaymentOption() {
        return (PaymentOption) get(5);
    }

    /**
     * Setter for <code>karate.order.created</code>.
     */
    public void setCreated(OffsetDateTime value) {
        set(6, value);
    }

    /**
     * Getter for <code>karate.order.created</code>.
     */
    public OffsetDateTime getCreated() {
        return (OffsetDateTime) get(6);
    }

    /**
     * Setter for <code>karate.order.updated</code>.
     */
    public void setUpdated(OffsetDateTime value) {
        set(7, value);
    }

    /**
     * Getter for <code>karate.order.updated</code>.
     */
    public OffsetDateTime getUpdated() {
        return (OffsetDateTime) get(7);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<Integer> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record8 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row8<Integer, ProductType, String, String, PaymentStatus, PaymentOption, OffsetDateTime, OffsetDateTime> fieldsRow() {
        return (Row8) super.fieldsRow();
    }

    @Override
    public Row8<Integer, ProductType, String, String, PaymentStatus, PaymentOption, OffsetDateTime, OffsetDateTime> valuesRow() {
        return (Row8) super.valuesRow();
    }

    @Override
    public Field<Integer> field1() {
        return Order.ORDER.ID;
    }

    @Override
    public Field<ProductType> field2() {
        return Order.ORDER.PRODUCT_TYPE;
    }

    @Override
    public Field<String> field3() {
        return Order.ORDER.PRODUCT_NAME;
    }

    @Override
    public Field<String> field4() {
        return Order.ORDER.PRODUCT_DESC;
    }

    @Override
    public Field<PaymentStatus> field5() {
        return Order.ORDER.PAYMENT_STATUS;
    }

    @Override
    public Field<PaymentOption> field6() {
        return Order.ORDER.PAYMENT_OPTION;
    }

    @Override
    public Field<OffsetDateTime> field7() {
        return Order.ORDER.CREATED;
    }

    @Override
    public Field<OffsetDateTime> field8() {
        return Order.ORDER.UPDATED;
    }

    @Override
    public Integer component1() {
        return getId();
    }

    @Override
    public ProductType component2() {
        return getProductType();
    }

    @Override
    public String component3() {
        return getProductName();
    }

    @Override
    public String component4() {
        return getProductDesc();
    }

    @Override
    public PaymentStatus component5() {
        return getPaymentStatus();
    }

    @Override
    public PaymentOption component6() {
        return getPaymentOption();
    }

    @Override
    public OffsetDateTime component7() {
        return getCreated();
    }

    @Override
    public OffsetDateTime component8() {
        return getUpdated();
    }

    @Override
    public Integer value1() {
        return getId();
    }

    @Override
    public ProductType value2() {
        return getProductType();
    }

    @Override
    public String value3() {
        return getProductName();
    }

    @Override
    public String value4() {
        return getProductDesc();
    }

    @Override
    public PaymentStatus value5() {
        return getPaymentStatus();
    }

    @Override
    public PaymentOption value6() {
        return getPaymentOption();
    }

    @Override
    public OffsetDateTime value7() {
        return getCreated();
    }

    @Override
    public OffsetDateTime value8() {
        return getUpdated();
    }

    @Override
    public OrderRecord value1(Integer value) {
        setId(value);
        return this;
    }

    @Override
    public OrderRecord value2(ProductType value) {
        setProductType(value);
        return this;
    }

    @Override
    public OrderRecord value3(String value) {
        setProductName(value);
        return this;
    }

    @Override
    public OrderRecord value4(String value) {
        setProductDesc(value);
        return this;
    }

    @Override
    public OrderRecord value5(PaymentStatus value) {
        setPaymentStatus(value);
        return this;
    }

    @Override
    public OrderRecord value6(PaymentOption value) {
        setPaymentOption(value);
        return this;
    }

    @Override
    public OrderRecord value7(OffsetDateTime value) {
        setCreated(value);
        return this;
    }

    @Override
    public OrderRecord value8(OffsetDateTime value) {
        setUpdated(value);
        return this;
    }

    @Override
    public OrderRecord values(Integer value1, ProductType value2, String value3, String value4, PaymentStatus value5, PaymentOption value6, OffsetDateTime value7, OffsetDateTime value8) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached OrderRecord
     */
    public OrderRecord() {
        super(Order.ORDER);
    }

    /**
     * Create a detached, initialised OrderRecord
     */
    public OrderRecord(Integer id, ProductType productType, String productName, String productDesc, PaymentStatus paymentStatus, PaymentOption paymentOption, OffsetDateTime created, OffsetDateTime updated) {
        super(Order.ORDER);

        set(0, id);
        set(1, productType);
        set(2, productName);
        set(3, productDesc);
        set(4, paymentStatus);
        set(5, paymentOption);
        set(6, created);
        set(7, updated);
    }
}
