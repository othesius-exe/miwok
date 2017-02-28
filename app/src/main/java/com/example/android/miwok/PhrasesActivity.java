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

        phrases.add(new Word("minto wuksus", "Where are you going?"));
        phrases.add(new Word("tinne oyaase'ne", "What is your name?"));
        phrases.add(new Word("oyaaset", "My name is"));
        phrases.add(new Word("michekses?", "How are you feeling?"));
        phrases.add(new Word("kuchi achit", "I'm feeling good."));
        phrases.add(new Word("eenes'aa?", "Are you coming?"));
        phrases.add(new Word("hee'eenem", "Yes, I'm coming."));
        phrases.add(new Word("eenem", "I'm coming."));
        phrases.add(new Word("yoowutis", "Let's go."));
        phrases.add(new Word("anni'nem", "Come here"));

        WordAdapter phrasesAdapter = new WordAdapter(this, phrases);

        ListView phrasesView = (ListView) findViewById(R.id.list);

        phrasesView.setAdapter(phrasesAdapter);
    }
}
