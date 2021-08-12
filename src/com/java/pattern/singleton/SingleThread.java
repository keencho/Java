package com.java.pattern.singleton;

public class SingleThread {
    public static void main(String[] args) {
        System.out.println("같은 값을 보게 된다면 싱글턴 객체가 재사용된 것입니다..!!" + "\n" +
                "다른 값을 보게 된다면 두개의 싱글턴 객체가 생성된 것입니다..!!");

        Singleton singleton = Singleton.getInstance();
        Singleton anotherSingleton = Singleton.getInstance();
    }
}