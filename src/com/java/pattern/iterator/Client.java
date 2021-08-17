package com.java.pattern.iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Client {
    public static void main(String[] args) {
//        UserRepository userRepository = new UserRepository(getTestUserList());
//
//        for (Iterator it = userRepository.getIterator(); it.hasNext();) {
//            System.out.println("===========================================");
//            User user = (User) it.next();
//            System.out.println(user.getName());
//            System.out.println(user.getAge());
//            System.out.println(user.getLoginId());
//            System.out.println("===========================================");
//        }

        List<User> userList = getTestUserList();

        for (Iterator<User> iterator = userList.iterator(); iterator.hasNext();) {
            User user = iterator.next();

            if ("gildong".equals(user.getLoginId())) {
                iterator.remove();
            }
        }

        for (User user : userList) {
            if ("gildong".equals(user.getLoginId())) {
                userList.remove(user);
            }
        }

        userList.forEach(user -> System.out.println(user.getLoginId()));

    }

    private static List<User> getTestUserList() {
        return new ArrayList<>() {{
            add(new User("홍길동", 20, "gildong"));
            add(new User("이순신", 50, "sunshin"));
            add(new User("김첨지", 43, "chumji"));
            add(new User("신사임당", 20, "imgentleman"));
        }};
    }

    private static List<String> getTestString() {
        return new ArrayList<>() {{
            add("A");
            add("B");
            add("C");
            add("D");
            add("E");
        }};
    }
}
