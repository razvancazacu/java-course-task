package com.fmi.laborator6.models;

public interface Drawable {
    private void internalDraw(){

    }
    default void draw(){
        System.out.println();
        internalDraw();
    }
    void refresh();
}
