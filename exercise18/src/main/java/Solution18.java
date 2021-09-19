/*
 * UCF COP3330 Fall 2021 Assignment 2 Solution
 * Copyright 2021 Simon Furry
 */
import java.util.Scanner;

public class Solution18 {
    /*
    Write a program that:
    Converts Fahrenheit to Celsius or Celsius to Fahrenheit
    prompt for starting temp, prompt for the type of conversion
    perform conversion
    print conversion
     */
    private static final Scanner in = new Scanner(System.in);

    public static void main(String[] args){
        System.out.print("Press C to convert from Fahrenheit to Celsius\nPress F to Convert from Celsius to Fahrenheit\nYour choice: ");
        String input = in.next();

        if(input.equals("C")){
            System.out.print("Please Enter the temperature in Fahrenheit: ");
            int tempF = in.nextInt();

            int C = (tempF - 32) * 5 / 9;

            System.out.print("The temperature in Celsius is " + C);
        } else if(input.equals("F")){
            System.out.print("Please Enter the temperature in Celsius: ");
            int tempC = in.nextInt();

            int F = (tempC * 9 / 5) + 32;

            System.out.print("The temperature in Fahrenheit is " + F);
        } else{
            System.out.print("Please enter a valid character.");
        }
    }
}
