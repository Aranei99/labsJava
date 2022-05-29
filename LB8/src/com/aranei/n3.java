package com.aranei;

import java.util.Random;
import java.util.concurrent.TimeUnit;

public class n3 {
    static void ThreadsStore() throws InterruptedException {
        Store store = new Store();

        Runnable productsIn = () -> {
            while (true) {
                System.out.print("Производится поставка товаров: ");
                store.addProducts();
                System.out.println("Склад: " + store.getProducts());
                try {
                    TimeUnit.SECONDS.sleep(5);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };

        Runnable productsOut = () -> {
            while (true) {
                System.out.print("Производится покупка товаров: ");
                store.deleteProducts();
                System.out.println("Склад: " + store.getProducts());
                try {
                    TimeUnit.SECONDS.sleep(3);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };

        Thread shopIn = new Thread(productsIn);
        Thread shopOut = new Thread(productsOut);

        shopIn.start();
        TimeUnit.SECONDS.sleep(1);
        shopOut.start();
    }



    private static class Store {
        private int Products = 0;

        public synchronized void addProducts() {
            Random random = new Random();
            int temp = random.nextInt(10 - 5) + 5;
            Products += temp;
            System.out.println(temp);
        }


        public synchronized void deleteProducts() {
            Random random = new Random();
            int temp = random.nextInt(8 - 5) + 5;
            if (Products - temp > 0) {
                Products -= temp;
                System.out.println(temp);
            } else {
                System.out.println(temp + " - Полки пусты, Милорд!");
            }
        }
        public synchronized int getProducts() {
            return Products;
        }
    }
}
