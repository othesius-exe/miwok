package com.example.android.miwok;

/**
 * Created by Othesius on 2/16/17.
 */

public class Word {

    // Variable to store the image related to the word
    private int mWordImage = NO_IMAGE_PROVIDED;

    // Default translation of the word
    private String mDefaultTranslation;

    // Miwok translation of the word
    private String mMiwokTranslation;

    private int mMiwokPronunciation;

    // Miwok pronunciation variable
    private static final int NO_SOUND_PROVIDED = -1;

    // Constant value to represent that no image was provided
    private static final int NO_IMAGE_PROVIDED = -1;

    //
    public boolean hasImageId() {
        return mWordImage != NO_IMAGE_PROVIDED;
    }

    // Constructor with word related image
    public Word(int wordImage, String defaultTranslation, String miwokTranslation, int miwokPronunciation){
        mWordImage = wordImage;
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        mMiwokPronunciation = miwokPronunciation;
    }

    // Phrases activity constructor
    public Word(String defaultTranslation, String miwokTranslation, int miwokPronunciation) {
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        mMiwokPronunciation = miwokPronunciation;
    }

    public int getImageResourceId() {
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

    public int getMiwokPronunciation() {
        return mMiwokPronunciation;
    }
}
