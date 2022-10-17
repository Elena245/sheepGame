package com.sheep.test;

import com.sheep.model.Brand;
import com.sheep.model.Layer;

import java.util.Random;

/*
    test layer build
 */
public class TestBuildLayer {
    public static Random random = new Random();
    public static String[] brandNames = {
            "刷子","剪刀","叉子","手套","水桶",
            "火","玉米","球","瓶子","白菜",
            "稻草","肉腿","胡萝卜","苹果","铃铛",
            "青草"
    };

    // get brand name randomly each time
    public static String getBrandName() {
        int randomIndex  = random.nextInt(brandNames.length);
        return brandNames[randomIndex];
    }

    public static void main(String[] args) {
        Layer layer = new Layer(4,5);
        Brand[] brands = new Brand[layer.getCapacity()];

        for (int i = 0; i < brands.length; i++) {
            String randomBrandName = getBrandName();
            Brand brand1 = new Brand(randomBrandName);
            Brand brand2 = new Brand(randomBrandName);
            Brand brand3 = new Brand(randomBrandName);

        }
    }
}
