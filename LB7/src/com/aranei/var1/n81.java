package com.aranei.var1;

public class n81 {
    public void nv81(){
        String line = "1234HHHH89__++hjkhj    jkg    132    pp";
        System.out.println(line);
        System.out.println(deleteLetters(line));
    }
    public static String deleteLetters(String input) {
        return input.replaceAll("[^a-zA-Z ]", " ").replaceAll("\\s+", " ").trim();
    }
}
