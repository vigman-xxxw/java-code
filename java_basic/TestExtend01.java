package com.edu.entend_.improve;

public class TestExtend01 {
    public static void main(String[] args) {
        Pupil pupil = new Pupil();
        pupil.name = "xxxx";
        pupil.age = 11;
        pupil.testing();
        pupil.setScore(80);
        pupil.showInfo();

        System.out.println("=======");
        Graduate graduate = new Graduate();
        graduate.name = "yyyy";
        graduate.age = 21;
        graduate.testing();
        graduate.setScore(22);
        graduate.showInfo();


    }
}
