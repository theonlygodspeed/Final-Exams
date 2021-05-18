package com.company;

import javax.swing.JOptionPane;

public class AccountUnitTest
{
    public static void main(String[] args)
    {
        Checking aCheckingAccount = new Checking(1);
        Savings aSavingsAccount = new Savings(2, 1.6);

        JOptionPane.showMessageDialog(null, aCheckingAccount.getAccountInfo());
        JOptionPane.showMessageDialog(null, aSavingsAccount.getAccountInfo());
    }
}