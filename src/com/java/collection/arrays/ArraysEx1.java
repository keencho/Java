package com.java.collection.arrays;

import java.util.Arrays;
import java.util.List;

public class ArraysEx1 {
    public static void main(String[] args) {
        List list = Arrays.asList(1, 2, 3, 4, 5);

        // 실행시 UnsupportedOpertaionExcption 에러 -> asList로 반환한 List는 크기를 변경할수 없다.
//        list.add(6);
//        list.remove(0);
    }
}
