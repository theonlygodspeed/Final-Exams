package com.company;

public abstract class Account
{
    protected int accountNumber;
    protected double balance;

    public Account(int acctNum)
    {
        accountNumber = acctNum;
        setBalance(0);
    }

    public void setBalance(double b)
    {
        balance = b;
    }

    public abstract int getAccountNumber();
    public abstract double getBalance();

    // Added this because it makes sense with my current application design
    public abstract String getAccountInfo();
}