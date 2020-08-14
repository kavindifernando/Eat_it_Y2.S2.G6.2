package com.example.eai_it;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.eai_it.ui.login.LoginActivity;

import java.time.Instant;

public class MainActivity extends AppCompatActivity {
Button login1;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        login1=findViewById(R.id.login1);
        login1.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Instant instent =new  Instent(MainActivity.this, LoginActivity.class);
                startActivity(instent);
            }
        }));
    }
}