package com.fmi.store.model;

public abstract class Product implements Cloneable {
    private Category category;
    private Price price;
    private String name;
    private String smallDescription;

    public Product(Category category, Price price, String name, String smallDescription) {
        this.category = category;
        this.price = price;
        this.name = name;
        this.smallDescription = smallDescription;
    }

//    public void setPrice(Price price) {
//        this.price = price;
//    }

//    public void setName(String name) {
//        this.name = name;
//    }

//    public void setSmallDescription(String smallDescription) {
//        this.smallDescription = smallDescription;
//    }

    public Price getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }

    public String getSmallDescription() {
        return smallDescription;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public abstract void hiddenInformation();

    public abstract Integer computePrice();
}

