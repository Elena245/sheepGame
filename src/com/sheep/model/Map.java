package com.sheep.model;

import java.util.ArrayList;
import java.util.List;

/*
    a map has multiple layers, layers overlap, the toper one can be clicked
 */
public class Map {

    private Integer floorHeight; //related to the level of the game

    private List<Layer> list = new ArrayList<>();

    public Integer getFloorHeight() {
        return floorHeight;
    }

    public void setFloorHeight(Integer floorHeight) {
        this.floorHeight = floorHeight;
    }

    public List<Layer> getList() {
        return list;
    }

    public void setList(List<Layer> list) {
        this.list = list;
    }
}
