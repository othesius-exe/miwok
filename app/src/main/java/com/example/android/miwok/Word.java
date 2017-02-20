package com.example.android.miwok;

/**
 * Created by Othesius on 2/16/17.
 */

public class Word {

    // Word related image
    private int mWordImage;

    // Default translation of the word
    private String mDefaultTranslation;

    // Miwok translation of the word
    private String mMiwokTranslation;

    // Sets the words
    public Word(int wordImage, String defaultTranslation, String miwokTranslation){
        mWordImage = wordImage;
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
    }

    public int getWordImage() {
        return mWordImage;
    }

    // Returns default translation
    public String getDefaultTranslation() {
        return mDefaultTranslation;
    }

    // Returns Miwok translation
    public String getMiwokTranslation() {
        return mMiwokTranslation;
    }
}
