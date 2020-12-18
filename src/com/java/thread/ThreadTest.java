package com.java.thread;

import java.util.Date;
import java.util.concurrent.ForkJoinPool;

public class ThreadTest {
    public static void main(String[] args) {
        ForkJoinPool t = new ForkJoinPool(10);
        t.execute(() -> test());
        System.out.println("today is rest day 3 and tomorrow will be a rest day toooooo ");
    }

    private static void test() {
        System.out.println(new Date());
    }
}
