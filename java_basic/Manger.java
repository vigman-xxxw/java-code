package com.edu.polyparameter;

public class Manger extends Employee{
    private double bonus;

    public Manger(String name, double salary, double bonus) {
        super(name, salary);
        this.bonus = bonus;
    }

    public void manage(){
        System.out.println("经理 " + getName() + " is managing");
    }



    //重写获取年薪
    @Override
    public double getAnnual() {
        return super.getAnnual() + bonus;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }
}
