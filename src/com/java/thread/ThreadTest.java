package com.java.thread;

import java.util.Date;
import java.util.concurrent.ForkJoinPool;

public class ThreadTest {
    public static void main(String[] args) {
        ForkJoinPool t = new ForkJoinPool(10);
        t.execute(() -> test());
    }

    private static void test() {
        System.out.println(new Date());
    }
}
