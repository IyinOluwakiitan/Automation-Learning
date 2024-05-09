package src.basics_03;

public class Lab019 {
    public static void main(String[] args) {
      //simple assignment
        int a = 10;
        //compound assignment operators
        int b = 45;
        b +=30; //this means b = b +30
        System.out.println(b);

        int b1 = 90;
        b1-= 89; //b = b-89;
        b1 = b1+1; //this is not a compound operator, because it is only +
        System.out.println(b1); //output is 1 90-81

        //+=, -=, /=, *=, %= these are compound operators

        int a1 = 10; //this is a unary operator
    }
}
