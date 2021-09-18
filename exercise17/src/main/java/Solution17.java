/*
 * UCF COP3330 Fall 2021 Assignment 2 Solution
 * Copyright 2021 Simon Furry
 */

import java.util.Scanner;

public class Solution17 {
    /*
    Create a program that
    prompts for gender
    if(int == 1){
    0.73
    } else if(int == 2) {
    0.66
    } else{
    System.out.print("Please enter the proper numeric value");
    }

    double BAC = ((A * 5.14) / (W * r) - 0.015 * H)
    A = ounces of alcohol consumed
    r = ratio (male vs female)
    H = time since last drink

    if (BAC > 0.08){
    System.out.print("It is not legal for you to drive");
    } else {
    System.out.print("It is legal for you to drive");
    }
     */

   private static final Scanner in = new Scanner(System.in);

   public static void main(String[] args){
       System.out.print("Enter a 1 if you are male or 2 if you are female: ");
       int gender = in.nextInt();
       System.out.print("How many ounces of alcohol did you have? ");
       int A = in.nextInt();
       System.out.print("What is your weight in pounds? ");
       int W = in.nextInt();
       System.out.print("How many hours has it been since your last drink? ");
       int H = in.nextInt();

       if(gender == 1){
           double BAC = (A * 5.14 / W * 0.73 - 0.015 * H);
           System.out.print("Your BAC is " + BAC + "\n");
           if(BAC > 0.08){
               System.out.print("It is illegal for you to drive.");
           } else{
               System.out.print("It is legal for you to drive.");
           }

       } else if (gender == 2){
           double BAC = (A * 5.14 / W * 0.66 - 0.015 * H);
           System.out.print("Your BAC is " + BAC + "\n");
           if(BAC > 0.08){
               System.out.print("It is illegal for you to drive.");
           } else{
               System.out.print("It is legal for you to drive.");
           }
       } else {
           System.out.print("Please enter a valid numeric value.");
       }

   }

}
