package src.basics_05_23Dec;

public class Lab085 {
    public static void main(String[] args) {
        //Continue- If this condition is true then continue
        for (int i = 0; i < 10; i++) { //this will execute 10 times and the value of i is 0-9 not 10 take note
            System.out.println(i);
            if (i == 5) continue;
            System.out.println("**AFTER");
            //because i=5 we will move back and JVM will not execute line 9
        }
    }
}
