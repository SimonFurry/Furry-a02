/*
 * UCF COP3330 Fall 2021 Assignment 2 Solution
 * Copyright 2021 Simon Furry
 */

import java.util.Scanner;
import java.lang.Math;

public class Solution13 {
    /*
    Create a program that:
    computes the value of an investment compounded over time.
    Asks for starting amount
    number of years to invest
    interest rate
    and the number of periods per year to compound.
     */

    private static final Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("What is the principal amount? ");
        int principal = in.nextInt();
        System.out.print("What is the rate? ");
        double per = in.nextDouble();
        System.out.print("What is the number of years? ");
        int t = in.nextInt();
        System.out.print("What is the number of times the interest is compounded per year? ");
        int n = in.nextInt();

        double r = per / 100;
        double A = principal * Math.pow((1 + (r/n)), (n*t));
        double rounded = (double)Math.round(A * 100.00)/100;

        System.out.print("$" + principal + " invested at " + per + "% for " + t + " compounded " + n + " times per year is $" + rounded + ".");
    }
}
