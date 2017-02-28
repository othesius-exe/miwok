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

        colors.add(new Word(R.drawable.color_red, "wetetti", "red"));
        colors.add(new Word(R.drawable.color_green, "chokokki", "green"));
        colors.add(new Word(R.drawable.color_brown, "takaakki", "brown"));
        colors.add(new Word(R.drawable.color_gray, "topoppi", "gray"));
        colors.add(new Word(R.drawable.color_black, "kululli", "black"));
        colors.add(new Word(R.drawable.color_white, "kelelli", "white"));
        colors.add(new Word(R.drawable.color_dusty_yellow, "topiise", "dusty yellow"));
        colors.add(new Word(R.drawable.color_mustard_yellow, "chiwiite", "mustard yellow"));

        WordAdapter colorsAdapter = new WordAdapter(this, colors);

        ListView colorView = (ListView) findViewById(R.id.list);
        colorView.setAdapter(colorsAdapter);
    }
}

