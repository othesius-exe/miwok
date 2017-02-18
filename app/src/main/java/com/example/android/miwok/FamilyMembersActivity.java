package com.example.android.miwok;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class FamilyMembersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        ArrayList<Word> familyMembers = new ArrayList<> ();

        familyMembers.add(new Word("father", "epe"));
        familyMembers.add(new Word("mother", "eta"));
        familyMembers.add(new Word("son", "angsi"));
        familyMembers.add(new Word("daughter", "tune"));
        familyMembers.add(new Word("older brother", "taachi"));
        familyMembers.add(new Word("younger brother", "chalitti"));
        familyMembers.add(new Word("older sister", "tete"));
        familyMembers.add(new Word("younger sister", "kollitti"));
        familyMembers.add(new Word("grandmother", "ama"));
        familyMembers.add(new Word("grandfather", "paapa"));

        WordAdapter familyAdapter = new WordAdapter(this, familyMembers);

        ListView familyView = (ListView) findViewById(R.id.list);

        familyView.setAdapter(familyAdapter);
    }
}
