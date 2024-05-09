package src.basics_03;

public class Lab020 {
    public static void main(String[] args) {
        //Relational Operators >, <, >=, <=,==, =/ (!=)
//greater or equals to, less than or equals to, =/ not equals to
        int age_rebecca = 30;
        int age_omotolani = 34;
        boolean result = age_omotolani > age_rebecca;
        System.out.println(result);

        //int a = 10;
        //int b = 10;
        //boolean c = (a == b); // = checks for the references where they are present
        //System.out.println(c);
        //int checks for value, string checks for references

        //keep changing the signs for different outcomes
        int a = 10;
        int b = 10;
        boolean c = (a >= b); //this is OR condition always
      System.out.println(c);

         }
}
