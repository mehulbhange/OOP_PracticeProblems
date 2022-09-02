package com.bridgelabz.stockAccount;

import java.util.Scanner;

public class StockPortfolio {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stock stock = new Stock();
        System.out.println("Enter the total number of Stocks");
        int num = sc.nextInt();
        for (int i = 1; i <= num; i++) {
            stock.addShare();
        }
        System.out.println("\nTotal Value is " + stock.getTotalPrice());
    }
}
