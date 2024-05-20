package src.basics_05_23Dec;


import java.util.Scanner; //this is to answer the formular question

public class Lab068 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        //you have to tell JVM which input the user is entering
        //scanner can take any type of input. Example below
        //sc.nextInt();  this will take string
        //sc.nextDouble();  this will take double number
        //sc.nextBoolean();  this will take boolean
        //sc.nextFloat();   this will take float
        System.out.println("Enter the value of X");
        double x = sc.nextDouble();
        //we will use double so all the values will be stored including the decimal
        //if you use int for instance so,e values will be lost

        System.out.println("Enter the value of Y");
        double y = sc.nextDouble();
        System.out.println("Enter the value of Z");
        double z = sc.nextDouble();


        double result = 0;
        //3/x^2 + y^2 - |z|
        //A+B-C -> A -> x^2, B -> Y ^2, C -> |z| abs (z)
        // Z is the absolute value - positive value of Z
        //Absolute power of-1 is 1 (positive 1) abs means it will not return any negative value

        result = Math.cbrt(Math.pow(x,2) + Math.pow(y,2)-Math.abs(z));
        System.out.println(result);


        sc.close(); //we are telling JVM we do not want any other value
        //if you don't do it, JVM will do it for you tho... garbage collector
        //but best practice is to close it

        //For any Math value just type Math.
        // then select the function after, for instance cube root, square root





    }
}
