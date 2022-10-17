package com.sheep.model;

/*
    layer class
    2 dims table
 */
public class Layer {
    private Integer rowNum;
    private Integer colNum;

    private Integer capacity; // how many cells the current layer could accommodate
    private Integer size = 0; // how many cards the current layer has
    // size will change when cards were added or removed

    private Cell[][] cells = null;

    // tag the method with an "exception" to remind user of the method catching the exception
    public Layer(Integer rowNum, Integer colNum) throws Exception {
        this.rowNum = rowNum;
        this.colNum = colNum;

        this.cells = new Cell[this.rowNum][this.colNum];
        this.capacity = this.colNum * this.rowNum;
        if (this.capacity % 3 != 0) {
            throw new Exception("The capacity is not a multiple of 3");
        }
        this.size = 0;
    }

    public void showCells(){
        // print out all cells' value
        for (int row = 0; row < cells.length; row++) {
            for (int col = 0; col < cells[row].length; col++) {
                System.out.print(cells[row][col].getCard().getName()+"-");
            }
        }
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

