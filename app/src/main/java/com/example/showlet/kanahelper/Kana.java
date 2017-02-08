package com.example.showlet.kanahelper;

/**
 * Created by showlet on 06/02/17.
 */

public abstract class Kana {

    private String _syllable;
    private int _imageID;

    public Kana(String syllable) {
        _syllable = syllable;
    }
    public Kana(String syllable, int imageId) {
        _syllable = syllable;
        _imageID = imageId;
    }

    public String getSyllable() {return _syllable;}
    public int getID() {return _imageID;}

}
