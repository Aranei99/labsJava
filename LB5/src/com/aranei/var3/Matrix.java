package com.aranei.var3;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Matrix {
    public void testM() {
        try {
            File file = new File("src/com/aranei/var3/matrixFile.txt");

            ArrayList<ArrayList<Integer>> numbers = new ArrayList<>();
            int size = 0;

            Scanner text = new Scanner(file, "UTF-8");

            while (text.hasNextLine()) {
                String line = text.nextLine().toLowerCase();
                ArrayList<Integer> temp = new ArrayList<>();
                String[] totalNumbers = line.split("[^0-9]+");
                for (String w:totalNumbers) {
                    if (w.equals("")) continue;
                    temp.add(Integer.parseInt(w));

                }
                numbers.add(temp);
                size++;
            }

            System.out.println("Размеры:" + numbers.size() + "x" + numbers.get(0).size());

            for (ArrayList<Integer> number : numbers) {
                for (int j = 0; j < numbers.get(0).size(); j++) {
                    System.out.print(number.get(j) + " ");
                }
                System.out.println();
            }


            System.out.println("Транспонирование:");

            for (int i = 0; i < numbers.get(0).size(); i++) {
                for (ArrayList<Integer> number : numbers) {
                    System.out.print(number.get(i) + " ");
                }
                System.out.println();
            }


            text.close();
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
            e.printStackTrace();
        }
    }
}
