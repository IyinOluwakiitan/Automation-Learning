package src.basics_05_23Dec;

public class Lab072 {
    public static void main(String[] args) {
        //For (A; B; C)
        //A -> Initialization -> tell JVM what variable and the start point
        //B -> Condition -> when you want this to stop. Always True / False
        //C -> How Increment / Decrement is done
        //D -> Execution

        //A - int i = 1 We are using integer, and we are starting from 1
        //B - i <=10 we are stopping at 10 cos we want it repeated 10 times
        //C - i++ -> depicts post increment, meaning i want to increase 1 by 1
        //D - Which code am i executing  -> System.out.println("Omotolani");

        //One Method
        for(int i=1; i<=10; i++) { //ABC has been represented with the code separated by the semi-colon
            System.out.println("Omotolani");}
    }
}
