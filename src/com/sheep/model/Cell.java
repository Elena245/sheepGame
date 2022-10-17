package com.sheep.model;

/*
    cell class
    2 states: with a card - 1 / without a card - 0
 */
public class Cell {
    private  Integer state = 0;
    private Card card;

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public Card getCard() {
        return card;
    }

    public void setCard(Card card) {
        this.card = card;
    }

}
