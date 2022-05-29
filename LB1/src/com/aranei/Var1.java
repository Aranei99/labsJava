package com.aranei;


import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class Var1 {
    public String hello = "Hello, ";
    public String userName;
    public String authorName = "Khnykin Danila Nikolaevich";
    public Calendar today = Calendar.getInstance();
    public Calendar labDay = new GregorianCalendar(2022, 02, 14, 12,25);
    public void scanName() {
        Scanner in = new Scanner(System.in);
        userName = in.nextLine();
    }
    public void printHello() {
        System.out.println(hello + userName + "!");
    }

    public void printAuthor() {
        System.out.println("Task time : " + labDay.getTime());
        System.out.println("Author    : " + authorName);
        System.out.println("Task done : " + today.getTime());
    }

}
