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

        colors.add(new Word(R.mipmap.ic_launcher, "wetetti", "red"));
        colors.add(new Word(R.mipmap.ic_launcher, "chokokki", "green"));
        colors.add(new Word(R.mipmap.ic_launcher, "takaakki", "brown"));
        colors.add(new Word(R.mipmap.ic_launcher, "topoppi", "gray"));
        colors.add(new Word(R.mipmap.ic_launcher, "kululli", "black"));
        colors.add(new Word(R.mipmap.ic_launcher, "kelelli", "white"));
        colors.add(new Word(R.mipmap.ic_launcher, "topiise", "dusty yellow"));
        colors.add(new Word(R.mipmap.ic_launcher, "chiwiite", "mustard yellow"));

        WordAdapter colorsAdapter = new WordAdapter(this, colors);

        ListView colorView = (ListView) findViewById(R.id.list);

        colorView.setAdapter(colorsAdapter);
    }

}

