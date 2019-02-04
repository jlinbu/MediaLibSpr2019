package com.linburgtech.medialib;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView outputText1 = (TextView) findViewById(R.id.TextField1);
        outputText1.setText("This worked!");
        TextView outputText2 = (TextView) findViewById(R.id.TextField2);
        outputText2.setText("This also worked!");
        Book myBook = new Book("The Cat in the Hat", "Dr. Seuss",10.00);
        myBook.giveDiscount(15);
        outputText1.setText("The new price of book:");
        String tempString = "" + myBook.getPrice();
        outputText2.setText(tempString);
    }
}
