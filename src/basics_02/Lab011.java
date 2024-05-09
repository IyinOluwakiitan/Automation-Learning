package src.basics_02;

public class Lab011 {
    public static void main(String[] args) {
        //char
       char c = 'A';
        System.out.println(c);

        //char c1 = "$"; // string
        char c1 = '$';
        System.out.println(c1);

        //this will run as a new line, however it wont show when you check
        char c2 = '\n';
        System.out.println(c2);

        char c3 = '\uF061'; //Unicode character ->:) :(, :/ ->
        System.out.println(c3);
        //rapid tables can be used to convert

        //ASCII Table
        //0-9 48-57
        //A-Z 65-90
        //a-z 97-122
        //0-9 48-57

        char ch10 = '\u0062';
        System.out.println(ch10);

        //decimal system
        int age = 10; //decimal

        //octal number: whenever you see 0 in front of 1, know it is an octal number
        int b=0101;

        //Binary number
        int b2 = 0b101; // if you want to store binary you use 0b
    //there is no use case for octal, binary and hexal no using Web and API automation
    // we use only decimal. Octal, binary and hexal are all use electronics

        //Hexal Decimal - it starts with 0x
        int c45=0xface;

    }

}
