package com.sheep.util;

import com.sheep.model.Card;
import com.sheep.model.Cell;
import com.sheep.model.Layer;

/*
    common methodS for layer class
 */
public class LayerUtil {
    public static Layer buildLayer(Integer rowNum, Integer colNum){
        Layer layer = null;
        try {
            layer = new Layer(rowNum, colNum);
        } catch (Exception e) {
            e.printStackTrace();
        }

        Card[] cards = CardUtil.buildCards(layer.getCapacity());

        // construct n*m cells from randomly generated cards in current layer
        Cell[][] cells = layer.getCells();
        for (int row = 0; row < cells.length; row++) {
            for (int col = 0; col < cells[row].length; col++) {
                Cell cell = new Cell();
                cell.setCard(cards[row * cells[row].length + col]);
                cell.setState(1);
                cells[row][col] = cell;
            }
        }
        layer.showCells();
        return layer;
    }
}
