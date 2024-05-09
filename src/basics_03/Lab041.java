package src.basics_03;

public class Lab041 {
    public static void main(String[] args) {
 //Increament operator
 int a = 10;
        System.out.println(++a + a++ + a++); //divide it into 3 parts
        /*
        Part A (Exp = 11, a = 11 ) -> ++a -> O/P -> 11
        Part B (Exp = 11, a = 12 ) -> a++ -> O/P -> 11
        Part C (Exp = 12, a = 13 ) -> a++ -> O/P -> 12
        A+B+C -> 11+11+12-> 34, a ->13

        Part A - value of a originally is 10 but because ++ means increase the value of a by 1. Then it becomes 11
        Value of Expression is 11 because ++a is now 11 based on above sentence
        output is also 11

        Part B - Value of a now is 11 (based on incremental operation) but with the ++ which implies increasing the value it becomes 12
        Expression value now is 11 because we are printing a directly / alone, and a directly is 11 based on above
        output is 11 because the expression value is 11

        Part C - value of a is now 12 (based on incremental operation) but with the ++ which implies increasing the value it becomes 13
        Expression value now is 12 because we are printing a directly / alone and directly is 12 based on the value of a
        output is 12 because the expression value is 12
        THus if we add all outputs, the value totals 34 and value of a is 13
                      */


    }
}
