package com.example.android.miwok;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class NumbersActivity extends AppCompatActivity {

    private MediaPlayer numbersPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        // Create an ArrayList that accepts <Word> object types
        final ArrayList<Word> words = new ArrayList<>();

        //Add <Word> object types to the ArrayList
        words.add(new Word(R.drawable.number_one, "lutti", "one", R.raw.number_one));
        words.add(new Word(R.drawable.number_two, "otiiko", "two", R.raw.number_two));
        words.add(new Word(R.drawable.number_three, "tolookosu", "three", R.raw.number_three));
        words.add(new Word(R.drawable.number_four, "oyyisa", "four", R.raw.number_four));
        words.add(new Word(R.drawable.number_five, "massokka", "five", R.raw.number_five));
        words.add(new Word(R.drawable.number_six, "temmokka", "six", R.raw.number_six));
        words.add(new Word(R.drawable.number_seven, "tenekaku", "seven", R.raw.number_seven));
        words.add(new Word(R.drawable.number_eight, "kawinta", "eight", R.raw.number_eight));
        words.add(new Word(R.drawable.number_nine, "wo'e", "nine", R.raw.number_nine));
        words.add(new Word(R.drawable.number_ten, "na'aacha", "ten", R.raw.number_ten));

        //Instantiate a new WordAdapter for the words ArrayList
        WordAdapter adapter = new WordAdapter(this, words);
        //Declare the ListView to be used for placing the words objects in
        ListView listView = (ListView) findViewById(R.id.list);
        //Set the aforementioned WordAdapter adapter on the ListView
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Word number = words.get(position);

                numbersPlayer = MediaPlayer.create(NumbersActivity.this, number.getMiwokPronunciation());
                numbersPlayer.start();
            }
        });
    }
}
