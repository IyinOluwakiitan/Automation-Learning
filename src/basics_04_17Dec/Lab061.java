package src.basics_04_17Dec;

public class Lab061 {
    public static void main(String[] args) {
        byte b=20;
        switch(b){
            case 10:
                System.out.println("TEN");
            case 127:
                System.out.println("ONE TWENTY EIGHT");
        }
    }


    //nothing will be executed as there would be no matching
    //10 does not match 20 and 127 does not match the writing in words
}
