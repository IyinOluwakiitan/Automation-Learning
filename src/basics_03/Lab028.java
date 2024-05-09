package src.basics_03;

public class Lab028 {
    public static void main(String[] args) {
        //Casting cont'd

      //  int course = 100;
      //  float GST = 0.1845f;
      //  float total = course + GST*course;
      //  System.out.println(total);
        /*
        if you use float in line 9 it is like using a bigger container,
        the value will be more that is 118.45. However, if you use integer
        which is a smaller container to float a portion of the value will be lost.
        and you also have to specify that you are using integer. Example below:
         */

        //int course = 100;
        //float GST = 0.1845f;
        //int total = course + (int)GST*course;
        //System.out.println(total);

        //when you run with int the value becomes 100 thereby loosing value (18.45)
        //always use a bigger container else data will be lost
        //from smallest to biggest
        //byte - short - char - int - long - float - double
        // you can use double instead of float

        //Reverse Example
        float course = 100;
        float GST = 18.45f;
        double total = course+ GST;
        System.out.println(total);

         //overall idea of impicit & explicit is to use a bigger container
        //in order not to loose data / value
    }
}
