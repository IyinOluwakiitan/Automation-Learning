package src.basics_04_17Dec;

import java.util.Scanner;

public class Lab058 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Char, i will tell if it is a vowel"); //aeiou

        char user_input = sc.next().toCharArray()[0];
        System.out.println(user_input);
        //only the first letter will be executed
        switch (user_input){
            case 'a':
                System.out.println("it is a Vowel");
                break;
            case 'e':
                System.out.println("it is a Vowel");
                break;
            case 'i':
                System.out.println("it is a Vowel");
                break;
            case 'o':
                System.out.println("it is a Vowel");
                break;
            case 'u':
                System.out.println("it is a Vowel");
                break;
            default:
                System.out.println("Not a vowel, It is a consonant");

                //scanner class is used to take input from a user which in this case is aeiou???



        }

         }
        //

    }

