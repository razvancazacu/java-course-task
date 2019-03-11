package com.fmi.store.model;

public class Category {
    private String name;
    private String description;
    private Category parent;

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setParent(Category parent) {
        this.parent = parent;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public Category getParent() {
        return parent;
    }
}
