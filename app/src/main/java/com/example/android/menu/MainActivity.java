package com.example.android.menu;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void printToLogs(View view) {
        // Find first menu item TextView and print the text to the logs
        TextView textViewItem1= findViewById(R.id.menu_item_1);
        String message1 = (String) textViewItem1.getText();
        Log.v("MainActivity", message1);
        // Find second menu item TextView and print the text to the logs
        TextView textViewItem2= findViewById(R.id.menu_item_2);
        String message2 = (String) textViewItem2.getText();
        Log.v("MainActivity", message2);
        // Find third menu item TextView and print the text to the logs
        TextView textViewItem3= findViewById(R.id.menu_item_3);
        String message3 = (String) textViewItem3.getText();
        Log.v("MainActivity", message3);

    }
}