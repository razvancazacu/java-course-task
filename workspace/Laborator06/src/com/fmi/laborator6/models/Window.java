package com.fmi.laborator6.models;

public class Window implements Drawable {
    @Override
    public void draw() {
        System.out.println();
    }
    enum Event {
        EV1, EV2, EV3;

    }
    static class EventListener {
        abstract void onEvent(Event event){

        }
    }
}
