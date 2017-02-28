package com.example.android.miwok;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class ColorsActivity extends AppCompatActivity {

    private MediaPlayer colorsPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        final ArrayList<Word> colors = new ArrayList<> ();

        colors.add(new Word(R.drawable.color_red, "wetetti", "red", R.raw.color_red));
        colors.add(new Word(R.drawable.color_green, "chokokki", "green", R.raw.color_green));
        colors.add(new Word(R.drawable.color_brown, "takaakki", "brown", R.raw.color_brown));
        colors.add(new Word(R.drawable.color_gray, "topoppi", "gray", R.raw.color_gray));
        colors.add(new Word(R.drawable.color_black, "kululli", "black", R.raw.color_black));
        colors.add(new Word(R.drawable.color_white, "kelelli", "white", R.raw.color_white));
        colors.add(new Word(R.drawable.color_dusty_yellow, "topiise", "dusty yellow", R.raw.color_dusty_yellow));
        colors.add(new Word(R.drawable.color_mustard_yellow, "chiwiite", "mustard yellow", R.raw.color_mustard_yellow));

        WordAdapter colorsAdapter = new WordAdapter(this, colors);

        ListView colorView = (ListView) findViewById(R.id.list);
        colorView.setAdapter(colorsAdapter);

        colorView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Word color = colors.get(position);

                colorsPlayer = MediaPlayer.create(ColorsActivity.this, color.getMiwokPronunciation());
                colorsPlayer.start();
            }
        });
    }
}

