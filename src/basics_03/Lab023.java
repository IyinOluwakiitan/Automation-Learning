package src.basics_03;

public class Lab023 {
    public static void main(String[] args) {
        /*
       Logical Operators cont'd
       //Logical OR ||
       True || True -> True
       True || False -> True
       False || True -> True
       False || False -> False
       */
        System.out.println(true || true);
        System.out.println(true || false);
        System.out.println(false || true);
        System.out.println(false || false);

        //Logical AND && If anyone has false all will take the property of false
        //True || True -> True
        //True || False -> False
        //False || True -> False
        //False || False -> False

        System.out.println(true && true);
        System.out.println(true && false);
        System.out.println(false && true);
        System.out.println(false && false);
    }
}
