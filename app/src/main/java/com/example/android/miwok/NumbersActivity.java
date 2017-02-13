package com.example.android.miwok;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;

public class NumbersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numbers);

        // Declare the array of English numbers
        ArrayList<String> englishNumbers = new ArrayList<>();
        englishNumbers.add("One");
        englishNumbers.add("Two");
        englishNumbers.add("Three");
        englishNumbers.add("Four");
        englishNumbers.add("Five");
        englishNumbers.add("Six");
        englishNumbers.add("Seven");
        englishNumbers.add("Eight");
        englishNumbers.add("Nine");
        englishNumbers.add("Ten");

        LinearLayout numbersRootView = (LinearLayout) findViewById(R.id.numbers_root_view);

        for (int index = 0; index < englishNumbers.size(); index ++) {
            TextView wordView = new TextView(this);
            numbersRootView.addView(wordView);
            wordView.setText(englishNumbers.get(index));
        }
    }

}
