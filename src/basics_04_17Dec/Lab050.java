package src.basics_04_17Dec;

import java.util.Scanner;

public class Lab050 {
    public static void main(String[] args) {
    //In the If loop, it has either Yes or No
     //If else
     //Yes, No
//     if (true) {
//         System.out.println("True");
//    }
//     else {
//         System.out.println("False");
//
//      if (true)
//          System.out.println("Only If");

      //What If - > 20, < 20, < 10 -> ? Ranging from 11 to 19
      //When you have unlimited conditions then you can use If, else if, else
      //you can use multiple conditions by using else if

       Scanner sc = new Scanner(System.in);
       int number = sc.nextInt();

       if (number > 20) {
           System.out.println("Number is >20");
       }else if (number >10){
           System.out.println("Number is >10");
       }else {
           System.out.println("Number is < 20");
       }
       //with this just run the program then put a number and run it


     }
}
