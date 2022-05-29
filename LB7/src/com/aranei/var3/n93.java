package com.aranei.var3;

import java.util.Arrays;


public class n93 {
    public void nv93() {
        String[] symbols = "а б в г д е ё ж з и й к л м н о п р с т у ф х ц ч ш щ ъ ы ь э ю".split(" ");
        String text = "ш шшш ю а ав ава б бг";
        String[] words = text.split(" ");
        boolean checkN = false;

        for (int i = 0; i < symbols.length; i++) {
            for (int j = 0; j <  words.length; j++) {
                if (String.valueOf(words[j].charAt(0)).toLowerCase().equals(symbols[i])) {
                    System.out.print(words[j] + " ");
                    checkN = true;
                }
            }
            if (checkN) System.out.println();
            checkN = false;
        }
    }
}
