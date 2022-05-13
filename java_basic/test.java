package com.edu.duotai;

import com.edu.polyparameter.Manger;

public class test {
    public static void main(String[] args) {
        Worker tom = new Worker("tom", 2000);
        Manager milan = new Manager("milan", 2000, 200000);
        test test = new test();
        test.getEmpAnnual(tom);
        test.getEmpAnnual(milan);
        test.testWork(tom);
        test.testWork(milan);
        "hello".equals("abc");

        System.out.println(milan );
        milan = null;
        System.gc();


    }

    public void getEmpAnnual(Employee e){
        System.out.println(e.getAnnual());
    }

    public void testWork(Employee e){
        if(e instanceof Worker){
            ((Worker) e).getWork();
        }else if(e instanceof Manager){
            ((Manager) e).getManage();
        }else{
            System.out.println("类型有误");
        }
    }
}
