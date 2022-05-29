package com.aranei;

public class Var4 {
    public String firstTask = "8. Система Автобаза";
    public String secondTask = "9. Система Интернет-магазин";

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
}
