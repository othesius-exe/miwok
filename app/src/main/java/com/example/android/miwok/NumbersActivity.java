package com.example.android.miwok;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class NumbersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        // Create an ArrayList that accepts <Word> object types
        ArrayList<Word> words = new ArrayList<>();

        //Add <Word> object types to the ArrayList
        words.add(new Word(R.mipmap.ic_launcher, "lutti", "one"));
        words.add(new Word(R.mipmap.ic_launcher, "otiiko", "two"));
        words.add(new Word(R.mipmap.ic_launcher, "tolookosu", "three"));
        words.add(new Word(R.mipmap.ic_launcher, "oyyisa", "four"));
        words.add(new Word(R.mipmap.ic_launcher, "massokka", "five"));
        words.add(new Word(R.mipmap.ic_launcher, "temmokka", "six"));
        words.add(new Word(R.mipmap.ic_launcher, "tenekaku", "seven"));
        words.add(new Word(R.mipmap.ic_launcher, "kawinta", "eight"));
        words.add(new Word(R.mipmap.ic_launcher, "wo'e", "nine"));
        words.add(new Word(R.mipmap.ic_launcher, "na'aacha", "ten"));

        //Instantiate a new WordAdapter for the words ArrayList
        WordAdapter adapter = new WordAdapter(this, words);
        //Declare the ListView to be used for placing the words objects in
        ListView listView = (ListView) findViewById(R.id.list);
        //Set the aforementioned WordAdapter adapter on the ListView
        listView.setAdapter(adapter);
    }

}
