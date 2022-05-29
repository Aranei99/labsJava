package com.aranei.var3;

public class n83 {
    public void nv83(){
        String test = "123123123";
        String coded = EncodeDecodeString(test);
        String decoded = EncodeDecodeString(coded);
        System.out.println(test);
        System.out.println(coded);
        System.out.println(decoded);
    }
    public static String EncodeDecodeString(String input) {
        int len = input.length();
        StringBuilder result = new StringBuilder();

        int position;
        for(int i=0; i<3; i++){
            position = i;
            while (position < input.length()) {
                result.append(input.charAt(position));
                position += 3;
            }
        }
        return result.toString();
    }

}
