package com.aranei.var3;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Locale;
import java.util.Scanner;

public class Pushkin {
    public void testP() {
        try {
            File verse = new File("src/com/aranei/var3/verse.txt");

            HashMap<String, Integer> words = new HashMap<>();
            HashMap<Character, Integer> characters = new HashMap<>();

            Scanner text = new Scanner(verse, "UTF-8");

            while (text.hasNextLine()) {
                String line = text.nextLine().toLowerCase();

                String[] totalWords = line.split("[^а-яА-Я]+");;

                for (String w:totalWords) {
                    if (w.equals("")) continue;

                    int count = words.getOrDefault(w, 0);
                    words.put(w, count + 1);

                    for (Character c:w.toCharArray()) {
                        int c_count = characters.getOrDefault(c, 0);
                        characters.put(c, c_count + 1);
                    }
                }
            }
            System.out.println("Слова:");
            words.forEach((key, value) -> System.out.println(key + " : " + value + ";"));

            System.out.println("Буквы:");
            characters.forEach((key, value) -> System.out.println(key + " " + value + ";"));

            text.close();
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
            e.printStackTrace();
        }
    }
}

