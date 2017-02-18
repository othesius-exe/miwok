package com.example.android.miwok;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class PhrasesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        ArrayList<Word> phrases = new ArrayList<> ();

        phrases.add(new Word("Where are you going?", "minto wuksus"));
        phrases.add(new Word("What is your name?", "tinne oyaase'ne"));
        phrases.add(new Word("My name is", "oyaaset"));
        phrases.add(new Word("How are you feeling?", "kuchi achit"));
        phrases.add(new Word("Are you coming?", "eenes'aa?"));
        phrases.add(new Word("Yes, I'm coming.", "hee'eenem"));
        phrases.add(new Word("I'm coming.", "eenem"));
        phrases.add(new Word("Let's go.", "yoowutis"));
        phrases.add(new Word("Come here", "anni'nem"));

        WordAdapter phrasesAdapter = new WordAdapter(this, phrases);

        ListView phrasesView = (ListView) findViewById(R.id.list);

        phrasesView.setAdapter(phrasesAdapter);
    }
}
