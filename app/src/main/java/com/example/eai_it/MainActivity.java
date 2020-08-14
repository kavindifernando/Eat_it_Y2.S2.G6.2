package com.example.eai_it;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.content.Intent;

import com.example.eai_it.ui.login.LoginActivity;



public class MainActivity extends AppCompatActivity {
Button login1;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        login1= findViewById(R.id.login1);
        login1.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MainActivity.this, LoginActivity.class);
                startActivity(intent);
            }
        }));
    }
}