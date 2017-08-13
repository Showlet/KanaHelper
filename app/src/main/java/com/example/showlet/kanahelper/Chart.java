package com.example.showlet.kanahelper;

/**
 * Created by showlet on 06/02/17.
 */

public class Chart {

    private Kana[] _kanas;
    private int[] _ids;
    private String[] _vals;

    public Kana[] getKanas() {
        return _kanas;
    }
    public int[] getIds() { return _ids;}
    public String[] getValues() { return _vals;}

    public Chart() { }

    public Chart(String type) {
        int size = Syllables.getBaslength();
        _ids = new int[size];
        _vals = new String[size];

        switch(type) {
            case "Hiragana":
                // Load le hiragana et ses symboles et retourne un tableau de Kana
                _kanas = KanaLoader.loadHiraganafull();

                // Sépare les deux informations
                for (int i = 0; i < _kanas.length; ++i) {
                    _ids[i] = _kanas[i].getID();
                    _vals[i] = _kanas[i].getSyllable();
                }
                break;

            case "Katakana":
              //  _kanas = new Katakana[Syllables.getBaslength()];
                _kanas = KanaLoader.loadKatakanafull();

                // Sépare les deux informations
                for (int i = 0; i < _kanas.length; ++i) {
                    _ids[i] = _kanas[i].getID();
                    _vals[i] = _kanas[i].getSyllable();
                }
                break;
            default:
                break;
        }
    }

}
