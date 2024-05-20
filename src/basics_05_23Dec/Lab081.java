package src.basics_05_23Dec;

public class Lab081 {
    public static void main(String[] args) {
        //For (A; B; C)
        //A -> Initialization -> tell JVM what variable and the start point
        //B -> Condition -> when you want this to stop. Always True / False
        //C -> How Increment / Decrement is done
        //D -> Execution

        for (int i = 1; i <= 10; ++i) {
            System.out.println("Value of " + i);
           }
        // updation happens after executing the body that is why
        //++i or i++ doesnt make any change
    }
}
