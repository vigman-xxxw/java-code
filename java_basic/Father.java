package com.edu.entend_.detail;

public class Father extends Grandpa{
    private int sal = 10000;

    public Father(String name, int age, int sal) {
        super(name, age);
        this.sal = sal;
    }

    public String printInfo(){
        return getInfo()+" sal = "+sal;
    }
    public int getSal() {
        return sal;
    }

    public void setSal(int sal) {
        this.sal = sal;
    }
}
