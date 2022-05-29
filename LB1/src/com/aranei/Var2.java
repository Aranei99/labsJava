package com.aranei;

import java.util.Scanner;

public class Var2 {
    public int total;
    int[] myArray;
    public void getArraySize() {
        Scanner in = new Scanner(System.in);
        total = in.nextInt();
        myArray = new int[total];
    }
    public void getArray() {
        Scanner in = new Scanner(System.in);
        for (int i=0; i<total; i++){
            myArray[i] = in.nextInt();
        }
    }
    public void get3or9() {
        for (int i=0; i<total; i++){
            if (myArray[i] % 3 == 0) {
                System.out.print(myArray[i] + " ");
            }
        }
        System.out.println();
    }
    public void get5and7() {
        for (int i=0; i<total; i++){
            if (myArray[i] % 35 == 0) {
                System.out.print(myArray[i] + " ");
            }
        }
        System.out.println();
    }
}
