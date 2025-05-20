package com.pluralsight;

public class BankAccount {

    private String name;
    private String accountNumber;
    private double balance;

    public BankAccount(String name, double balance, String accountNumber) {
        this.name = name;
        this.balance = balance;
        this.accountNumber = accountNumber;
    }

    private double getAmount() {
        return 0;
    }

    public void deposit (double amount){
        this.balance = += amount;

    }

    public void withdrawl (double amount){
        this.balance -= amount;

    }
    public double getValue () {
        return balance;
    }

}
