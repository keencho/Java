package com.java.collection.iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class IteratorEx1 {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add(1);
        list.add(2);
        list.add(3);

        Iterator iterator = list.iterator();

        while (iterator.hasNext())
            System.out.println(iterator.next());

        ListIterator li1 = list.listIterator();

        while (li1.hasNext())
            System.out.print(li1.next());

        System.out.println();

        while (li1.hasPrevious())
            System.out.print(li1.previous());
    }
}
