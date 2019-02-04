package com.linburgtech.medialib;

public class Song {

    private int rating = 0;
    private String title = "";
    //price - double - 0.0
    private boolean favorite = false;

    public Song()
    {
        rating = 1;
        title = "Song Unnamed";

    }
    public Song(int rating, String title)
    {
        this.rating = rating;
        this.title = title;

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

    public void addToFavorites(){
        favorite = true;
    }

    public void modifyFavorites(){
        if (favorite){favorite = false;}
        else {favorite = true;}
    }

    public boolean getFavorite(){
        return favorite;
    }
}
