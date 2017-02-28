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

        familyMembers.add(new Word(R.drawable.family_father, "epe", "father"));
        familyMembers.add(new Word(R.drawable.family_mother, "eta", "mother"));
        familyMembers.add(new Word(R.drawable.family_son, "angsi", "son"));
        familyMembers.add(new Word(R.drawable.family_daughter, "tune", "daughter"));
        familyMembers.add(new Word(R.drawable.family_older_brother, "taachi", "older brother"));
        familyMembers.add(new Word(R.drawable.family_younger_brother, "chalitti", "younger brother"));
        familyMembers.add(new Word(R.drawable.family_older_sister, "tete", "older sister"));
        familyMembers.add(new Word(R.drawable.family_younger_sister, "kollitti", "younger sister"));
        familyMembers.add(new Word(R.drawable.family_grandmother, "ama", "grandmother"));
        familyMembers.add(new Word(R.drawable.family_grandfather, "paapa", "grandfather"));

        WordAdapter familyAdapter = new WordAdapter(this, familyMembers);

        ListView familyView = (ListView) findViewById(R.id.list);

        familyView.setAdapter(familyAdapter);
    }
}
