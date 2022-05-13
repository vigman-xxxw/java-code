package com.encap;

import com.sun.javaws.IconUtil;
import jdk.nashorn.internal.ir.CallNode;

import java.security.spec.RSAOtherPrimeInfo;

public class encap01 {
    public static void main(String[] args) {
        Person person = new Person();
//        person.setName("jack66adahas");
//        person.setAge(3220);
//        person.setSalary(10000);
//        System.out.println(person.info());

        Person smith = new Person("smith", 1000, 2200);
        System.out.println(smith.info());

    }
}


class Person {
    public String name;
    private int age;
    private double salary;
    //手写ste  get太慢   alt + insert


    public Person() {
    }

    public Person(String name, int age, double salary) {
        setName(name);
        setAge(age);
        setSalary(salary);


    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        //加入对数据的校验
        if (name.length() >= 2 && name.length() <= 6) {
            this.name = name;
        } else {
            System.out.println("名字长度不对，需要2到6个字符 默认名字");
            this.name = "无名人";
        }
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age >= 1 && age <= 120) {
            this.age = age;
        } else {
            System.out.println("设置的年龄不正确需要在1-120 默认给18");
            this.age = 18;
        }
    }

    public double getSalary() {
        //增加权限 加个密码
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String info() {
        return name + age + salary;
    }
}