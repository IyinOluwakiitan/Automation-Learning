package src.basics_02;

public class Lab015 {
    public static void main(String[] args) {
        //Literals - Escape Sequence / c stands for character
        //you can either use c, c1, c2, c3 or use the short form directly i.e \t, \n etc
        char c = '\n'; //C is to add a New line / New Line
        char c1 = '\t'; //c1 is to Add space
        char c2 = '\b';//Backlash ie delete one character / alphabet
        char c3 = '\r';//Return character ie Omotolani will be deleted
        System.out.println("Omotolani" +c3 + "Deji-Akintola");
        System.out.println("Omotolani\tDejiAkintola"); //adding t directly instead of adding c1
        System.out.println("Omotolani\nDejiAkintola"); //addidng n directly instead of adding c
        System.out.println("Omotolani\"d");
        System.out.println("Omotolani\'d");

    }
}
