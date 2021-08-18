package com.java.pattern.observer;

import sycho.java.pattern.observer.Editor;
import sycho.java.pattern.observer.EmailNotificationListener;
import sycho.java.pattern.observer.LogOpenListener;

public class Client {
    public static void main(String[] args) {
        Editor editor = new Editor();
        editor.events.subscribe("open", new LogOpenListener("D:\\file.txt"));
        editor.events.subscribe("save", new EmailNotificationListener("admin@example.com"));

        try {
            editor.openFile("test.txt");
            editor.saveFile();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}