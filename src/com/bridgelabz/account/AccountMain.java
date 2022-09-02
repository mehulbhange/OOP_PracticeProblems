package com.bridgelabz.account;

import java.util.Scanner;

public class AccountMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Account account = new Account();

        while (true) {
            System.out.println("\nPlease Select what you want to do");
            System.out.println("1.show current balance");
            System.out.println("2. add Balance");
            System.out.println("3. Withdraw ");

            int press = sc.nextInt();

            switch (press) {
                case 1:
                    account.view();
                    break;
                case 2:
                    System.out.println("\nPlease Enter the Amount to add : ");
                    account.credit(sc.nextInt());
                    break;
                case 3:
                    System.out.println("Enter the amount for withdraw");
                    int input = sc.nextInt();
                    account.withdraw(input);
                    break;
            }
        }
    }
}
