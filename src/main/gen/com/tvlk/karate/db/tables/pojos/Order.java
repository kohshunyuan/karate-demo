/*
 * This file is generated by jOOQ.
 */
package com.tvlk.karate.db.tables.pojos;


import com.tvlk.karate.db.enums.PaymentOption;
import com.tvlk.karate.db.enums.PaymentStatus;
import com.tvlk.karate.db.enums.ProductType;

import java.io.Serializable;
import java.time.OffsetDateTime;

import javax.annotation.processing.Generated;


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
public class Order implements Serializable {

    private static final long serialVersionUID = 746509700;

    private Integer        id;
    private ProductType    productType;
    private String         productName;
    private String         productDesc;
    private PaymentStatus  paymentStatus;
    private PaymentOption  paymentOption;
    private OffsetDateTime created;
    private OffsetDateTime updated;

    public Order() {}

    public Order(Order value) {
        this.id = value.id;
        this.productType = value.productType;
        this.productName = value.productName;
        this.productDesc = value.productDesc;
        this.paymentStatus = value.paymentStatus;
        this.paymentOption = value.paymentOption;
        this.created = value.created;
        this.updated = value.updated;
    }

    public Order(
        Integer        id,
        ProductType    productType,
        String         productName,
        String         productDesc,
        PaymentStatus  paymentStatus,
        PaymentOption  paymentOption,
        OffsetDateTime created,
        OffsetDateTime updated
    ) {
        this.id = id;
        this.productType = productType;
        this.productName = productName;
        this.productDesc = productDesc;
        this.paymentStatus = paymentStatus;
        this.paymentOption = paymentOption;
        this.created = created;
        this.updated = updated;
    }

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public ProductType getProductType() {
        return this.productType;
    }

    public void setProductType(ProductType productType) {
        this.productType = productType;
    }

    public String getProductName() {
        return this.productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductDesc() {
        return this.productDesc;
    }

    public void setProductDesc(String productDesc) {
        this.productDesc = productDesc;
    }

    public PaymentStatus getPaymentStatus() {
        return this.paymentStatus;
    }

    public void setPaymentStatus(PaymentStatus paymentStatus) {
        this.paymentStatus = paymentStatus;
    }

    public PaymentOption getPaymentOption() {
        return this.paymentOption;
    }

    public void setPaymentOption(PaymentOption paymentOption) {
        this.paymentOption = paymentOption;
    }

    public OffsetDateTime getCreated() {
        return this.created;
    }

    public void setCreated(OffsetDateTime created) {
        this.created = created;
    }

    public OffsetDateTime getUpdated() {
        return this.updated;
    }

    public void setUpdated(OffsetDateTime updated) {
        this.updated = updated;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Order (");

        sb.append(id);
        sb.append(", ").append(productType);
        sb.append(", ").append(productName);
        sb.append(", ").append(productDesc);
        sb.append(", ").append(paymentStatus);
        sb.append(", ").append(paymentOption);
        sb.append(", ").append(created);
        sb.append(", ").append(updated);

        sb.append(")");
        return sb.toString();
    }
}
