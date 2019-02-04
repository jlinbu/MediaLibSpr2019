package com.linburgtech.medialib;

public class MediaLib {

    public static double totalCost = 0.0;
    public static int numSongs = 0;
    public static double avgCost = 0.0;
    public static void main()
    {
        Book myFavoriteBook = new Book("The Cat in the Hat", "Dr. Seuss",10.00);
        myFavoriteBook.giveDiscount(15);
        System.out.println("The new price of book:");
        System.out.println(myFavoriteBook.getPrice());
        /*System.out.println("Welcome to your Media Library");
        Song song1 = new Song(3, "Test Song");
        numSongs += 1;
        Song song2 = new Song();
        numSongs += 1;
        // set song 1 cost here
        totalCost += 0.99;
        // set song 2 price here
        totalCost += 1.29;
        avgCost = totalCost / numSongs;
        System.out.println(numSongs);
        System.out.println(totalCost);
        System.out.println(avgCost);
        System.out.println(song1.getTitle());
        System.out.println(song2);
        song1.setTitle("All Star Except It's Windows XP");
        System.out.println(song1.getTitle());
        song2.setTitle(song1.getTitle());
        System.out.println(song2.getFavorite());
        song2.modifyFavorites();
        System.out.println(song2.getFavorite());
        // Create movie, set title, set rating, print both
        Movie movie1 = new Movie();
        movie1.setTitle("Whatever title you want");
        movie1.setRating(1);

        System.out.println(movie1.getTitle() + movie1.getRating());*/
    }

}
