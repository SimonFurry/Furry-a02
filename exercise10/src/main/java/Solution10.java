/*
 * UCF COP3330 Fall 2021 Assignment 2 Solution
 * Copyright 2021 Simon Furry
 */

import java.util.Scanner;

public class Solution10 {
    /*
    Create a program that:
    Prompts for the prices and quantities of three items.
    Calculate the subtotal of the items.
    Then calculate the tax using a tax rate of 5.5%
    Prints out the line items with the quantity, total
    Print out the subtotal, tax amount, and total.
     */

    private static final Scanner in = new Scanner(System.in);

    static void main(String[] args){
        System.out.print("Enter the price of item 1: ");
        int price1 = in.nextInt();
        System.out.print("Enter the quantity of item 1: ");
        int quantity1 = in.nextInt();
        int math1 = price1 * quantity1;

        System.out.print("Enter the price of item 2: ");
        int price2 = in.nextInt();
        System.out.print("Enter the quantity of item 2: ");
        int quantity2 = in.nextInt();
        int math2 = price2 * quantity2;

        System.out.print("Enter the price of item 3: ");
        int price3 = in.nextInt();
        System.out.print("Enter the quantity of item 3: ");
        int quantity3 = in.nextInt();
        int math3 = price3 * quantity3;

        double subTotal = math1 + math2 + math3;
        double tax = subTotal * .055;
        double total = subTotal + tax;

        System.out.println("Subtotal: $" + subTotal);
        System.out.println("Tax: $" + tax);
        System.out.println("Total: $" + total);
    }
}
