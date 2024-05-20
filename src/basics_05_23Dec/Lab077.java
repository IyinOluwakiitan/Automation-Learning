package src.basics_05_23Dec;

public class Lab077 {
    public static void main(String[] args) {
        //For (A; B; C)
        //A -> Initialization -> tell JVM what variable and the start point
        //B -> Condition -> when you want this to stop. Always True / False
        //C -> How Increment / Decrement is done
        //D -> Execution

        //for (int i = 0; i < 10; i++) {
           // System.out.println("Omotolani"); //This can be a bit confusing
            //because in i=0, 0 stands for the value of 1, and we begin to count from 0 as 1
            //|i=0, 1|
            //|i=1, 2|
            //|i=2, 3|
            //|i=3, 4|
            //|i=4, 5|
            //|i=5, 6|
            //|i=6, 7|
            //|i=7, 8|
            //|i=8, 9|
            //|i=9, 10|

            //To avoid confusion, then do this instead
            for (int i = 1; i <= 10; i++) {
            System.out.println("Omotolani");
            }
                //|i=1, 1|
                //|i=2, 2|
                //|i=3, 3|
                //|i=4, 4|
                //|i=5, 5|
                //|i=6, 6|
                //|i=7, 7|
                //|i=8, 8|
                //|i=9, 9|
                //|i=10, 10|

            }
        }



