package com.edu.entend_.detail;

public class Grandpa {
    private String name ="yeye";
    private int age = 100;

    public Grandpa(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getInfo(){
        return "String ="+name+"age ="+age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
