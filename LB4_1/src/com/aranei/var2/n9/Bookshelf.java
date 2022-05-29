package com.aranei.var2.n9;

public class Bookshelf extends Closet{
    int shelves;

    public Bookshelf(int height, int width, int depth, int shelves) {
        super(height, width, depth);
        this.shelves = shelves;
    }

    public Bookshelf(int shelves) {
        this.shelves = shelves;
    }

    public Bookshelf(String material, int height, int width, int depth, int shelves) {
        super(material, height, width, depth);
        this.shelves = shelves;
    }


    public int getShelves() {
        return shelves;
    }

    public void setShelves(int shelves) {
        this.shelves = shelves;
    }

    public void addShelves(int num){
        this.shelves += num;
    }

    public void deleteShelves(int num){
        this.shelves -= num;
    }
}
