package src.basics_03;

import java.util.Scanner;

public class Lab048 {
    public static void main(String[] args) {
        //Take three inout from user and give out of two
        //a,b a>b ->, else b

        Scanner sc = new Scanner(System.in); //oops concept.
        // you need to remember this, we are calling the scanner class
        System.out.println("Enter the a,b");
        int a = sc.nextInt();
        int b = sc.nextInt();

        if (a > b) {
            System.out.println("Max > " + a);
        } else {
            System.out.println("Max > " + b);
        }


    }

}

      //the role of + sign is adding the value of string and integer
      //the +sign is there because of concatination, it is used to combine
      //if you dont use + then you wont be able to combine the values


  //side note double quotes are used for string only
  //while single quotes is used for char

