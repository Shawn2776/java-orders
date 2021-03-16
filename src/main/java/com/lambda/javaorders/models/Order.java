package com.lambda.javaorders.models;

import javax.persistence.*;

@Entity
@Table(name = "orders")
public class Order
{
    @Id
    @GeneratedValue
    private long ordnum;

    private double advanceamount;
    private double ordamount;
    private String orderdescription;

    public Order()
    {
        // default constructor
    }

    public Order(double advanceamount, double ordamount, String orderdescription) {
        this.advanceamount = advanceamount;
        this.ordamount = ordamount;
        this.orderdescription = orderdescription;
    }

    public long getOrdnum() {
        return ordnum;
    }

    public void setOrdnum(long ordnum) {
        this.ordnum = ordnum;
    }

    public double getAdvanceamount() {
        return advanceamount;
    }

    public void setAdvanceamount(double advanceamount) {
        this.advanceamount = advanceamount;
    }

    public double getOrdamount() {
        return ordamount;
    }

    public void setOrdamount(double ordamount) {
        this.ordamount = ordamount;
    }

    public String getOrderdescription() {
        return orderdescription;
    }

    public void setOrderdescription(String orderdescription) {
        this.orderdescription = orderdescription;
    }

    @Override
    public String toString() {
        return "Order{" +
                "ordnum=" + ordnum +
                ", advanceamount=" + advanceamount +
                ", ordamount=" + ordamount +
                ", orderdescription='" + orderdescription + '\'' +
                '}';
    }
}
