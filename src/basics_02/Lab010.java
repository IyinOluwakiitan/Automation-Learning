package src.basics_02;

public class Lab010{
    //constants
    public static void main(String[] args) {
        final float pi = 3.145f;
        System.out.println(pi);
        //final is a keyword and once you add final before the float then
        //you cannot reassign the value because it is fixed i.e constant
        //if you try to run it that way there will be an error message
        //supposed the value of pi is changed to 10.89
        //pi = 10.89f; - value cannot be changed in a program won't run because of final
        System.out.println(pi);

        //a value can be assigned to string and double
        //final String STR="TTA"; this is possible & will run
       // final double D1=999.99; this is possible & will run
        //D1 = 9.000; this is not possible & will not run error - cannot assign a value to final variable D1

    }
}


