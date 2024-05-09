package src.basics_04_17Dec;

import java.util.Scanner;

public class Lab051 {
    public static void main(String[] args) {
        //Grade Calculator is a famous Interview Question
        //Write a program that calculates and displays the letter grade for a given
        //numerical score (e.g., A, B, C, D, or F) based on the following grading scale
        //
        //A: 90 - 100
        //B: 80 - 89
        //C: 70 - 79
        //D: 60 - 69
        //F: 0 - 59

        //Breakdown the steps to follow into 5 parts
        //1. Input from user          (user will enter a number and you need to print grade)
        //  Number/Score (Data type) is int / float -> Grade (char or String)
        //  Data type can be in int or flaot but we were not given as float so we will maintain int


        //2. Basic logic or Brute Force Logic and write basic rough code
        //If score >= 90 & score <=100 -> print A
        //else if score >= 80 & score 89 <= 100 -> print B
        //the last command is onlt else and has no grades


        //3. Write the real code. For the last grade dont use else if just use else
        //scanner sc is to take inputs of user
        //whatever figure you input in the run column feeds into the score
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Student Score");
        int score = sc.nextInt();

        if (score >= 90 & score <= 100) {
            System.out.println("Your score -> A");
        }else if (score >=80 & score <=89) {
            System.out.println("Your score -> B");
        }else if (score >=70 & score <=79) {
            System.out.println("Your score -> C");
        }else if (score >=60 & score <=69) {
            System.out.println("Your score -> D");
               }else {
            System.out.println("Your score -> F");
        }

  //4. Debug the code
   //realised that other than int the code fails
   //This progam does not run again and again
   //you can have multiple else if but only 1 else that signifies the end
  //5. Fix the code and final it
    }
}
