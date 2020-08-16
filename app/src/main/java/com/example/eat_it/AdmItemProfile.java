package com.example.eat_it;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class AdmItemProfile extends AppCompatActivity {

    Button buttonn1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_adm_item_profile);

        //backButton
        Button btnback3 = (Button) findViewById(R.id.button5);
        btnback3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent1 = new Intent(AdmItemProfile.this, ItemsView.class );
                startActivity(intent1);
            }
        });

        //UpdateButton
        Button btnupdate1 = (Button) findViewById(R.id.button6);
        btnupdate1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent2 = new Intent(AdmItemProfile.this, Adupdateitems.class );
                startActivity(intent2);
            }
        });

        //DeleteButton
        Button btndelete1 = (Button) findViewById(R.id.button12);
        btndelete1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent3 = new Intent(AdmItemProfile.this, ItemsView.class );
                startActivity(intent3);
            }
        });
    }
   /* public void onClickButtonListener3(){
        buttonn1 = (Button)findViewById(R.id.button6);
        buttonn1.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent intent = new Intent(AdmItemProfile.this, Adupdateitems.class);
                        startActivity(intent);
                    }
                }
        ); */


}