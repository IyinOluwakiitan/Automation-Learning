package src.basics_04_17Dec;

public class Lab062 {
    public static void main(String[] args) {
        //This will only work for JDK 13 or less. This is Advanced Switch Loop
        int itemCode = 005;
        switch (itemCode) {
            case 001, 002, 003:
                System.out.println("It is an electronic gadget!");
                break;
            case 004, 005:
                System.out.println("It is a mechanical device!");
            default:
                System.out.println("It's a software Product!");



        }






    }
}
