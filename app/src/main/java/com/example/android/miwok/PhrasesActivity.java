package com.example.android.miwok;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class PhrasesActivity extends AppCompatActivity {

    private MediaPlayer phrasesPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        final ArrayList<Word> phrases = new ArrayList<> ();

        phrases.add(new Word("minto wuksus", "Where are you going?", R.raw.phrase_where_are_you_going));
        phrases.add(new Word("tinne oyaase'ne", "What is your name?", R.raw.phrase_what_is_your_name));
        phrases.add(new Word("oyaaset", "My name is", R.raw.phrase_my_name_is));
        phrases.add(new Word("michekses?", "How are you feeling?", R.raw.phrase_how_are_you_feeling));
        phrases.add(new Word("kuchi achit", "I'm feeling good.", R.raw.phrase_im_feeling_good));
        phrases.add(new Word("eenes'aa?", "Are you coming?", R.raw.phrase_are_you_coming));
        phrases.add(new Word("hee'eenem", "Yes, I'm coming.", R.raw.phrase_yes_im_coming));
        phrases.add(new Word("eenem", "I'm coming.", R.raw.phrase_im_coming));
        phrases.add(new Word("yoowutis", "Let's go.", R.raw.phrase_lets_go));
        phrases.add(new Word("anni'nem", "Come here", R.raw.phrase_come_here));

        WordAdapter phrasesAdapter = new WordAdapter(this, phrases);

        ListView phrasesView = (ListView) findViewById(R.id.list);

        phrasesView.setAdapter(phrasesAdapter);

        phrasesView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                Word phrase = phrases.get(position);

                phrasesPlayer = MediaPlayer.create(PhrasesActivity.this, phrase.getMiwokPronunciation());
                phrasesPlayer.start();
            }
        });
    }
}
