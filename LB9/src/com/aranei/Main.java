package com.aranei;

import java.util.Arrays;
import java.util.Collection;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        n9v1n4();
        n9v1n5();
        n9v2n4();
        n9v2n5();
    }

    public static void n9v1n4() {
        Collection<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        System.out.println("Дано: " + Arrays.toString(numbers.toArray()) +
                            "\nНечетные: " + numbers.stream().filter((e) -> e % 2 != 0).collect(Collectors.toList()) +
                            "\nЧетные:   " + numbers.stream().filter((e) -> e % 2 == 0).collect(Collectors.toList()));
            }

    public static void n9v1n5() {
        Collection<String> strings = Arrays.asList("a", "b", "aa", "bb", "aa", "b", "aAa", "B", "aaa");
        System.out.println("\nДано: " + Arrays.toString(strings.toArray()) +
                            "\nУникальные значения: " + strings.stream().distinct().collect(Collectors.toList()));
    }

    public static void n9v2n4() {
        Collection<String> strings = Arrays.asList("aa", "ab", "Aa", "AC", "tHx", "thQ");
        System.out.println("\nДано: " + Arrays.toString(strings.toArray()) +
                            "\nMAP: " + strings.stream().collect(Collectors.toMap(e -> e.charAt(0),
                                                                                e -> e.charAt(1), (e1, e2) -> e2)));
    }

    public static void n9v2n5() {
        Collection<String> strings = Arrays.asList("aa", "ab", "Aa", "AC", "tHx", "thQ");
        System.out.println("\nДано: " + Arrays.toString(strings.toArray()) +
                                    "\nMAP: " + strings.stream().collect(Collectors.groupingBy(e -> e.charAt(0))));
    }

}