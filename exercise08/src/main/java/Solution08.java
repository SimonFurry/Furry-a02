/*
 * UCF COP3330 Fall 2021 Assignment 2 Solution
 * Copyright 2021 Simon Furry
 */

import java.util.Scanner;
import java.lang.Math;

public class Solution08 {
    /*
    Create a program that:
    Divides pizzas
    prompt for the number of people
    prompt for the number of pizzas
    prompt for the number of slices per pizza
    Ensure that the number of pieces comes out even
    Display the number of pieces of pizza each person should et.
    If there are leftovers, display number of leftover pieces.
     */

    private static final Scanner in = new Scanner(System.in);

    public static void main(String[] args){

        System.out.print("How many people? ");
        int UserPeople = in.nextInt();
        System.out.print("How many pizzas do you have? ");
        int UserPizzas = in.nextInt();
        System.out.print("How many slices per pizza? ");
        int UserSlices = in.nextInt();

        int TotalSlices = UserPizzas * UserSlices;
        int SlicePerPerson = TotalSlices / UserPeople;
        int Remainder = TotalSlices % UserPeople;

        System.out.println(UserPeople + " people with " + UserPizzas + " (" + TotalSlices + ")");
        System.out.println("Each person gets " + SlicePerPerson + " pieces of pizza.");
        System.out.println("There are " + Remainder + " leftover pieces.");
    }

}
