package com.example.android.miwok;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class FamilyMembersActivity extends AppCompatActivity {

    private MediaPlayer familyPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        final ArrayList<Word> familyMembers = new ArrayList<> ();

        familyMembers.add(new Word(R.drawable.family_father, "epe", "father", R.raw.family_father));
        familyMembers.add(new Word(R.drawable.family_mother, "eta", "mother", R.raw.family_mother));
        familyMembers.add(new Word(R.drawable.family_son, "angsi", "son", R.raw.family_son));
        familyMembers.add(new Word(R.drawable.family_daughter, "tune", "daughter", R.raw.family_daughter));
        familyMembers.add(new Word(R.drawable.family_older_brother, "taachi", "older brother", R.raw.family_older_brother));
        familyMembers.add(new Word(R.drawable.family_younger_brother, "chalitti", "younger brother", R.raw. family_younger_brother));
        familyMembers.add(new Word(R.drawable.family_older_sister, "tete", "older sister", R.raw.family_older_sister));
        familyMembers.add(new Word(R.drawable.family_younger_sister, "kollitti", "younger sister", R.raw.family_younger_sister));
        familyMembers.add(new Word(R.drawable.family_grandmother, "ama", "grandmother", R.raw.family_grandmother));
        familyMembers.add(new Word(R.drawable.family_grandfather, "paapa", "grandfather", R.raw.family_grandfather));

        WordAdapter familyAdapter = new WordAdapter(this, familyMembers);

        ListView familyView = (ListView) findViewById(R.id.list);

        familyView.setAdapter(familyAdapter);

        familyView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                // Gets the position of the user's touch
                Word family = familyMembers.get(position);

                familyPlayer = MediaPlayer.create(FamilyMembersActivity.this, family.getMiwokPronunciation());
                familyPlayer.start();
            }
        });

    }
}
