package com.aranei.var4;

public class n84 {
    public void nv81(){
        String input = "и и иии ф ф аа аа а";
        String[] str = input.split(" +");

        String word = "и";
        int count = 0;
        for (String w : str) {
            if (w.toLowerCase().equals(word.toLowerCase())) count++;
        }
        System.out.println(count);
    }
}
