package com.example.driverregister;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class DriverProfile extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_driver_profile);

        //update
        Button btnUpdate;
        btnUpdate = (Button)findViewById(R.id.button10);
        btnUpdate.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent intent = new Intent(DriverProfile.this, updateProfile.class);
                        startActivity(intent);
                    }
                });

        //orderList
        Button btnOrder;
        btnOrder = (Button)findViewById(R.id.button11);
        btnOrder.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent intent = new Intent(DriverProfile.this, deliverOrderList.class);
                        startActivity(intent);
                    }
                });

        //fedback
        Button btnfeed;
        btnfeed = (Button)findViewById(R.id.button12);
        btnfeed.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent intent = new Intent(DriverProfile.this, FeedBack_list.class);
                        startActivity(intent);
                    }
                });


    }
}