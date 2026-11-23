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

public class AvailableRoomsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        WindowCompat.enableEdgeToEdge(getWindow());
        setContentView(R.layout.activity_available_rooms);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        Button btnbackfromavailableroom = findViewById(R.id.btnbackfromavailableroom);
        btnbackfromavailableroom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AvailableRoomsActivity.this, SearchActivity.class);
                startActivity(intent);
                finish();
            }
        });
        Button btnlogoutfromavailableroom = findViewById(R.id.btnlogoutfromavailableroom);
        btnlogoutfromavailableroom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AvailableRoomsActivity.this, LoginActivity.class);
                startActivity(intent);
                finish();
            }
        });
        Button btnbookbtninavailableroom = findViewById(R.id.btntomybookingfromavailableroom);
        btnbookbtninavailableroom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AvailableRoomsActivity.this, MyBookingsActivity.class);
                startActivity(intent);
            }
        });
        Button btnhomefromavailableroom = findViewById(R.id.btnhomefromavailableroom);
        btnhomefromavailableroom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AvailableRoomsActivity.this, HomeActivity.class);
                startActivity(intent);
            }
        });
        Button btnmybookingfromavailableroom = findViewById(R.id.btnmybookingfromavailableroom);
        btnmybookingfromavailableroom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AvailableRoomsActivity.this, MyBookingsActivity.class);
                startActivity(intent);
            }
        });

        Button btnbookstatusfromavailableroom = findViewById(R.id.btnbookstatusfromavailableroom);
        btnbookstatusfromavailableroom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AvailableRoomsActivity.this, BookingStatusActivity.class);
                startActivity(intent);
            }
        });
    }
}