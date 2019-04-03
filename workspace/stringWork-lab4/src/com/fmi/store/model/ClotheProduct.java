package com.fmi.store.model;

public final class ClotheProduct extends Product {
    @Override
    public void hiddenInformation() {

    }

    @Override
    public Integer computePrice() {
        return null;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("ClotheProduct{");
        sb.append('}');
        return sb.toString();
    }
}
