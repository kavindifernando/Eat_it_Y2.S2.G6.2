package com.example.eat_it;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Adupdateitems extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_adupdateitems);

        //UpdateButton
        Button btnupdate2 = (Button) findViewById(R.id.button9);
        btnupdate2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent2 = new Intent(Adupdateitems.this, ItemsView.class );
                startActivity(intent2);
            }
        });

        //backButton
        Button btnback5 = (Button) findViewById(R.id.button20);
        btnback5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent2 = new Intent(Adupdateitems.this, AdmItemProfile.class );
                startActivity(intent2);
            }
        });

    }
}