package com.sheep.test;

import com.sheep.model.Layer;
import com.sheep.model.Map;
import com.sheep.util.LayerUtil;

import java.util.List;

public class TestBuildMap {
    public static void main(String[] args) {
        Map map = new Map();
        map.setFloorHeight(3);

        Layer layer1 = LayerUtil.buildLayer(5,6);
        Layer layer2 = LayerUtil.buildLayer(3,6);
        Layer layer3 = LayerUtil.buildLayer(5,3);

        map.getList().add(layer1); // in absolute layout, the first added would be on the toper layer
        map.getList().add(layer2);
        map.getList().add(layer3);

    }
}
