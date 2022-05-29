package com.aranei;

import java.util.ArrayList;

public class PhotoAlbum {
    private ArrayList<Photo> albums;

    public void setPhotoName(String name, int pos){
        Photo local = new Photo();
        local.setName(name);
        albums.set(pos, local);
    }

    public void setNewPhoto(){
        Photo local = new Photo();
        local.setName("Temp");
        albums.add(local);
    }

    public void showNumber(){
        System.out.println(albums.size());
    }
}
