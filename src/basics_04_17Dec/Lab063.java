package src.basics_04_17Dec;

public class Lab063 {
    public static void main(String[] args) {
        //in this case if you add arrow, you dont have to add break clause
        //Arrow acts as a break
        //disadvantage is that it takes only one line so if you add another line it wont take it
        //example is in the greyed out code
        int itemCode = 005;
        switch (itemCode) {
            case 001 -> System.out.println("It is a laptop!");
           // System.out.println("This wont run because it is on another line");
            case 002 -> System.out.println("It is a desktop!");
            case 003, 004 -> System.out.println("It is a mobile phone!");
            default -> System.out.println("Hello!");


        }
    }
}
