package com.fmi.store.model;

public class FoodProduct extends Product  {
    @Override
    public String getName() {
        return "FoodProduct - name: " + super.getName();
    }
}
