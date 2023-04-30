package com.thetestingacademy.collection.normal;

import java.util.Comparator;

public class Song{


//    @Override
//    public int compareTo(Object o) {
//        return this.getTitle().compareTo();
//    }


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    String title;
    String price;
    String author;

    Song(String title, String price,String author){
        this.title = title;
        this.price = price;
        this.author = author;
    }


}
