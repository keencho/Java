package com.java.collection.hashmap;

import java.util.HashMap;
import java.util.Scanner;

public class HashMapEx1 {
    public static void main(String[] args) {
        HashMap map = new HashMap();

        map.put("sycho", "1234");
        map.put("wycho", "2345");

        Scanner s  = new Scanner(System.in);

        while (true) {
            System.out.println("--------------------");
            System.out.print("id: ");
            String id  = s.nextLine().trim();

            System.out.print("pw: ");
            String pw = s.nextLine().trim();

            System.out.println("---------------");

            if (!map.containsKey(id)) {
                System.out.println("존재하지 않는 id입니다.");
                continue;
            } else {
                if (map.get(id).equals(pw)) {
                    System.out.println("로그인 성공 - id: " + id + " / pw: " + pw);
                    break;
                } else {
                    System.out.println("비밀번호가 일치하지 않습니다.");
                }
            }
        }
    }
}
