package src.basics_03;

public class Lab021 {
    public static void main(String[] args) {
        //Interview Question related to Relational Operator
        System.out.println(10 == 10);
        System.out.println(10 >= 10);
        System.out.println(10 <= 10);
        System.out.println(10 > 10);
        System.out.println(10 < 10);

        System.out.println('A' == 65); //true because char/ corrector used in SOP is an integer
/*
 it is the ASCII value, check ASCII chart to refresh A=65 in the chart
you cannot assign a value to A so System.out.println('A'=65) is wrong (single equals to sign
 only comparism is allowed using hte == sign
one can directly print A ie System.out.println(A)
*/

        byte b = 65;
        System.out.println('A' == b); //b here is an integer
        //SCII value of A = 65 hence it implies 65 == 65 which is true

        System.out.println('A' == 65.0); //true because this is now a double and it is how java wants it
        System.out.println('A' == 65.0f); //true once there is f after the number then it is a float
/*
       if you write 65.2 then it will be false because it is now a proper decimal number not a float
        System.out.println(true == 0);//this will not run because comparing 2 incompartble is impossible cos 1 is boolean and other is interger
        System.out.println(true >=  true);// this will not run because between boolean there is no comparism operator. You cannot compare 2 booleans
       */


    }
}
