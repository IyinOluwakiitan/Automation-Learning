package src.basics_05_23Dec;

public class Lab091 {
    public static void main(String[] args) {
        //comparism between for and while loop
//        int i = 10;
//        while (i>10){
//            System.out.println(i);
//            i++;                   //if you print this alone nothing happens
//        }
//         System.out.println(i);

        for (int i = 10; i < 10; i++) {
            System.out.println();
        }

        //Cannot use i because i is within for loop
        //in the case of while loop it is available outside
        //the main difference is that initialization is outside for while loop
        //if you want initialization outside use while loop
        //if you want initialization inside use for loop
        //if you have already initialized then use while loop
    }
}
