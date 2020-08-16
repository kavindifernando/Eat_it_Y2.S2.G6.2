package com.example.driverregister;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class FeedBack_list extends AppCompatActivity {
    ListView listView2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_feed_back_list);

        listView2 = findViewById(R.id.listView2);

        String[] values = new String[] {
                "Excellent",  "Good", "Neutral", "Bad", "Good", "Neutral", "Bad","Excellent",  "Good", "Neutral"
        };

        ArrayAdapter<String> adapter = new ArrayAdapter<>
                (this, android.R.layout.simple_list_item_1, android.R.id.text1, values);

        listView2.setAdapter(adapter);
    }
}