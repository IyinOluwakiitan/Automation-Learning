package src.basics_03;

public class Lab037 {
    public static void main(String[] args) {
//Ternary operator cont'd
 //Can we find MAX of two numbers?

 //Example a > b -> a  //b > a ->b

 int a = 10;
 int b = 20;
 int max = a < b ? b : a;
 int min = a < b ? a : b;
 System.out.println(max);
 System.out.println(min);

    }
}
