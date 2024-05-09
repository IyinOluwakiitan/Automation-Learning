package src.basics_03;

public class Lab30 {
    public static void main(String[] args) {
    //Interview practice question string
        int a = 10;
    int b = 20;
    String s1 = "Omotolani";
    String s2 = "Deji-Akintola";
   System.out.println(a+b+s1+s2); //30OmotolaniDeji-Akintola
    System.out.println(s1+s2+a+b); // OmotolaniDeji-Akintola1020 in this case they become string
    System.out.println(s1+s2+(a+b)); //OmotolaniDeji-Akintola30 BODMAS, bracket will be resolved first before others
    }
}
