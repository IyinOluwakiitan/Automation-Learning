package src.basics_03;

public class Lab044 {
    public static void main(String[] args) {
     //Increase & Decrease Operator practice question

     int b = 10;
        System.out.println(--b + b++ + ++b);
        System.out.println(b);

        //Part A --b (Exp = 9, b = 9) -> O/P -> 9
        //Part B b++ (Exp = 9, b = 10) ->O/P -> 9 /the value of b in Part A becomes expression value here
        //Part C ++b (Exp = 11, b = 11)-> O/P -> 11 /the value of b is now 11
        // because we lifted 10 which is its value in Part B and added ++ 1 value
        //the Expression value is 11 because the direct value of b is 11
        //A+B+C=29
        //b = 11

    }
}
