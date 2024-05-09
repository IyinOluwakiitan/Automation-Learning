package src.basics_02;

public class Lab012 {
    public static void main(String[] args) {

        //operators
        int age = 10;
        // the equals sign = means Assignment operator. It stores the value
        // from right to left, which means 10 is stored into age

        //Arithmetic Operators
        //+, -, %, *
        int a = 10;
        int b = 34;
        double sum = a+b;
        System.out.printf("Sum is %f",sum);
        int sub = a-b;
        System.out.println(sub);
        int mul = a*b;
        System.out.println(mul);
        //int div = a/b; // answer is zero because 10/34 =0.29 and the integer part is 0
        //and the floating part is 0.29, so .29 will not be used cos we are using integer
        //System.out.println(div);
        double div = a/b; //using double the answer will be 0.00
        System.out.println(div);

       // if you change all the int to double, it will run and the result will be in double
//***note if you run it now it will fail, you have to choose either double - that is the last command
        //or the greyed out int command
        //if you dont use double, you will lose the numbers behind the decimal points
        //USing double and printf as example, see the command line a+b,

    }
}
