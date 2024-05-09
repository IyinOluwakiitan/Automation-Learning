package src.basics_03;

public class Lab027 {
    public static void main(String[] args) {
        //    Casting - Meaning Mold
        //    Implicit & Explicit Casting is used for both widening and narrowing take mote
        //    implicit narrowing / casting is not allowed by JVM only explcit. widening both implicit
        // and explicit both of them are allowed
        //    widening is when you put a small container into a bigger container (lower to higher)
        //    use a bigger container so you dont loose data. It is done automatically (JVM will give no issues)
        //
        //    integer a can equal b ie int a=b, because recall
        //   byte is a small container and can conveniently fit into integer
        //   which is a bigger container. In the example below it is implied that there is no need for
        //   casting because it fits perfectly so the casting is implied and done by JVM
        byte b = 10;
        //  int a = b; // implicit casting by JVM. Whether you write the (int) or not JVM understands
        int a = (int) b; // Explicit casting because we have explicitly written it out
   //the int is greyed out cos JVM already understands just like the + sign earlier

        //Narrowing is when you put a big container into a smaller one. (Higher to lower type)
       // JVM will specifically tell you to add e.g (byte) in bracket
        int a1 = 300;
        //byte b1 = a1; //this is invalid because integer cannot fit into byte, also an implicit casting has been done
    byte b1 = (byte)a1;//Explicit casting you tell JVM explicitly that you want to take only the byte part hence adding byte in front of it
        System.out.println(b1);
        /*
   the byte (b1) it is able to rescue is 44, teacher sef nor fit explain am
    Explicit casting means the overflow value when trying to make integer fit into byte
    the value is is able to fit into the container (byte) from integer
   */
    }
}
