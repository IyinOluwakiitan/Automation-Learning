package src.basics_05_23Dec;

import java.util.Scanner;

public class Lab69 {
    public static void main(String[] args) {
        //Take a user input and print the information
        Scanner user_input = new Scanner(System.in); //user_input (reference name) can be replaced with anything
        System.out.println("Enter your name");
        String name = user_input.next();        //For string we generally use next function

        System.out.println("Enter your age");
        int age = user_input.nextInt();//data type for age is int

        System.out.println("Enter your salary");
        double salary = user_input.nextDouble(); //data type is double so it can contain all the decimals

        System.out.println("Your details are " + name + " - " + age +" - " + salary);
        System.out.println ("Your age is " + age);
        System.out.println ("Your Salary is " + salary);
        user_input.close();

        //if you run this System.out.println("Your details are " + name + age + salary);
        //then there wont be space. But if you run what is there now then its ok
    }
}
