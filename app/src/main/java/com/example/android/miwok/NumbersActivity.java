package com.example.android.miwok;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.ArrayList;

public class NumbersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numbers);

        ArrayList<String> words = new ArrayList<String>();
        words.add("one");
        words.add("two");
        words.add("three");
        words.add("four");
        words.add("five");
        words.add("six");
        words.add("seven");
        words.add("eight");
        words.add("nine");
        words.add("ten");



        ArrayAdapter<String> itemsAdapter = new ArrayAdapter<String>(this, R.layout.items_layout, words);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(itemsAdapter);

/*      LinearLayout rootView = findViewById(R.id.rootView);

        int index = 0;
        while (index < words.size()){
            TextView wordView = new TextView(this);
            wordView.setText(words.get(index));
            rootView.addView(wordView);
            index++;

        for (int index = 0; index < words.size(); index++) {
            TextView wordView = new TextView(this);
            wordView.setText(words.get(index));
            rootView.addView(wordView);

        Log.v("NumbersActivity", "Word at index 0: " + words.get(0));
        Log.v("NumbersActivity", "Word at index 1: " + words.get(1));
        Log.v("NumbersActivity", "Word at index 2: " + words.get(2));
        Log.v("NumbersActivity", "Word at index 3: " + words.get(3));
        Log.v("NumbersActivity", "Word at index 4: " + words.get(4));
        Log.v("NumbersActivity", "Word at index 5: " + words.get(5));
        Log.v("NumbersActivity", "Word at index 6: " + words.get(6));
        Log.v("NumbersActivity", "Word at index 7: " + words.get(7));
        Log.v("NumbersActivity", "Word at index 8: " + words.get(8));
        Log.v("NumbersActivity", "Word at index 9: " + words.get(9));
        Log.v("NumbersActivity", "Size of ArrayList words: " + words.size());

        String[] words;
        words = new String[10];
        words[0] = "one";
        Log.v("NumbersActivity", "Word at index 0: " + words[0]);
        words[1] = "two";
        Log.v("NumbersActivity", "Word at index 1: " + words[1]);
        words[2] = "three";
        Log.v("NumbersActivity", "Word at index 2: " + words[2]);
        words[3] = "four";
        Log.v("NumbersActivity", "Word at index 3: " + words[3]);
        words[4] = "five";
        Log.v("NumbersActivity", "Word at index 4: " + words[4]);
        words[5] = "six";
        Log.v("NumbersActivity", "Word at index 5: " + words[5]);
        words[6] = "seven";
        Log.v("NumbersActivity", "Word at index 6: " + words[6]);
        words[7] = "eight";
        Log.v("NumbersActivity", "Word at index 7: " + words[7]);
        words[8] = "nine";
        Log.v("NumbersActivity", "Word at index 8: " + words[8]);
        words[9] = "ten";
        Log.v("NumbersActivity", "Word at index 9: " + words[9]);
*/
    }
}