package com.example.android.miwok;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class ColorsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        ArrayList<Word> colors = new ArrayList<> ();

        colors.add(new Word("wetetti", "red"));
        colors.add(new Word("chokokki", "green"));
        colors.add(new Word("takaakki", "brown"));
        colors.add(new Word("topoppi", "gray"));
        colors.add(new Word("kululli", "black"));
        colors.add(new Word("kelelli", "white"));
        colors.add(new Word("topiise", "dusty yellow"));
        colors.add(new Word("chiwiite", "mustard yellow"));

        WordAdapter colorsAdapter = new WordAdapter(this, colors);

        ListView colorView = (ListView) findViewById(R.id.list);

        colorView.setAdapter(colorsAdapter);
    }

}

