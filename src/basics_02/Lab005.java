package src.basics_02;

public class Lab005 {
    public static void main(String[] args) {
        byte b = 10;
        short s = 123;
        int age = 34;

        //when we use the long variable add l in the end
        // to differnciate it. You can use capital L or small l
        //to differenciate betwwen integer and long we use L
        long phone_number = 34L;
        long phone_number2 = 34l;


        //float is a decimal number, always add f at the end to indicate this
        //and to differciate between double and float
        //you can use capital F or small F to indicate this
        //double d is a bigger decimal number
        float f = 12.32F;
        float f2 = 12.34f;
        double d = 12.345678999;

        //i cannot store a char in double quotes (e.g char c1 = "A")
        //because once you use double quotes it becomes a string
        // single corrector? is in single quotes e.g 'A'
        // the variable name cannot be repeated e.g char c twice
        // variable name cannot be underscore alone because after java 9 it is not possible
        // however how to print the value of _1 will be _1}
        char c = 'A';
        char c2 = '!';
        char c22 = '@';
        char $ = '#';
        char _1 = '#';
        System.out.println(c);
        System.out.println(_1);

}}
//class name & file name should be same
// else there will be error