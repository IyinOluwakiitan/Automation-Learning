package src.basics_05_23Dec;

public class Lab071 {
    public static void main(String[] args) {

        //conditions
        // If, If Else, If Else If, Else, Switch (break is only possible with Switch here because we want to exit
        //Checks for something either true or false
        //Performs the task only once
        //No Break and Continue
        //with switch, break is possible

        //Loops
        // To perform a task multiple times
        //Major loops you'd forsee is For, While, Do While
        //Break and Continue


        //For Loop
        //1. It is used to perform a task multiple times
        //2. Based on Condition -> task multiple times
        //This loop can also use condition side by side

        //Example of repetitive task

        System.out.println("Omotolani"); //I want to print this 10 times
        //For (A; B; C)
        //A -> Initialization -> tell JVM what variable and the start point
        //B -> Condition -> when you want this to stop
        //C -> How Increment / Decrement is done
        //D -> Execution

        //A - int i = 1 We are using integer, and we are starting from 1
        //B - i <=10 we are stopping at 10 cos we want it repeated 10 times
        //C - i++ -> depicts post increment, meaning i want to increase 1 by 1
        //D - Which code am i executing  -> System.out.println("Omotolani");

        //One Method
        for(int i=1; i<=10; i++) { //ABC has been represented with the code separated by the semi-colon
            System.out.println("Omotolani");
        }

            //another method - 0,1,2,3,4,5,6,7,8,9 still totalling 10
            for (int i=0; i <10; i++) { // Meaning less than 10 but counting 0 will still sum it to 10 and print 10 times
                System.out.println("Omotolani");


            }
            }
}



