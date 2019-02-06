package com.example.cardviewswiper;

public class Model {
    private int Image;
    private String t1;
    private String t2;
     public Model(int image,String t1,String t2){
         this.Image=image;
         this.t1=t1;
         this.t2=t2;
     }

    public int getImage() {
        return Image;
    }

    public void setImage(int image) {
        Image = image;
    }

    public String getT1() {
        return t1;
    }

    public void setT1(String t1) {
        this.t1 = t1;
    }

    public String getT2() {
        return t2;
    }

    public void setT2(String t2) {
        this.t2 = t2;
    }
}
