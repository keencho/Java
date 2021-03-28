package com.java.stream;

import java.util.Arrays;
import java.util.List;

public class StreamEx {

    public static void init() {
        int[] arr = new int[5];
        Arrays.setAll(arr, i -> (int) ((Math.random() * 5) + 1));

        Arrays.stream(arr).forEach(System.out::println);
    }

    public static void test() {
        List<String> test = Arrays.asList("a", "b", "c", "d");

        test.forEach(System.out::println);
    }

    public static void main(String[] args) {
        init();
    }
}
