package com.fmi.store.model;

import java.util.Date;

public final class FoodProduct extends Product {
    private Date foodExpirationDate;

    public FoodProduct(Category category,Price price, String name,
                       String smallDescription,Date foodExpirationDate) {

        super(category,price,name,smallDescription);
        this.foodExpirationDate = foodExpirationDate;
    }

    @Override
    public String getName() {
        return "FoodProduct - name: " + super.getName();
    }

    public Date getFoodExpirationDate() {
        Date result = null;
        if(foodExpirationDate != null){
            result = (Date)foodExpirationDate.clone();
        }
        return result;
    }

    @Override
    public void hiddenInformation() {

    }

    @Override
    public Integer computePrice() {
        return null;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("FoodProduct{");
        sb.append('}');
        return sb.toString();
    }
}
