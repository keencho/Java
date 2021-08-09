package com.java.notepad;


import java.util.Optional;

public class Company {
    private String name;
    private String number;
    private Department department;

    public Company(String name, String number, Department department) {
        this.name = name;
        this.number = number;
        this.department = department;
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

    public Department getDepartment() {
        return department;
    }

    public Optional<Department> getOptionalDepartment() {
        return Optional.of(department);
    }

    public void setDepartment(Department department) {
        this.department = department;
    }
}
