package src.basics_03;

public class Lab022 {
    public static void main(String[] args) {

        /*
        Logical Operators
        ! - Logical NOT // only allowed with boolean not with int. ! also means reverse
        && - Logical AND
        || - Logical or
        */
        boolean a = true; //char is only available to boolean or condition
        System.out.println(a);
        System.out.println(!a);
       // System.out.println(!10); this will not run because it is integer
        System.out.println(10>20); //this will run as false
        System.out.println(!(10>20)); //this will run as true because of the logical not added

        System.out.println(!(30>90)); //Ensure it is inside a bracket
    }
}
