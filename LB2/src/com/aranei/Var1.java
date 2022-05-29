package com.aranei;


import com.sun.org.apache.xpath.internal.objects.XString;
import org.jetbrains.annotations.NotNull;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Objects;
import java.util.Scanner;

public class Var1 {
    public String firstTask = "Ввести n слов с консоли. Среди слов, состоящих только из цифр, найти слово-палиндром. Если таких слов больше одного, найти второе из них";
    public String secondTask = "Используя оператор switch, написать программу, которая выводит на экран сообщения о принадлежности некоторого значения k интервалам (-10k, 0], (0, 5], (5, 10], (10, 10k]";

    public int polNum = 0;
    public String pol;
    public int total;
    String[] myArray;

    public void getTask(int task) {
        switch (task) {
            case 0:
                System.out.println(firstTask);
                break;
            case 1:
                System.out.println(secondTask);
                break;
        }
    }

    public void getArraySize() {
        System.out.println("Array size:");
        Scanner in = new Scanner(System.in);
        total = in.nextInt();
        myArray = new String[total];
    }

    public void getArray() {
        System.out.println("Array:");
        Scanner in = new Scanner(System.in);
        for (int i=0; i<total; i++){
            myArray[i] = in.next();
            if (polNum < 2) {
                if (checkDigits(myArray[i])){
                    if (checkPalindrom(myArray[i])) {
                        pol = myArray[i];
                        polNum++;
                    }
                }
            }
        }
        System.out.println(pol);
    }

    public boolean checkDigits(@NotNull String someString) {
        return someString.chars().allMatch( Character::isDigit );
    }

    public static boolean checkPalindrom(String str) {
        return Objects.equals(str, new StringBuilder(str).reverse().toString());
    }

    public int k;

    public void getK() {
        System.out.println("Number:");
        Scanner in = new Scanner(System.in);
        k = in.nextInt();
    }

    public void checkInterval() {
        switch (k < 1 ? 0 : 1) {
            case 0:
                switch (k < -10_000 ? 0 : 1) {
                    case 0:
                        System.out.println(k + " is out of range");
                        break;
                    case 1:
                        System.out.println(k + " is in range (-10k, 0]");
                        break;
                }
                break;
            case 1:
                switch (k < 6 ? 0 : 1) {
                    case 0:
                        System.out.println(k + " is in range (0, 5]");
                        break;
                    case 1:
                        switch (k < 11 ? 0 : 1) {
                            case 0:
                                System.out.println(k + " is in range (5, 10]");
                                break;
                            case 1:
                                switch (k < 10_000 ? 0 : 1) {
                                    case 0:
                                        System.out.println(k + " is in range (10, 10k]");
                                        break;
                                    case 1:
                                        System.out.println(k + " is out of range");
                                        break;
                                }
                        }
                }
        }
    }

}
