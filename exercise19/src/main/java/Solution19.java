/*
 * UCF COP3330 Fall 2021 Assignment 2 Solution
 * Copyright 2021 Simon Furry
 */
import java.util.Scanner;

public class Solution19 {
    /*
    Create a program that:
    Calculates BMI for a person
    take input height in inches
    take input weight in pounds

    double BMI = (weight / (height * weight)) * 703
     */

    private static final Scanner in = new Scanner(System.in);

    public static void main(String[] args){
        System.out.print("What is your height in inches ");
        double height = in.nextDouble();
        System.out.print("What is your weight in pounds ");
        double weight = in.nextDouble();

        double BMI = (weight / (height * height)) * 703;

        if(BMI < 18.5){
            System.out.print("Your BMI is " + BMI +".\nYou are underweight. You should see your doctor.");
        }else if(BMI > 25){
            System.out.print("Your BMI is " + BMI + ".\nYou are overweight. You should see your doctor.");
        }else if(18.9 < BMI && BMI < 25){
            System.out.print("Your BMI is " + BMI + ".\nYou are within the ideal weight range.");
        }

    }
}
