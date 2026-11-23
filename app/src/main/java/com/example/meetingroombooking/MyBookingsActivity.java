package com.example.meetingroombooking;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowCompat;
import androidx.core.view.WindowInsetsCompat;

public class MyBookingsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        WindowCompat.enableEdgeToEdge(getWindow());
        setContentView(R.layout.activity_my_bookings);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        Button btnbackfrommybooking = findViewById(R.id.btnbackfrommybooking);
        btnbackfrommybooking.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MyBookingsActivity.this, HomeActivity.class);
                startActivity(intent);
                finish();
            }
        });
        Button btnlogoutfrommybooking = findViewById(R.id.btnlogoutfrommybooking);
        btnlogoutfrommybooking.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MyBookingsActivity.this, LoginActivity.class);
                startActivity(intent);
                finish();
            }
        });
        Button btncancelrequestfrommybooking = findViewById(R.id.btncancelrequestfrommybooking);
        btncancelrequestfrommybooking.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MyBookingsActivity.this, CancelConfirmActivity.class);
                startActivity(intent);
            }
        });
        Button btncancelbookingfrommybooking = findViewById(R.id.btncancelbookingfrommybooking);
        btncancelbookingfrommybooking.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MyBookingsActivity.this, CancelConfirmActivity.class);
                startActivity(intent);
            }
        });
        Button btnhomefrommybooking = findViewById(R.id.btnhomefrommybooking);
        btnhomefrommybooking.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MyBookingsActivity.this, HomeActivity.class);
                startActivity(intent);
            }
        });
        Button btnsearchfrommybooking = findViewById(R.id.btnsearchfrommybooking);
        btnsearchfrommybooking.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MyBookingsActivity.this, SearchActivity.class);
                startActivity(intent);
            }
        });
        Button btnbookstatusfrommybooking = findViewById(R.id.btnbookstatusfrommybooking);
        btnbookstatusfrommybooking.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MyBookingsActivity.this, BookingStatusActivity.class);
                startActivity(intent);
            }
        });
    }
}