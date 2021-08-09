package com.java.notepad;

import java.util.Optional;

public class Person {
    private String name;
    private String number;
    private String age;
    private Company company;

    public Person(String name, String number, String age, Company company) {
        this.name = name;
        this.number = number;
        this.age = age;
        this.company = company;
    }

    public String getName() {
        return name;
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

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public Company getCompany() {
        return company;
    }

    public Optional<Company> getOptionalCompany() {
        return Optional.of(company);
    }

    public void setCompany(Company company) {
        this.company = company;
    }
}
