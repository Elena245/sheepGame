package com.sheep.model;

/*
    layer class
    2 dims table
 */
public class Layer {
    private  Integer rowNum;
    private  Integer colNum;

    private Integer capacity; // how many cells the current layer could accommodate
    private Integer size = 0; // how many cards the current layer has
                              // size will change when cards were added or removed

    private Cell[][] cells = null;

    public Layer(Integer rowNum, Integer colNum) {
        this.rowNum = rowNum;
        this.colNum = colNum;

        this.cells = new Cell[this.rowNum][this.colNum];
        this.capacity = this.colNum * this.rowNum;
        this.size = 0;
    }

    public Cell[][] getCells() {
        return cells;
    }

    public void setCells(Cell[][] cells) {
        this.cells = cells;
    }

    public Integer getRowNum() {
        return rowNum;
    }

    public void setRowNum(Integer rowNum) {
        this.rowNum = rowNum;
    }

    public Integer getColNum() {
        return colNum;
    }

    public void setColNum(Integer colNum) {
        this.colNum = colNum;
    }

    public Integer getCapacity() {
        return capacity;
    }

    public void setCapacity(Integer capacity) {
        this.capacity = capacity;
    }

    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }
}

