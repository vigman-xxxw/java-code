package com.edu.duotai;

public class Worker extends Employee{
    public Worker(String name, double salary) {
        super(name, salary);
    }

    @Override
    public double getAnnual() {
        return super.getAnnual();
    }



    public void getWork(){
        System.out.println("普通员工 "+getName()+" is working");
    }
}
