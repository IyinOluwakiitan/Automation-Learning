package src.basics_03;

public class Lab043 {
    public static void main(String[] args) {
//Decrement operator
        int b = 10;
        System.out.println(--b + b--);
        System.out.println(b);

        //Part A (Exp = 9, b = 9 ) -> --b -> O/P -> 9
        //Part B (Exp = 9, b = 8 ) -> b-- -> O/P -> 9
        //value of A+B = 9 + 9 = 18
        //value of b is 8
    }
}
