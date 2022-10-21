package com.sheep.util;

import com.sheep.model.Layer;
import com.sheep.model.Map;

public class MapUtil {
    public static Map build(Integer floorHeight){
        Map map = new Map();
        map.setFloorHeight(floorHeight);

        Layer layer1 = LayerUtil.buildLayer(5,6);
        Layer layer2 = LayerUtil.buildLayer(3,6);
        Layer layer3 = LayerUtil.buildLayer(5,3);

        map.getList().add(layer1);
        map.getList().add(layer2);
        map.getList().add(layer3);
        return map;
    }

}
