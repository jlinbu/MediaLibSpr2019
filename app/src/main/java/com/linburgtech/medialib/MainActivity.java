package com.linburgtech.medialib;

import android.app.ListActivity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends ListActivity {
    private static final String TAG = MainActivity.class.getName();
    private ArrayList<Song> songLibrary;
    private ListView songListView;
    private MediaLib mediaLib;
    private Song[] songs = {new Song("test"), new Song("test2")};
    private int numSongs =0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //begin
        double totalCost = 0.0;
        double totalRating = 0;
        int numSongs = 0;

        // according to Billboard's greatest songs...
       /* Song song1 =  new Song("The Twist", 1.29, 10);
        numSongs = numSongs + 1;
        MediaFile.writeString(song1.getTitle() + "|" + song1.getRating());

        Song song2 =  new Song("Smooth", .99, 9);
        numSongs = numSongs + 1;
        MediaFile.writeString(song2.getTitle() + "|" + song2.getRating());

        Song song3 =  new Song("Mack the Knife", 1.29, 8);
        numSongs = numSongs + 1;
        MediaFile.writeString(song3.getTitle() + "|" + song3.getRating());

        Song song4 =  new Song("How Do I Live", 99, 7);
        numSongs = numSongs + 1;
        MediaFile.writeString(song4.getTitle() + "|" + song4.getRating());

        Song song5 =  new Song("Party Rock Anthem", 1.29, 6);
        numSongs = numSongs + 1;
        MediaFile.writeString(song5.getTitle() + "|" + song5.getRating());

        Song song6 =  new Song("I Gotta Feeling", .99, 7);
        numSongs = numSongs + 1;
        MediaFile.writeString(song6.getTitle() + "|" + song6.getRating());

        Song song7 =  new Song("Macarena", 1.29, 8);
        numSongs = numSongs + 1;
        MediaFile.writeString(song7.getTitle() + "|" + song7.getRating());

        Song song8 =  new Song("Physical", .99, 9);
        numSongs = numSongs + 1;
        MediaFile.writeString(song8.getTitle() + "|" + song8.getRating());

        Song song9 =  new Song("You Light Up My Life", 1.29, 10);
        numSongs = numSongs + 1;
        MediaFile.writeString(song9.getTitle() + "|" + song9.getRating());

        Song song10 =  new Song("Hey Jude", .99, 9);
        numSongs = numSongs + 1;
        MediaFile.writeString(song10.getTitle() + "|" + song10.getRating());

        MediaFile.saveAndClose();

        String songInfo = MediaFile.readString();
        while(songInfo != null) {
            numSongs= numSongs + 1;
            songInfo = MediaFile.readString();

        }
        MediaFile.saveAndClose();
        songs = new Song[numSongs];
        int endOfLastToken = 0;
        for (int i = 0; i < numSongs-1; i++){
            songInfo = MediaFile.readString();
            String title = songInfo.substring(endOfLastToken, songInfo.indexOf("|", endOfLastToken));
            endOfLastToken = songInfo.indexOf("|", endOfLastToken)+1;
            String rateStr = songInfo.substring(endOfLastToken, (songInfo.indexOf("|", endOfLastToken)));
            endOfLastToken = songInfo.indexOf("|", endOfLastToken)+1;
            Song tempSong = new Song(title,0.0, Integer.parseInt(rateStr));
            songs[i] = tempSong;
            MediaFile.saveAndClose();
        }*/
        songLibrary = new ArrayList<Song>();
        for (int i = 0; i < songs.length; i++) {
            songLibrary.add(songs[i]);
            Log.d(TAG, "Song: " + songs[i].toString());
        }
        SongListAdapter adapter = new SongListAdapter(this, songLibrary);
        setListAdapter(adapter);
    }

}
