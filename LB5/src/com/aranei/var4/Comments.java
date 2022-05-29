package com.aranei.var4;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Comments {
    public void testC() {
        try {

            // Получаем путь файла
            Path inputPath = Paths.get("in/MainT.java");

            // Читаем все строки файла с кодом программы
            byte[] content = Files.readAllBytes(inputPath);
            String program = new String(content);

            // Обрабатываем строки - удаляем комментарии
            String out = program.trim()
                    .replaceAll("/\\*([^*]|[\\r\\n" +
                            "]|(\\*+([^*/]|[\\r\\n" +
                            "])))*\\*+/", "") // Многострочные
                    .replaceAll("//(.*)]*", ""); // Однострочные

            // Создаем новую директорию, если не существует
            Files.createDirectories(Paths.get("result"));

            // Задаем путь для нового файла для вывода
            Path outPath = Paths.get("result/CommentsResult.java");

            // Записываем в новый файл получившийся код
            Files.write(outPath, out.getBytes());
            System.out.println("Файл done");
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
            e.printStackTrace();
        } catch (IOException e) {
            System.out.println("Произошла ошибка I/O");
            e.printStackTrace();
        }
    }
}
