package com.java.notepad;

import java.util.Optional;

public class Department {
    private String name;
    private String number;

    public Department(String name, String number) {
        this.name = name;
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public Optional<String> getOptionalName() {
        return Optional.of(name);
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }
}
