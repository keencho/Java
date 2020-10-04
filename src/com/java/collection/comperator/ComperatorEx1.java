package com.java.collection.comperator;

import java.util.Arrays;
import java.util.Comparator;

public class ComperatorEx1 {
    public static void main(String[] args) {
        String[] strArr = {"monkey", "Dog", "rat", "cat"};

        System.out.println(Arrays.toString(strArr));

        Arrays.sort(strArr);
        System.out.println(Arrays.toString(strArr));

        Arrays.sort(strArr, String.CASE_INSENSITIVE_ORDER);
        System.out.println(Arrays.toString(strArr));

        Arrays.sort(strArr, new Descending());
        System.out.println(Arrays.toString(strArr));

        System.out.println(Math.random() * 45);
    }
}

class Descending implements Comparator {

    @Override
    public int compare(Object o1, Object o2) {
        if (o1 instanceof Comparable && o2 instanceof Comparable) {
            Comparable c1 = (Comparable)o1;
            Comparable c2 = (Comparable)o2;

            // 기존 결과에 -1을 곱함으로써 역순으로 출력한다.
            return c1.compareTo(c2) * -1;
        }

        return -1;
    }
}
