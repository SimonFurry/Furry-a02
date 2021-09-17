
/*
 * UCF COP3330 Fall 2021 Assignment 2 Solution
 * Copyright 2021 Simon Furry
 */

import java.util.Scanner;
import java.lang.Math;

public class Solution09 {
    /*
    Create a program that:
    calculates gallons of paint needed to paint the ceiling of a room.
    Prompt for the length and width
    assume 350 square feet = 1 gallon of paint.
    display the number of gallons needed to paint the ceiling as a whole number.
     */
    private static final Scanner in = new Scanner(System.in);

    public static void main(String[] args){
        System.out.print("What is the length of the room in feet? ");
        int UserLength = in.nextInt(); //takes in the users desired length

        System.out.print("What is the width of the room in feet? ");
        int UserWidth = in.nextInt(); //takes in the users desired width

        double SquareFeet = (UserLength * UserWidth); //Math

        int GallonOfPaint = 360;

        double GallonsRequired = SquareFeet / GallonOfPaint;
        double GallonsRequiredRounded = Math.ceil(GallonsRequired);

        System.out.print("You will need to purchase " + GallonsRequiredRounded + " gallons of paint to cover " + SquareFeet + " square feet.");
    }

}

