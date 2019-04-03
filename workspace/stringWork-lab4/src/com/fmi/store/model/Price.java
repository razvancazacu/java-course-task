package com.fmi.store.model;

import java.util.Date;

public class Price implements Cloneable{
    private Double price;
    private Date startFrom;
    private Date endForm;

    public Price(Double price, Date startFrom, Date endForm) {
        this.price = price;
        this.startFrom = startFrom;
        this.endForm = endForm;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public void setStartFrom(Date startFrom) {
        this.startFrom = startFrom;
    }

    public void setEndForm(Date endForm) {
        this.endForm = endForm;
    }

    public Double getPrice() {
        return price;
    }

    public Date getStartFrom() {
        return startFrom;
    }

    public Date getEndForm() {
        return endForm;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

}
