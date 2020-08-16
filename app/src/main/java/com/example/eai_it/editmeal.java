package com.example.eai_it;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class editmeal extends AppCompatActivity {
Button remove2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_editmeal);
        remove2= findViewById(R.id.remove2);
        remove2.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(editmeal.this, choosepaymnet.class);
                startActivity(intent);
            }
        }));
    }
}