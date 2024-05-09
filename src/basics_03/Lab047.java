package src.basics_03;

import java.util.Scanner;

public class Lab047 {
    public static void main(String[] args) {

    //int a = 34;
 //   if (a%2 ==1) {
 //      System.out.println("ODD Number");
 //   }else{
 //      System.out.println("Even Number");
    //This is mould, if you do mould with anything 2,
    //It will return 0 or 1. It printed Even number


        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number, I will tell if it is even / odd");
        int a = sc.nextInt();
        if (a%2 ==1) {
        System.out.println("ODD Number");
        }else{
        System.out.println("Even Number");

        //Can we take an input from user in Java? Yes
        //The scanner class helps to take input
        //In scanner class, the cursour will be beeping , waiting for the user
        //to input a value. If you input anything other than numbers
        //it would break. Scanner is a class from oops concept
    }


    }
}
