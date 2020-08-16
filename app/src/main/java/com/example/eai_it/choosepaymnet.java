package com.example.eai_it;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class choosepaymnet extends AppCompatActivity {
Button cashbtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choosepaymnet);
        cashbtn= findViewById(R.id.cashbtn);
        cashbtn.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(choosepaymnet.this, cashondelivery.class);
                startActivity(intent);
            }
        }));
    }
}