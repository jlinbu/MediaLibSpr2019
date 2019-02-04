package com.linburgtech.medialib;

public class Movie {
    private int rating = 0;
    private String title = "";

    public Movie()
    {

    }

    public String getTitle(){
        return title;
    }

    public void setTitle(String title){
        this.title = title;
    }

    public int getRating(){
        return rating;
    }

    public void setRating(int rating){
        this.rating = rating;
    }
}
