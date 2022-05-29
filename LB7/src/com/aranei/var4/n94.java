package com.aranei.var4;

import java.util.Arrays;


public class n94 {
    public void nv94() {
        String text = "Привет как дела где телеграмма";
        String[] words = text.split(" +");
        System.out.println(Arrays.toString(words));
        for (int i = 0; i != words.length; i++) {
            String w1 = String.valueOf(words[i].charAt(0));
            words[i] = w1 + words[i].replace(w1, "");
        }
        System.out.println(Arrays.toString(words));
    }
}
