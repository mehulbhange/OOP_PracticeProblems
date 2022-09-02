package com.bridgelabz.account;

import java.util.Scanner;

public class Account {
    private int accountBalance;
    Scanner sc = new Scanner(System.in);

    public Account(){
        accountBalance = 100000;
    }

    public void view() {
        System.out.println("Your account balance is " + accountBalance);
    }

    public void credit(int amount) {
        accountBalance += amount;
        System.out.println("Your account balance is " + accountBalance);
    }

    public void withdraw(int amount) {

        if (amount <= 0) {
            System.out.println("Please Enter Valid Amount");
        } else if (amount > accountBalance) {
            System.out.println("Insufficient Fund !!");
        } else {
            accountBalance -= amount;
            System.out.println("\nAvailable Balance is " + accountBalance);
        }
    }
}
