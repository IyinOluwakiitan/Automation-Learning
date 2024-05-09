package src.basics_03;

public class Lab042 {
    public static void main(String[] args) {
        int b = 10;
        System.out.println(++b + b++);
        System.out.println(b);

        //the first line is 11 + 11 being 10 increase in value by 1
        //that is addition of all output as broken down below
        //After that the value of b will be 12 as broken down below


        //Part A (Exp = 11, b =11  ) -> ++b -> O/P -> 11
        //Part B (Exp = 11 , b = 12 ) -> b++ -> O/P -> 11
        // value of A+B is 11+11 = 22
        // value of b is now 12
    }
}
