package com.java.thread;

import java.util.Date;

public class MyThread implements Runnable{
    @Override
    public void run() {
        for (int i = 0 ; i < 5; i ++) {
            System.out.println(Thread.currentThread().getName() + i);
            System.out.println("christmas...");
        }
    }
}

class Main {
    public static void main(String[] args) {
        Runnable myThread = new MyThread();

        Thread t1 = new Thread(myThread);
        
        // t1.start(); IllegalThreadStateException - 한번 종료된 쓰레드는 재시작 불가. 만약 하고자 한다면 새로운 쓰레드를 생성해야함
    }
}
