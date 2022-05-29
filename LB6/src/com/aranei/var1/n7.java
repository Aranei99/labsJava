package com.aranei.var1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class n7 {
    public void testV7() {
        try {
            File poem = new File("in/verse.txt");

            ArrayList<String> numbers = new ArrayList<>();

            Scanner text = new Scanner(poem, "UTF-8");

            while (text.hasNextLine()) {
                String line = text.nextLine();
                numbers.add(line);
            }
            numbers.sort(Comparator.naturalOrder());

        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
            e.printStackTrace();
        }
    }
}
