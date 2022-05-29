package com.aranei.var2.n9;

public class Closet implements Furniture{
    String material;
    int height;
    int width;
    int depth;

    public Closet(int height, int width, int depth) {
        this.height = height;
        this.width = width;
        this.depth = depth;
    }

    public Closet() {
    }

    public Closet(String material, int height, int width, int depth) {
        this.material = material;
        this.height = height;
        this.width = width;
        this.depth = depth;
    }

    @Override
    public void material(String type) {
        this.material = type;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getDepth() {
        return depth;
    }

    public void setDepth(int depth) {
        this.depth = depth;
    }

    @Override
    public String toString() {
        return "Closet{" +
                "material='" + material + '\'' +
                ", height=" + height +
                ", width=" + width +
                ", depth=" + depth +
                '}';
    }
}
