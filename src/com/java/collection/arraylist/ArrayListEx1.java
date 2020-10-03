package com.java.collection.arraylist;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListEx1 {

    public static void main(String[] args) {
        ArrayList l1 = new ArrayList();

        l1.add(1);
        l1.add(5);
        l1.add(4);
        l1.add(3);
        l1.add(2);

        System.out.println(l1);

        Collections.sort(l1);

        System.out.println(l1);
    }
}
