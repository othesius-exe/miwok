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

        familyMembers.add(new Word(R.mipmap.ic_launcher, "father", "epe"));
        familyMembers.add(new Word(R.mipmap.ic_launcher, "mother", "eta"));
        familyMembers.add(new Word(R.mipmap.ic_launcher, "son", "angsi"));
        familyMembers.add(new Word(R.mipmap.ic_launcher, "daughter", "tune"));
        familyMembers.add(new Word(R.mipmap.ic_launcher, "older brother", "taachi"));
        familyMembers.add(new Word(R.mipmap.ic_launcher, "younger brother", "chalitti"));
        familyMembers.add(new Word(R.mipmap.ic_launcher,"older sister", "tete"));
        familyMembers.add(new Word(R.mipmap.ic_launcher,"younger sister", "kollitti"));
        familyMembers.add(new Word(R.mipmap.ic_launcher, "grandmother", "ama"));
        familyMembers.add(new Word(R.mipmap.ic_launcher, "grandfather", "paapa"));

        WordAdapter familyAdapter = new WordAdapter(this, familyMembers);

        ListView familyView = (ListView) findViewById(R.id.list);

        familyView.setAdapter(familyAdapter);
    }
}
