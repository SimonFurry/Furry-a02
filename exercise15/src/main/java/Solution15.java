/*
 * UCF COP3330 Fall 2021 Assignment 2 Solution
 * Copyright 2021 Simon Furry
 */

import java.util.Scanner;

public class Solution15 {
    /*
    Create a simple password authenticator
    if(input.equals("abc$123"){
    System.out.print("Welcome!");
    } else {
    System.out.print("I don't know you.")
    }
     */

    private static final Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("What is the password? ");
        String password = in.next();
        if(password.equals("abc$123")) {
            System.out.print("Welcome!");
        } else {
            System.out.print("I don't know you.");
        }
    }
}
