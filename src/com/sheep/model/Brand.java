package com.sheep.model;

import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

/*
    Brand represents a card
 */
public class Brand extends Component{
    private String name;

    private Boolean isGray;

    private Image image;

    private Image grayImage;

    private Integer x;
    private Integer y;

    private Integer width;
    private Integer height;

    public Brand(String name){
        this.name = name;
        this.image = Toolkit.getDefaultToolkit().getImage("C:\\Users\\Haydon\\Desktop\\Repos\\sheep\\imgs\\刷子.png");
        this.grayImage = Toolkit.getDefaultToolkit().getImage("imgs\\"+name+"_gray.png");

        this.isGray = false;

        this.width = 50;
        this.height = 50;

        this.x = 0;
        this.y = 0;

        this.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                System.out.println("Brand.mouseClicked");
                Brand brand = (Brand) e.getSource(); // get the current component
                brand.getParent().remove(brand); // remove itself by utilising parent container

            }
        });
    }

    @Override
    public void paint(Graphics g){
        if (this.isGray == true){
            g.drawImage(this.grayImage, this.x, this.y, null);
        }else{
            g.drawImage(this.image, this.x, this.y, null);
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Boolean getGray() {
        return isGray;
    }

    public void setGray(Boolean gray) {
        isGray = gray;
    }

    public Image getImage() {
        return image;
    }

    public void setImage(Image image) {
        this.image = image;
    }

    public Image getGrayImage() {
        return grayImage;
    }

    public void setGrayImage(Image grayImage) {
        this.grayImage = grayImage;
    }

//    @Override
//    public int getX() {
//        return x;
//    }
//
//    public void setX(Integer x) {
//        this.x = x;
//    }
//
//    @Override
//    public int getY() {
//        return y;
//    }
//
//    public void setY(Integer y) {
//        this.y = y;
//    }
//
//    @Override
//    public int getWidth() {
//        return width;
//    }
//
//    public void setWidth(Integer width) {
//        this.width = width;
//    }
//
//    @Override
//    public int getHeight() {
//        return height;
//    }
//
//    public void setHeight(Integer height) {
//        this.height = height;
//    }

}
