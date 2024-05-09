package src.basics_03;

public class Lab038 {
    public static void main(String[] args) {
//Ternary operator cont'd
 //Can we find MAX of two numbers?

 //Example a > b -> a  //b > a ->b

 int a = 40;
 int b = 20;
 int c = 32;

 //-> ? Tertinary operator is what is next to be done
  //you can use it to find maximum between 2 or 3 numbers

  //Tenary operator within tenary operator
  int max = (a > b) ? ((a > c) ? a : c) : ((b > c) ? b : c);
        System.out.println(max);
    }
}
