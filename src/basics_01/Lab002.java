package src.basics_01;

public class Lab002 {
    public static void main(String[] args) {
        byte age = 10; //Range of Byte -128 to 127
        age = 127; // out of Range
        System.out.println(age+1);
       // age = age +1;
        System.out.println(age);

        //age is a local variable
        //keywords - are simple English words
        //package, public class - are reserved words
        //Keywords are in lowercase
        //we cant use keywords as variables

         short _age = 128; //-32768 to 32678
        System.out.println(_age);
        //age & _age

        //notes//
        //public static void main(String[] args) {
            //**keywords are in lower case
            // we cant use keywords as variables
            //main - to write the prefix to the command line
            //sout - to write the command

            //byte age = 10; // Range of Byte - 128 to 127
           // age = 127; //within range
            //System.out.println(age+1); //age +1 is u increasing it by 1 but d original age still remains 127 so it will run
            //age = age +1; // this will not run because now the new age is 28 which is out of range for byte
            //System.out.println(age);

            //age is a local variable - which means it is only accessible in the function above

            //short age2 = 128; // Range of short -32768 to 3268
            //short is data type, age 2 is variable name,128 is variable value or literal
            // you can use short when not sure of the integer to use
        // when you are not sure you can use short


        }

    }





// short is a data type
// and age 2 is variable main
//128 is variable value or literal
