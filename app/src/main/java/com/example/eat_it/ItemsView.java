package com.example.eat_it;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class ItemsView extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_items_view);

        //imageButton
        ImageButton imagebtn4 = (ImageButton) findViewById(R.id.imageButton9);
        imagebtn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ItemsView.this, AdmItemProfile.class );
                startActivity(intent);
            }
        });

        //BackButton
        Button btnback = (Button) findViewById(R.id.button4);
        btnback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent2 = new Intent(ItemsView.this, AdminHome.class );
                startActivity(intent2);
            }
        });

        //InsertNewButton
        Button btninsert = (Button) findViewById(R.id.button19);
        btninsert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent3 = new Intent(ItemsView.this, AdmItemAdd.class );
                startActivity(intent3);
            }
        });
    }

}