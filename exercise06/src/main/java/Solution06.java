/*
 * UCF COP3330 Fall 2021 Assignment 2 Solution
 * Copyright 2021 Simon Furry
 */


import java.util.Scanner;
import java.util.Date;

public class Solution06 {
    /*
    Create a program that:
    takes user input age
    user input prefered retirement date
    preference - age = how long left to retire
    then:
    current year + preference = year they can retire
     */
    private static final Scanner in = new Scanner(System.in);

    public static void main(String[] args){

        Date d = new Date();
        int year = d.getYear(); //Access date, then access year

        System.out.print("What is your current age? ");
        int UserAge = in.nextInt(); //User age

        System.out.print("At what age would you like to retire? ");
        int UserRetirementPreference = in.nextInt(); //Preference for age to retire

        int YearsUntilRetirement = (UserRetirementPreference - UserAge); //Math
        int CurrentYear = (year + 1900);
        int YearOfRetirement = ((CurrentYear + YearsUntilRetirement)); //More math :)

        if(YearsUntilRetirement < 0){
            System.out.println("You can already retire!");
        } else{
            System.out.println("You have " + YearsUntilRetirement + " years left until you can retire."); //Implements math to print statement.
            System.out.println("It's " + CurrentYear + ", so you can retire in " + YearOfRetirement);
        }
    }
}
