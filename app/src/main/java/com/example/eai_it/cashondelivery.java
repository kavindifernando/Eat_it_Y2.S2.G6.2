package com.example.eai_it;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.eai_it.ui.login.LoginActivity;

public class cashondelivery extends AppCompatActivity {
Button button2_ccc;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cashondelivery);
        button2_ccc= findViewById(R.id.button2_ccc);
        button2_ccc.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(cashondelivery.this, creditcard.class);
                startActivity(intent);
            }
        }));
    }
}