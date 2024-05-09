package src.basics_03;

public class Lab033 {
    public static void main(String[] args) {
    String name = "Blessed On Every Side"; //This will be stored in String Constraint Pull
    String name1 = "Blessed On Every Side"; //This will be stored in String Constraint Pull
    String name2 = new String("Blessed On Every ide");
    //with string name & string name 1 different strings are not created, only 1 string is created
   //in JVM, there is SCP and OA, Blessed on Every Side is created in SCP whether string name ot string name 1,
   //both are in SCP and only 1 string is created
   //the 2nd string which is name 2 is created in the Object Area

   //System.out.println(name = name1);
   //System.out.println(name.equals(name1));

   //System.out.println(name == name2);
   //this is false because name is in SCP while name 2 is in OA

   System.out.println(name.equals(name2));
   System.out.println(name.equalsIgnoreCase(name2));
    }
}
