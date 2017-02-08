package com.example.showlet.kanahelper;

import java.lang.reflect.Field;

/**
 * Created by showlet on 07/02/17.
 */

public final class KanaLoader {

    protected static Hiragana[] loadHiraganafull() {

        // fetch les ressources
        // Algorithme qui remplis un array de tous les kanas
        // du type désiré
        int nbSymbol = Syllables.getBaslength();
        int index = 0;
        int[] symbolRess = new int[nbSymbol];   // Array pour stoquer les images de kana
        Field[] ID_Fields = R.drawable.class.getFields();   // Array de toutes les ressources drawable
        for (int i = 1; i < ID_Fields.length; i++) {
            try {
                if (ID_Fields[i].toString().contains("hiragana")) {
                    symbolRess[index] = (int) ID_Fields[i].getInt(null);
                    ++index;
                }
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
        }

        Hiragana[] arr = new Hiragana[nbSymbol];
        for (int i = 0; i < symbolRess.length; ++i){
            arr[i] = new Hiragana(Syllables.basicSyllables[i], symbolRess[i]);
        }

        return arr;
    }
}

