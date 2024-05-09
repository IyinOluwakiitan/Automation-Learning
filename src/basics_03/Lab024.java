package src.basics_03;

public class Lab024 {
    public static void main(String[] args) {

        //Question on relationship and logical operation side by side
        //int a = 12;
        //boolean b = a > 10 || a < 5;
        //System.out.println(b);

        //if we reverse the above by putting the ! sign, it will run as false because we are reversing the true above
        int a = 12;
        boolean b = !(a > 10 || a < 5);
        System.out.println(b);
    }
}
