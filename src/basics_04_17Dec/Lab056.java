package src.basics_04_17Dec;

import java.util.Scanner;

public class Lab056 {

    public static void main(String[] args) {
//This lesson is for switch
// If, Switch - Condition based, and they don't repeat (one statement multiple conditions)
        //Switch will only take byte, short, int, long. Variables cannot be used.
//Loops - will repeat something - for, while, do while
 //Switch - Condition based - Multiple condition
 //Variables are not allowed in switch
  //break cannot be used with elseif condition

        //which day is today!!    Let us create this program
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of day 1-7, I will tell which day it is");
        //1  means Monday, 7 means Sunday, MTWTFSS, 99 for instance is Invalid
        //the int has been defined as day number below
        //that is why day - null cos we are using day number

        int dayNumber = sc.nextInt();

        switch (dayNumber) {

            case 1:
                System.out.println("Mon");
                break;
            case 2:
                System.out.println("Tue");
                break;
            case 3:
                System.out.println("Wed");
                break;
            case 4:
                System.out.println("Thur");
                break;
            case 5:
                System.out.println("Fri");
                break;
            case 6:
                System.out.println("Sat");
                break;
            case 7:
                System.out.println("Sun");
                break;
            default: //if no condition matches then you use default
                System.out.println("Invalid Number");
                break; //this break is optional if default is the last option

        }
                System.out.println("End of Program");
                //default means if no condition matches or user inputs invalid data
                //if a user enters a wrong one


               // without adding the break, when i ran 1 everything was executed
                // day which is in all the progams matches 1, all the program will be executed

    }


    }

