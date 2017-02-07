package com.example.showlet.kanahelper;

import android.widget.Toast;

/**
 * Created by showlet on 06/02/17.
 */

public class Chart {

    private Kana[] _kanas;

    public Chart() {

    }

    public Chart(String type) {
        switch(type) {
            case "Hiragana":
                _kanas = new Hiragana[Syllable.getBaslength()];
                for (int i = 0; i < _kanas.length; ++i) {
                    _kanas[i] = new Hiragana(Syllable._basicSyllables[i]);
                }
                break;
            case "Katakana":
                _kanas = new Katakana[Syllable.getBaslength()];
                break;
            default:
                break;
        }


    }

    public Kana[] getKanas() {
        return _kanas;
    }

    public String fillChart() {
        return _kanas.getClass().toString();
    }
}
