package com.example.android.miwok;

public class Word {

    private String mDefaultTranslation;
    private String mMiwokTranslation;
    private int mImageResource = NO_IMAGE_PROVIDED;
    private static final int NO_IMAGE_PROVIDED = -1;


    public Word(String defaultTranslation, String miwokTranslation) {
        mMiwokTranslation = miwokTranslation;
        mDefaultTranslation = defaultTranslation;
    }

    public String getMiwokTranslation() {
        return mMiwokTranslation;
    }
    public String getDefaultTranslation() {
        return mDefaultTranslation;
    }
    public int getImageResource() { return mImageResource; }

    public Word(String defaultTranslation, String miwokTranslation, int imageResource) {
        mMiwokTranslation = miwokTranslation;
        mDefaultTranslation = defaultTranslation;
        mImageResource = imageResource;
    }

    public boolean hasImage() {
        return mImageResource != NO_IMAGE_PROVIDED;
    }



}
