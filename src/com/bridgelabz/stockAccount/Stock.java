package com.bridgelabz.stockAccount;

import java.util.Scanner;

public class Stock {

    private int noOfStocks;
    private String shareName;
    private int noOfShare;
    private double sharePrice;
    static double stockPrice;
    static double totalPrice;

    public double getTotalPrice(){
        return totalPrice;
    }

    public void addShare() {
        Scanner input = new Scanner(System.in);
        System.out.println("\nName of Share");
        shareName = input.next();
        System.out.println("number of Share");
        noOfShare = input.nextInt();
        System.out.println("price for Share");
        sharePrice = input.nextDouble();
        stockPrice = noOfShare * sharePrice;
        totalPrice += stockPrice;
        System.out.println("\nValue of Stock " + shareName + " is = " + stockPrice);

    }

}
