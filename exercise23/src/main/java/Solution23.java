/*
 * UCF COP3330 Fall 2021 Assignment 2 Solution
 * Copyright 2021 Simon Furry
 */
import java.util.Scanner;

public class Solution23 {
    /*
    Create a program that:
    walks user through troubleshooting issues with a car.
    big ol if/else tree
     */

    private static final Scanner in = new Scanner(System.in);

    public static void main(String[] args){
        System.out.print("Is the car silent when you turn the key? ");
        String initialInput = in.next();

        if(initialInput.equals("y")){
            System.out.print("Are the battery terminals corroded? ");
            String input = in.next();
            if(input.equals("y")){
                System.out.print("Clean terminals and try starting again.");
            } else if(input.equals("n")){
                System.out.print("Replace cables and try again.");
                System.exit(0);
            }
        } else if(initialInput.equals("n")){
            System.out.print("Does the car make a slicking noise? ");
            String input2 = in.next();
            if(input2.equals("y")){
                System.out.print("Replace the battery.");
                System.exit(0);
            } else if(input2.equals("n")){
                System.out.print("Does the car crank up but fail to start? ");
                String input3 = in.next();
                if(input3.equals("y")){
                    System.out.print("Check spark plug connections.");
                } else if(input3.equals("n")){
                    System.out.print("Does the engine start and then die? ");
                    String input4 = in.next();
                    if(input4.equals("y")){
                        System.out.print("Does your car have fuel injection? ");
                        String input5 = in.next();
                        if(input5.equals("y")){
                            System.out.print("Get it in for service.");
                        } else if(input5.equals("n")){
                            System.out.print("Check to ensure the choke is opening and closing.");
                        }
                    } else if(input4.equals("n")){
                        System.out.print("This should not be possible.");
                        System.exit(0);
                    }
                }
            }
        }
    }
}
