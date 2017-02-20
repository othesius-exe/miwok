package com.example.android.miwok;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

import static com.example.android.miwok.R.id.list_view_1;
import static com.example.android.miwok.R.id.list_view_2;
import static com.example.android.miwok.R.id.word_image_view;

/**
 * Created by Othesius on 2/16/17.
 */

public class WordAdapter extends ArrayAdapter<Word> {
    /**
     *
     * @param context Current context (Activity)
     * @param words A list of words to be displayed in a list
     */
    public WordAdapter(Activity context, ArrayList<Word> words) {
        super(context, 0, words);
    }

    /**
     *
     * @param position The Position in the list that should be displayed
     * @param convertView The recycled view to use
     * @param parent Parent view group used for inflation
     * @return
     */
    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Get the data item for this position
        Word word = getItem(position);

        // Check if an existing view is being reused, otherwise inflate the view
        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);
        }

        // Lookup view for data population
        ImageView wordImage = (ImageView) convertView.findViewById(word_image_view);
        TextView defaultWord = (TextView) convertView.findViewById(list_view_1);
        TextView miwokWord = (TextView) convertView.findViewById(list_view_2);

        // Populate the data into the template view using the data object
        wordImage.setImageResource(word.getWordImage());
        defaultWord.setText(word.getDefaultTranslation());
        miwokWord.setText(word.getMiwokTranslation());
        // Return the completed view to render on screen
        return convertView;
    }

}
