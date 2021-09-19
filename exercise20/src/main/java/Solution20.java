/*
 * UCF COP3330 Fall 2021 Assignment 2 Solution
 * Copyright 2021 Simon Furry
 */
import java.util.Scanner;
import java.lang.Math;

public class Solution20 {
    /*
    Create a program that:
    calculates tax based off state and county within state
    if(state.equals("Wisconsin"){
        prompt for county
            if(county.equals("Eau Claire"){
        calculate with 5.5% tax
            }else if(county.equals("Dunn"){
        calculate with 5.4% tax
        }
    }else if(state.equals("Illinois"){
    calculate with 8% tax
    }else{
    calculate no tax
    }
     */
    private static final Scanner in = new Scanner(System.in);

    public static void main(String[] args){
       System.out.print("What is the order amount? ");
       int order = in.nextInt();
       System.out.print("What state do you live in? ");
       String state = in.next();

        if(state.equals("Wisconsin")){
            System.out.print("What county do you live in? ");
            String county = in.next();

            if(county.equals("Eau Claire")){
                double tax = .055;
                double orderTax = order * tax;
                double orderTotal = order + orderTax;
                double rounded = (double)Math.round(orderTotal * 100.00)/100;
                System.out.print("The tax is $" + orderTax + ".\nThe total is $" + rounded);
            } else if(county.equals("Dunn")){
                double tax = .054;
                double orderTax = order * tax;
                double orderTotal = order + orderTax;
                double rounded = (double)Math.round(orderTotal * 100.00)/100;
                System.out.print("The tax is $" + orderTax + ".\nThe total is $" + rounded);
            }
        }else if(state.equals("Illinois")){
            double tax = .08;
            double orderTax = order * tax;
            double orderTotal = order + orderTax;
            double rounded = (double)Math.round(orderTotal * 100.00)/100;
            System.out.print("The tax is $" + orderTax + ".\nThe total is $" + rounded);
        }else{
            System.out.print("The total is $" + order);
        }
    }
}
