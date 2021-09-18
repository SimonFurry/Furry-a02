/*
 * UCF COP3330 Fall 2021 Assignment 2 Solution
 * Copyright 2021 Simon Furry
 */
import java.util.Scanner;
import java.lang.Math;

public class Solution14 {
    /*
    Write a program that:
    computes the tax on an order amount
    prompts for the order amount and the state
    if "WI" total = order + (order*.055)
    else total = order
     */

    private static final Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("What is the order amount? ");
        int order = in.nextInt();
        System.out.print("What is the state? ");
        String state = in.next();

        if(state.equals("WI")){
            double tax = order * 0.055;
            double taxedTotal = order + (tax);
            System.out.print("The subtotal is $" + order + "\nThe tax is $" + tax + "\nThe total is $" + taxedTotal);
        } else {
            System.out.print("The total is $" + order);
        }

    }
}
