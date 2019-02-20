package com.java1823.spring.vo;

public class User {
    private int a;
    private String name;


    @Override
    public String toString() {
        return "User{" +
                "a=" + a +
                ", name='" + name + '\'' +
                '}';
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
}
