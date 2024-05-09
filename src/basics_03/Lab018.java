package src.basics_03;

public class Lab018 {
    public static void main(String[] args) {
        //concatination operator is important to note
        int a = 10;
        int b = 45;
        System.out.println(a + b);
        String name = "Omotolani";
        System.out.println(a+name);
        System.out.println(name+a);
        //Interview Question below. Note that calculation goes from left -> Right
//a and b are integers and + means we are adding, then concatination will happen because of name
        System.out.println(a+b+name);

        //string + a is concatenation then +b is another concatination
        //All the + below are acting as concatenation
        System.out.println(name+a+b);
    }

}
