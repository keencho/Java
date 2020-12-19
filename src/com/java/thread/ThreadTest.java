package com.java.thread;

import java.util.Date;
import java.util.concurrent.ForkJoinPool;

public class ThreadTest {
    public static void main(String[] args) {
        ForkJoinPool t = new ForkJoinPool(10);
        t.execute(() -> test());
        System.out.println("today is rest day 4 and tomorrow will studyyyyyy!! ");
    }

    private static void test() {
        System.out.println(new Date());
    }
}
