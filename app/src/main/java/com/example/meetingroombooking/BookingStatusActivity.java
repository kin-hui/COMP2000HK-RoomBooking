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

public class BookingStatusActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        WindowCompat.enableEdgeToEdge(getWindow());
        setContentView(R.layout.activity_booking_status);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        Button btnbackfrombookstatus = findViewById(R.id.btnbackfrombookstatus);
        btnbackfrombookstatus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(BookingStatusActivity.this, AvailableRoomsActivity.class);
                startActivity(intent);
                finish();
            }
        });
        Button btnlogoutfrombookstatus = findViewById(R.id.btnlogoutfrombookstatus);
        btnlogoutfrombookstatus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(BookingStatusActivity.this, LoginActivity.class);
                startActivity(intent);
                finish();
            }
        });
        Button btnmybookingfrombookstatus = findViewById(R.id.btnmybookingfrombookstatus);
        btnmybookingfrombookstatus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(BookingStatusActivity.this, MyBookingsActivity.class);
                startActivity(intent);
            }
        });
        Button btnhomefrombookstatus = findViewById(R.id.btnhomefrombookstatus);
        btnhomefrombookstatus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(BookingStatusActivity.this, HomeActivity.class);
                startActivity(intent);
            }
        });
        Button btnhomefrombookstatus2 = findViewById(R.id.btnhomefrombookstatus2);
        btnhomefrombookstatus2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(BookingStatusActivity.this, HomeActivity.class);
                startActivity(intent);
            }
        });
        Button btnsearchfromroomstatus = findViewById(R.id.btnsearchfromroomstatus);
        btnsearchfromroomstatus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(BookingStatusActivity.this, SearchActivity.class);
                startActivity(intent);
            }
        });
        Button btnmybookingfrombookstatus2 = findViewById(R.id.btnmybookingfrombookstatus2);
        btnmybookingfrombookstatus2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(BookingStatusActivity.this, MyBookingsActivity.class);
                startActivity(intent);
            }
        });
    }
}