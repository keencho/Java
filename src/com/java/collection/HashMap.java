package com.java.collection;

import java.util.ArrayList;
import java.util.List;

public class HashMap {
    public static void main(String[] args) {
        System.out.println(dummyData());
    }

    private static Object dummyData() {

        List<String> dummyData = new ArrayList<>();

        for (int i = 0; i < 20; i++) {
            dummyData.add("index: " + i);
        }

        return dummyData;
    }
}
