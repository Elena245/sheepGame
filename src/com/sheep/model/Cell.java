package com.sheep.model;

/*
    cell class
    2 states: with a card - 1 / without a card - 0
 */
public class Cell {
    private  Integer state = 0;

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public Brand getBrand() {
        return brand;
    }

    public void setBrand(Brand brand) {
        this.brand = brand;
    }

    private Brand brand;
}
