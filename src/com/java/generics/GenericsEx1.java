package com.java.generics;

import java.util.ArrayList;

class Fruit implements Eatable {
    public String toString() { return "Fruit"; }
}
class Apple extends Fruit   { public String toString() { return "Apple"; }}
class Grape extends Fruit   { public String toString() { return "Grape"; }}
class Toy                   { public String toString() { return "Toy"; }}

interface Eatable{}

public class GenericsEx1 {
    public static void main(String[] args) {
        FruitBox<Fruit> fruitBox = new FruitBox<Fruit>();
        FruitBox<Apple> appleBox = new FruitBox<Apple>();
//        FruitBox<Toy> toyBox = new FruitBox<Toy>();
//        Box<Grape> grapeBox = new Box<Apple>();

        fruitBox.add(new Fruit());
        fruitBox.add(new Apple());

        appleBox.add(new Apple());
//        appleBox.add(new Toy());

//        toyBox.add(new Toy());
//        toyBox.add(new Fruit());

        System.out.println(fruitBox);
        System.out.println(appleBox);
//        System.out.println(toyBox);
    }
}

class FruitBox<T extends Fruit & Eatable> extends Box<T> {}

class Box<T> {
    ArrayList<T> list = new ArrayList<>();

    void add(T item) {
        list.add(item);
    }

    T get(int i) {
        return list.get(i);
    }

    int size() {
        return list.size();
    }

    public String toString() {
        return list.toString();
    }
}
