package com.aranei.var1;

import java.util.Arrays;


public class n91 {
    public void nv91(){
        String text = "Привет как дела где телеграмма";
        String[] symbols = "б в г д ж з й к л м н п р с т ф х ц ч ш щ".split(" ");
        int number = 5;
        String[] textArray = text.split(" ");
        System.out.println(text);
        for (int i = 0; i!=textArray.length; i++){
            String symbol = String.valueOf(textArray[i].charAt(0)).toLowerCase();
            if (textArray[i].length() == number && Arrays.asList(symbols).contains(symbol)){
                text = text.replace(textArray[i], "");
            }
        }
        System.out.println(text.replaceAll("\\s+", " ").trim());
    }
}
