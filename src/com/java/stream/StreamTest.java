package com.java.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamTest {

    public static void main(String[] args) {
        List<String> test = returnStringList();

        test.stream().forEach(e -> System.out.println(e));

        printLine();

        test.stream()
                .filter(e -> !e.equals("test"))
                .collect(Collectors.toList())
                .stream()
                .forEach(e -> System.out.println(e));

        printLine();

        System.out.println(test.stream().anyMatch(e -> e.equals("this")));
        System.out.println(test.stream().anyMatch(e -> e.equals("thi")));
    }

    private static List<String> returnStringList() {
        return new ArrayList<>(Arrays.asList("this", "is", "test"));
    }

    private static void printLine() {
        System.out.println("----------------------------");
    }
}
