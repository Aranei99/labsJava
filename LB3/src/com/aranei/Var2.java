package com.aranei;

import com.sun.org.apache.xpath.internal.objects.XString;

import java.util.Objects;

public class Var2 {
    public String firstTask = "8. Создать массив объектов Car";
    public String secondTask = "9. Создать массив объектов Product";

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

    public Car[] carAr;

    public void carArray(int num) {
        for (int i=0; i < num; i++){
            carAr[i].setId(1);
            carAr[i].setMark("Toyota");
            carAr[i].setModel("Rav4");
            carAr[i].setYear(1992);
            carAr[i].setColor("Red");
            carAr[i].setPrice(700000);
            carAr[i].setRegNumber("k166nn66");
        }
    }

    public void showCarA(String mark){
        for (int i=0; i < carAr.length; i++){
            if (Objects.equals(carAr[i].getMark(), mark))
                System.out.println(carAr[i].toString());
        }
    }

    public void showCarB(String model, int time){
        for (int i=0; i < carAr.length; i++){
            if (Objects.equals(carAr[i].getModel(), model) && (2022 - carAr[i].getYear() > time))
                System.out.println(carAr[i].toString());
        }
    }

    public void showCarC(int year, int price){
        for (int i=0; i < carAr.length; i++){
            if ((carAr[i].getYear() == year) && (carAr[i].getPrice() > price))
                System.out.println(carAr[i].toString());
        }
    }


    public Product[] productAr;

    public void productArray(int num) {
        for (int i=0; i < num; i++){
            productAr[i].setId(2);
            productAr[i].setName("Book");
            productAr[i].setUPC("036000291452");
            productAr[i].setManufacturer("DomKnigi");
            productAr[i].setPrice(1300);
            productAr[i].setShelfLife(72);
            productAr[i].setAmount(30);
        }
    }

    public void showProductA(String name){
        for (int i=0; i < productAr.length; i++){
            if (Objects.equals(productAr[i].getName(), name))
                System.out.println(productAr[i].toString());
        }
    }

    public void showProductB(String name, int price){
        for (int i=0; i < productAr.length; i++){
            if (Objects.equals(productAr[i].getName(), name) && (productAr[i].getPrice() <= price))
                System.out.println(productAr[i].toString());
        }
    }

    public void showProductC(int shelfLife){
        for (int i=0; i < productAr.length; i++){
            if (productAr[i].getShelfLife() > shelfLife)
                System.out.println(productAr[i].toString());
        }
    }

}
