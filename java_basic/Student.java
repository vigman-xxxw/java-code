package com.edu.entend_.improve;

public class Student {
    public String name;
    public int age;
    private double score;

    public void setScore(double score) {
        this.score = score;
    }


    public void showInfo(){
        System.out.println("名字"+ name+"年龄"+age+"成绩"+score);
    }
}

