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

        phrases.add(new Word(R.mipmap.ic_launcher, "Where are you going?", "minto wuksus"));
        phrases.add(new Word(R.mipmap.ic_launcher, "What is your name?", "tinne oyaase'ne"));
        phrases.add(new Word(R.mipmap.ic_launcher, "My name is", "oyaaset"));
        phrases.add(new Word(R.mipmap.ic_launcher, "How are you feeling?", "kuchi achit"));
        phrases.add(new Word(R.mipmap.ic_launcher, "Are you coming?", "eenes'aa?"));
        phrases.add(new Word(R.mipmap.ic_launcher, "Yes, I'm coming.", "hee'eenem"));
        phrases.add(new Word(R.mipmap.ic_launcher, "I'm coming.", "eenem"));
        phrases.add(new Word(R.mipmap.ic_launcher, "Let's go.", "yoowutis"));
        phrases.add(new Word(R.mipmap.ic_launcher, "Come here", "anni'nem"));

        WordAdapter phrasesAdapter = new WordAdapter(this, phrases);

        ListView phrasesView = (ListView) findViewById(R.id.list);

        phrasesView.setAdapter(phrasesAdapter);
    }
}
