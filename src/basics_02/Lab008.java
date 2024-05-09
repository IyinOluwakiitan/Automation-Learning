package src.basics_02;

public class Lab008 {
    public static void main(String[] args) {
        //this is used for formatting if you want to do multiple things
        //the first d is replaced with 9
        //the second d is replaced with 2
        int number = 9;
        //System.out.printf("%d*1=%d*1", number,2);

        String name = "Omotolani"; // bunch of char
        //concate +
        //System.out.println("Your name is -> " + name);

        //Formatting (printf)
        //the value of name will not be replaced if you run the code below
        //because you used name
        //System.out.printf("Your name is -> name");
        //instead replace name with %s (%S stand for string and run the code below
        //%s is replaced with the value of name - Omotolani
        //System.out.printf("Your name is -> %s", name);

        //there are 2 ways of getting same output
        // either you use the plus operator which is concate which is also rep with a +
        //or by using formatting which is printf
        // concate will be used more

        float pi = 3.14159f;
        System.out.printf("Your value is %f", pi);
        //the number 3.14159f replaced %f
    }
}
