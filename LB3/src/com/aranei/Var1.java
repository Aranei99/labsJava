package com.aranei;

public class Var1 {
    public String firstTask = "8. Определить класс Комплекс";
    public String secondTask = "9. Определить класс Квадратное уравнение";

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
