package com.example.tolkworld;

public class ImageModel {
    String title;
    String image;


    public ImageModel(String title,String image){
        this.title=title;
        this.image=image;
    }
    public String getTitle(){
        return title;
    }
    public void setTitle(String title){
        this.title=title;
    }
    public String getImage(){
        return image;
    }
    public void setImage(String image){
        this.image=image;
    }


}
