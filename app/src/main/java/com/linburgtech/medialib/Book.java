package com.linburgtech.medialib;

public class Book {
    private String title;
    private String author;
    private double price;
    private String pubDate;

    public Book(String title, String author, double price){
        this.title = title;
        this.author = author;
        this.price = price;
    }

    /**
     * Returns the price of the book
     *
     * @return book price
     */
    public double getPrice()
    {
        return price;
    }

    /**
     * Decreases book price
     *
     * @param byPercent the percent the price is decreased
     */
    public void giveDiscount(double byPercent)
    {
        //price = ((100-byPercent)/100)*price;
        this.price -= (this.price * (byPercent/100));
    }

    // other methods not shown
}
