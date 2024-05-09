package src.basics_04_17Dec;

public class Lab067 {
    // This is another kind of switch called Yield. it will only work in JDK 13
    //Yield means return
    public static void main(String[] args) throws IllegalAccessException {
        char code = 'B';
        int val = switch (code) {
            case 'A' :
                yield 65;
            case 'B' :
                yield 66;
            default:
                throw new IllegalAccessException("Unexpected value: " + code);

        };
        System.out.println(val);

        //the code in line 7 references the case in line 11  //
        // this is new and wont be used in the automation

    }
}
