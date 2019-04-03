package com.fmi.store.model;

public final class CleaningProduct extends Product {
    @Override
    public void hiddenInformation() {

    }

    @Override
    public Integer computePrice() {
        return null;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("CleaningProduct{");
        sb.append('}');
        return sb.toString();
    }
}
