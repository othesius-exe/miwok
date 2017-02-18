package com.example.android.miwok;
/**
 * Created by Othesius on 2/16/17.
 */

public class Word {

    // Default translation of the word
    private String mDefaultTranslation;

    // Miwok translation of the word
    private String mMiwokTranslation;

    // Accepts words and converts them from one language to the other
    public Word(String defaultTranslation, String miwokTranslation){
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
    }

    // Returns default translation
    public String getDefaultTranslation() {
        return mDefaultTranslation;
    }

    // Returns Miwok translation
    public String getmMiwokTranslation() {
        return mMiwokTranslation;
    }
}
