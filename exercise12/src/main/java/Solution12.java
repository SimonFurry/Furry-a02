/*
 * UCF COP3330 Fall 2021 Assignment 2 Solution
 * Copyright 2021 Simon Furry
 */

import java.util.Scanner;

public class Solution12 {
    /*
    Create a program that:
    computes simple interest
    prompt for principal amount
    prompts for the annual rate of interest (r)
    prompts for the number of years (t)
    and display the amount accrued (principal + interest)
     */

    private static final Scanner in = new Scanner(System.in);

    public static void main(String[] args){
        System.out.print("Enter the principal: ");
        int principal = in.nextInt();
        System.out.print("Enter the rate of interest: ");
        double per = in.nextDouble();
        System.out.print("Enter the number of years: ");
        int t = in.nextInt();
        double r = per / 100;

        double simpleInterest = (principal * (1 + (t * r)));

        System.out.print("After " + t + " years at " + per + "%, the investment will be worth $" + simpleInterest);



    }
}
