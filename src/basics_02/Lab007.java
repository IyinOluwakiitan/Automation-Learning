package src.basics_02;

public class Lab007 {
    public static void main(String[] args) {
        //if the ln after print is out, when you run the code,
        //it will be printed on one line
       System.out.print("Hello World");
       System.out.println("Omotolani");

        //when the ln is available on both command line
        //and you run it, it will be on 2 different lines
      System.out.println("Hello World");
      System.out.println("Omotolani");

        //using souf command, %d picks the age of the intger (34)
        // and replaces it with the age. %d is replaced with the age
        //d basically acts as an intger or integral type.
        // d can be any integer - byte, short, int or long
        //if you want to use it as char it will be %c
        //if you want to use it as a string it will be %s
        //if you want to use it as a float it will be %f
        // Example below - command line with %d
        //if is switch command line 2 and 3 it will be on different lines

        int age = 34;

        System.out.println("Your age is " + age);
        System.out.printf("Your age is %d", age);
        System.out.println("Your age is %d");


        /**
         * Author - Omotolani
         * forward slash and asterics is used to add documentation
         * Program showcase difference between Println vs Print
         **/

    }
}
