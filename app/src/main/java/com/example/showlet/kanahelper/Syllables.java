package com.example.showlet.kanahelper;

import  java.util.Random;
/**
 * Created by showlet on 06/02/17.
 */

public final class Syllables {

    public final static String[] basicSyllables =
            {"a", "i", "u", "e", "o",
                   "ka", "ki", "ku", "ke", "ko",
                   "sa", "shi", "su", "se", "so",
                   "ta", "chi", "tsu", "te", "to",
                   "na", "ni", "nu", "ne", "no",
                   "ha", "hi", "hu", "he", "ho",
                   "ma", "mi", "mu", "me",  "mo",
                   "ra", "ri", "ru", "re", "ro",
                   "wa", "wo", "ya", "yu", "yo",
                   "n"};

    public final static String[] _Dakuten =
            {"pa", "pi", "pu", "pe", "po",
                    "ba", "bi", "bu", "be", "bo",
                    "da", "dzi", "dzu", "de", "do",
                    "za", "ji", "zu", "ze", "zo",
                    "ga", "gi", "gu", "ge", "go"};


    public static String getRandBasSyl() {
        int rand = new Random().nextInt(basicSyllables.length);
        return basicSyllables[rand];
    }

    public static int getBaslength() {
        return basicSyllables.length;
    }
}
