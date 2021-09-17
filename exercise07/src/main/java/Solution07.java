/*
 * UCF COP3330 Fall 2021 Assignment 2 Solution
 * Copyright 2021 Simon Furry
 */

import java.util.Scanner;

public class Solution07 {
    /*
    Create a program that:
    prompts user for the length of a room in feet
    then prompts for the width of the room in feet
    then reiterates their dimensions again
    do math to get the area in:
    square feet = lenght * width
    square meters = (length * width) * 0.09290304
     */
private static final Scanner in = new Scanner(System.in);

public static void main(String[] args){
    System.out.print("What is the length of the room in feet? ");
    int UserLength = in.nextInt(); //takes in the users desired length

    System.out.print("What is the width of the room in feet? ");
    int UserWidth = in.nextInt(); //takes in the users desired width

    int SquareFeet = (UserLength * UserWidth); //Math
    double SquareMeter = (SquareFeet * 0.09290304);

        System.out.print("You entered dimensions of " + UserLength + " feet by " + UserWidth + " feet."); //Outputs
        System.out.print("The area is\n" + SquareFeet + " square feet\n" + SquareMeter + " square meters");
}

}
