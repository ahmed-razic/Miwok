package com.example.android.miwok;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class TestActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test);

        TextView myTextView = findViewById(R.id.myTextView);
        myTextView.setOnClickListener(view -> {
            Intent myIntent = new Intent(TestActivity.this, MainActivity.class);
            startActivity(myIntent);
        });
    }
}