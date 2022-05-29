package com.aranei;

import java.util.Random;
import java.util.concurrent.TimeUnit;

public class n1 {
    static void ThreadsBank() throws InterruptedException {
        Bank bank = new Bank();

        Runnable moneyIn = () -> {
            while (true) {
                System.out.print("Производится заработок денег: ");
                bank.addMoney();
                System.out.println("Счет: " + bank.getMoney());
                try {
                    TimeUnit.SECONDS.sleep(5);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };

        Runnable moneyOut = () -> {
            while (true) {
                System.out.print("Производится расходование средств: ");
                bank.deleteMoney();
                System.out.println("Счет: " + bank.getMoney());
                try {
                    TimeUnit.SECONDS.sleep(3);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };

        Thread shopIn = new Thread(moneyIn);
        Thread shopOut = new Thread(moneyOut);

        shopIn.start();
        TimeUnit.SECONDS.sleep(1);
        shopOut.start();
    }



    private static class Bank {
        private int Money = 0;

        public synchronized void addMoney() {
            Random random = new Random();
            int temp = random.nextInt(1000 - 500) + 500;
            Money += temp;
            System.out.println(temp);
        }


        public synchronized void deleteMoney() {
            Random random = new Random();
            int temp = random.nextInt(800 - 500) + 500;
            if (Money - temp > 0) {
                Money -= temp;
                System.out.println(temp);
            } else {
                System.out.println(temp + " - Казна пуста, Милорд!");
            }
        }
        public synchronized int getMoney() {
            return Money;
        }
    }
}

