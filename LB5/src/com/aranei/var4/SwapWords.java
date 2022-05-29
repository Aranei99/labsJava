package com.aranei.var4;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class SwapWords {
    public void testS() {
        try {
            File poem = new File("in/verse.txt");

            ArrayList<ArrayList<String>> numbers = new ArrayList<>();
            int size = 0;

            Scanner text = new Scanner(poem, "UTF-8");

            while (text.hasNextLine()) {
                String line = text.nextLine();
                ArrayList<String> temp = new ArrayList<>();
                String[] totalNumbers = line.split("[^а-яА-Я]+");
                for (String w:totalNumbers) {
                    if (w.equals("")) continue;
                    temp.add(w);

                }
                numbers.add(temp);
                size++;
            }

            for (int i = 0; i < numbers.size(); i++) {
                System.out.print(numbers.get(i).get(numbers.get(i).size()-1) + " ");
                for (int j = 1; j+1 < numbers.get(i).size(); j++) {
                    System.out.print(numbers.get(i).get(j) + " ");
                }

                     System.out.print(numbers.get(i).get(0) + " ");
                System.out.println();
            }

            text.close();
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
            e.printStackTrace();
        }
    }
}
