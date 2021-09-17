/*
 * UCF COP3330 Fall 2021 Assignment 2 Solution
 * Copyright 2021 Simon Furry
 */

import java.util.Scanner;
import java.lang.Math;

public class Solution11 {
    /*
    Write a program that:
    converts currency.
    Converts Euros to USD
    Prompt user for the amount of money in euros they have
    prompt for the current exchange rate of the euro.
    print our the new amount in USD

    c_to / c_frame = rate
    c_to = USD
    c_from = euros
     */
    private static final Scanner in = new Scanner(System.in);

    public static void main(String[] args){
        System.out.print("How many euros are you exchanging? ");
        double c_from = in.nextDouble();

        System.out.print("What is the exchange rate? ");
        double rate = in.nextDouble();

        double c_to = (c_from * rate);
        double rounded = (double)Math.round(c_to * 100.00) / 100;

    System.out.print(c_from + " euros at an exchange rate of " + rate + " is\n" + rounded + " U.S. Dollars");
    }
}
