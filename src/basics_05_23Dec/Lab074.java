package src.basics_05_23Dec;

public class Lab074 {
    public static void main(String[] args) {
        //For (A; B; C)
        //A -> Initialization -> tell JVM what variable and the start point
        //B -> Condition -> when you want this to stop. Always True / False
        //C -> How Increment / Decrement is done
        //D -> Execution
        // for ( ; ; ) //This is an infinite loop because there are no conditions
        //    System.out.println("Omotolani");
        //it will continue to print until it is interrupted with the stop button
        //having exit code 130 because it was interrupted

        //    boolean b1=true;
        //    b1=false; //nothing will be printed because condition is false
        //    for( ;b1; )
        //        System.out.println("TTA");

        final boolean b1 = true; //final here stands for infinite loop
        //b1=false;
        for (;b1; )
        System.out.println("TTA"); //this will only stop when you click stop button


    }
}
