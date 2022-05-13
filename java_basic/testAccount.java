package com.encap;

public class testAccount {
    public static void main(String[] args) {
        Account account = new Account();
        account.setName("javcsad");
        account.setBalance(20000);
        account.setPwd("123123");

        account.showInfo();
    }
}
