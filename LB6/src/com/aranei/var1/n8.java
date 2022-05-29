package com.aranei.var1;


import java.util.*;

public class n8 {
    public void testV8() {
        String str = "(){}[]{([])}";
        Stack<Character> stack;
        stack = new Stack<>();
        int flag = 0;
        char c;
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            c = str.charAt(i);
            count++;

            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            }

            if (c == ')' || c == '}' || c == ']') {
                if (stack.isEmpty()) {
                    System.out.println(count);
                    flag = 1;
                                    }
                char top = stack.peek();
                if ((c == ')' && top == '(') || (c == '}' && top == '{') || (c == ']' && top == '[')) {
                    stack.pop();
                } else {
                    System.out.println(count);
                    flag = 1;
                }
            }
        }
        if(flag == 0) {
            System.out.println("Success");
        }
    }
}
