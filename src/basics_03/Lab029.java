package src.basics_03;

public class Lab029 {
    public static void main(String[] args) {
     //String Constant Pool - SCP / String Pool
      String s1 = "Omotolani"; //this would be found in string constant pool

        //New Operator - this is used to create new object in class.
        //it returns the address of newly created object
  String s2 = new String ("Omotolani"); // this would be found in object area
   //s1==s2? Reference are equal? - FALSE
   //s1.equals(s2)? Value are equal? - TRUE
        System.out.println(s2);
        System.out.println(new String("Omotolani"));

    }

}
