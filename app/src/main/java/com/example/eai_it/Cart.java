package com.example.eai_it;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.eai_it.ui.login.LoginActivity;

public class Cart extends AppCompatActivity {
Button mealedit2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cart);
        mealedit2= findViewById(R.id.mealedit2);
        mealedit2.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(Cart.this, editmeal.class);
                startActivity(intent);
            }
        }));
    }
}