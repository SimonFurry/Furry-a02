/*
 * UCF COP3330 Fall 2021 Assignment 2 Solution
 * Copyright 2021 Simon Furry
 */

import java.util.Scanner;

public class Solution16 {
    /*
    Create a program that:
    asks user for age
    compare with legal driving age of 16
    : user is older, "You are old enough to legally drive.
    ? user is under 16, "You are not old enough to legally drive."
     */

    private static final Scanner in = new Scanner(System.in);

    public static void main(String[] args){
        System.out.print("What is your age? ");
        int age = in.nextInt();

        final String msg = age < 16
                ? "You are not legally allowed to drive."
                : "You are legally allowed to drive";
        System.out.print(msg);
    }
}
