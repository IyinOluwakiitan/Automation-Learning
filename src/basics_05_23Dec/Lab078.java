package src.basics_05_23Dec;

public class Lab078 {
    public static void main(String[] args) {
        //For (A; B; C)
        //A -> Initialization -> tell JVM what variable and the start point
        //B -> Condition -> when you want this to stop. Always True / False
        //C -> How Increment / Decrement is done
        //D -> Execution

        System.out.println("Print the value of i, but i want to break when i=5");

        for (int i = 1; i <= 10; i++) {
            if (i == 5) {
                break;
            }
            System.out.println("Value of " + i);// this will not print because there is a break command just above it
        }
        System.out.println("End");
    }//the moment i=5 there is a break \
    //this is the only case you can use break with for loop

    }

