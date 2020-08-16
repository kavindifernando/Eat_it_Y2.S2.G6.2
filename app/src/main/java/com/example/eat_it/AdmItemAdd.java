package com.example.eat_it;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class AdmItemAdd extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_adm_item_add);

        //InsertButton
        Button btninsert2 = (Button) findViewById(R.id.button11);
        btninsert2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent1 = new Intent(AdmItemAdd.this, AdmItemProfile.class );
                startActivity(intent1);
            }
        });

        //backButton
        Button btnback2 = (Button) findViewById(R.id.button13);
        btnback2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent2 = new Intent(AdmItemAdd.this, ItemsView.class );
                startActivity(intent2);
            }
        });
    }
}