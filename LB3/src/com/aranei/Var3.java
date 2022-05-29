package com.aranei;

public class Var3 {
    public String firstTask = "8. Создать объект класса Фотоальбом";
    public String secondTask = "9. Создать объект класса Год";

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
