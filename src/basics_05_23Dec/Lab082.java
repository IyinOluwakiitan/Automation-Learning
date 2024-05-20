package src.basics_05_23Dec;

public class Lab082 {
    public static void main(String[] args) {

        //For (A; B; C)
        //A -> Initialization -> tell JVM what variable and the start point
        //B -> Condition -> when you want this to stop. Always True / False
        //C -> How Increment / Decrement is done
        //D -> Execution

        //Print odd number in between 1 to 50
        //If Else
//Odd number in descending
//       for (int i = 1; i <=50; i++) {
//            if (i % 2 == 1) {
//                System.out.println(i + " is Odd!");
//            }
//        }
//                System.out.println("---End of Program---");

       //We can also reverse the above code - Odd Number in Ascending

//        for (int i = 50; i > 0; i--) {
//            if (i % 2 == 1) {
//                System.out.println(i + " is Odd!");
//            }
//        }
//        System.out.println("---End of Program---");

        //For Even Number
//        for (int i = 50; i > 0; i--) { /you use negation ! to reverse the code i.e !%2==1 OR (i%2==0)
//            if (!(i % 2 == 1)) {
//                System.out.println(i + " is Even!");
//            }
//        }
//        System.out.println("---End of Program---");


        for (int i = 1; i < 50; i++) {
            if (!(i % 2 == 1)) {
                System.out.println(i + " is Odd!");
            }
        }
        System.out.println("---End of Program---");




    }
        }



