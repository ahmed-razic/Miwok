package com.example.android.miwok;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView numbers = findViewById(R.id.numbers);
        numbers.setOnClickListener(view -> {
            Intent numbersIntent = new Intent(MainActivity.this, NumbersActivity.class);
            startActivity(numbersIntent);
        });

        TextView family = findViewById(R.id.family);
        family.setOnClickListener(view -> {
            Intent familyIntent = new Intent(MainActivity.this, FamilyActivity.class);
            startActivity(familyIntent);
        });

        TextView phrases = findViewById(R.id.phrases);
        phrases.setOnClickListener(view -> {
            Intent phrasesIntent = new Intent(MainActivity.this, PhrasesActivity.class);
            startActivity(phrasesIntent);
        });

        TextView colors = findViewById(R.id.colors);
        colors.setOnClickListener(view -> {
            Intent colorsIntent = new Intent(MainActivity.this, ColorsActivity.class);
            startActivity(colorsIntent);
        });

        TextView myTest = findViewById(R.id.myTextView);
        myTest.setOnClickListener(v -> {
            Intent myIntent = new Intent(MainActivity.this, testActivity.class);
            startActivity(myIntent);
        });

    }





/*    public void openNumbersActivity(View view) {

    }*/


}