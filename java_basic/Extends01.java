package com.edu.entend_;


public class Extends01 {
    public static void main(String[] args) {
        Pupil pupil = new Pupil();
        pupil.name="小米";
        pupil.age=10;
        pupil.testing();
        pupil.setScore(60);
        pupil.showInfo();

        Graduate graduate = new Graduate();
        graduate.name = "金角";
        graduate.age = 20;
        graduate.testing();
        graduate.setScore(100);
        graduate.showInfo();
    }

}

