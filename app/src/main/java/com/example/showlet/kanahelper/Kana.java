package com.example.showlet.kanahelper;

/**
 * Created by showlet on 06/02/17.
 */

public abstract class Kana {

    private String _syllable;

    public Kana(String syllable) {
        _syllable = syllable;
    }

    public String getSyllable() {return _syllable;}

}
