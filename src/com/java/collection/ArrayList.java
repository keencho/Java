package com.java.collection;

import java.util.List;

public class ArrayList {
    public static void main(String[] args) {
        List<String> test = new java.util.ArrayList<>();

        for (int i = 0; i < 10; i ++) {
            test.add("index: " + i);
        }

        test.stream().forEach(e -> System.out.println(e));
    }
}
