package com.aranei.var2;

public class n92 {
    public void nv92(){
        String text = "Привет каки делаи игде телеграммаи";
        String[] words = text.split(" ");
        boolean isContain;
        for (int i = 0; i < words[0].length(); i++) {
            isContain = true;
            for (int j = 1; j < words.length; j++) {
                isContain &= words[j].contains(String.valueOf(words[0].charAt(i)));
            }
            if (isContain) System.out.print(words[0].charAt(i) + " ");
        }
    }
}
