package com.java.pattern.iterator;

public class Client {
    public static void main(String[] args) {
        String[] stringArray = {"월", "화", "수", "목", "금", "토", "일"};

        for (int i = 0; i < stringArray.length; i++) {
            System.out.println(stringArray[i]);
        }
    }
}
