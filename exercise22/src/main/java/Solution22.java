/*
 * UCF COP3330 Fall 2021 Assignment 2 Solution
 * Copyright 2021 Simon Furry
 */
import java.util.Scanner;

public class Solution22 {
    /*
    Create a program that:
    checks first to see that all numbers are different.
    if all numbers aren't diff. exit program.
    otherwise, display largest number of the three.
     */
        private static final Scanner in = new Scanner(System.in);

        public static void main(String[] args) {

            System.out.print("Enter the first number: ");
            int num1 = in.nextInt();
            System.out.print("Enter the second number: ");
            int num2 = in.nextInt();
            System.out.print("Enter the third number: ");
            int num3 = in.nextInt();

            if(num1 == num2 || num1 == num3 || num2 == num3){
                System.out.print("Please enter numeric values that are not equal.");
            } else if(num1 >= num2 && num1 >= num3)
                System.out.println("The largest number is " + num1);

            else if (num2 >= num1 && num2 >= num3)
                System.out.println("The largest number is " + num2);

            else
                System.out.println("The largest number is " + num3);
        }
    }
