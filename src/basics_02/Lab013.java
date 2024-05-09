package src.basics_02;

import java.util.EventListener;

public class Lab013 {
    public static void main(String[] args) {
        double a = 34;
        double b = 10;
        double result = a%b;
        //% -> mod -> Remainder
        System.out.println(result);

        //10 / 34 / 3 - Q
        //   /30 /
        //-----------
        //    4

        //78%12 ->
       // 12 / 78 / 6 - Q
        // 6 - Remainder

        int num = 36;
        int r = num%2;
        System.out.println(r);

        // this is the logic for even and odd program

       // num%2 = 0 -> Even
       //when you use %2 with an even number the answer will be 0

      //  num%2 = 1 -> Odd
        //when you use %2 with an odd number the answer will be 1

    }
}
