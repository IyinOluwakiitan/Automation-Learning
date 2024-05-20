package src.basics_05_23Dec;

public class Lab079 {
    public static void main(String[] args) {
        //For (A; B; C)
        //A -> Initialization -> tell JVM what variable and the start point
        //B -> Condition -> when you want this to stop. Always True / False
        //C -> How Increment / Decrement is done
        //D -> Execution

        for (int i = 1; i <= 10; i++) {
            System.out.println("Value of " + i);// this will print till 5 because the print command is below it
            if (i == 5) {
                break;
            }
        }

    }
}



