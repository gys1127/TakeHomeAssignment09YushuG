package com.android.takehomeassignment09_yushug;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.Date;

public class DatabaseSender extends AppCompatActivity {

    private FirebaseDatabase database = FirebaseDatabase.getInstance();
    private DatabaseReference stringReference = database.getReference("string");
    private DatabaseReference laptopReference = database.getReference("laptop");
    private DatabaseReference dateReference = database.getReference("date");

    private Button sendStringButton;
    private Button sendLaptopButton;
    private Button sendDateButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_database_sender);

        sendStringButton = findViewById(R.id.send_string_button);
        sendStringButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                stringReference.setValue("this is a new string");
            }
        });

        sendLaptopButton = findViewById(R.id.send_laptop_button);
        sendLaptopButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                laptopReference.push().setValue(new Laptop("Apple", 2018, 1.5));
            }
        });

        sendDateButton = findViewById(R.id.send_date_button);
        sendDateButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dateReference.setValue(new Date());
            }
        });
    }
}
