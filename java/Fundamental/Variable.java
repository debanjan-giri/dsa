public class Variable {

    public static void main(String[] args) {
        int number; // declare variable
        number = 45; // assign value
        System.out.println(number); // read value

        // value cannot be changed once assigned.
        final int num = 67;
        System.out.println(num);
    }
}

class DataType {

    public static void main(String[] args) {

        byte number = 127; // 1 byte
        short number2 = 12314; // 2 byte
        int number3 = 326267275; // 4 byte
        long number4 = 2374658265827l; // 8 byte
        float point = 12.67f; // 4 byte
        double point2 = 22.4835654d; // 8 byte
        boolean con = true; // 1 byte
        boolean con2 = false; // 1 byte
        char word = 'a'; // 2 byte
        String letter = "hello"; // each character 2 byte

    }
}

class Casting {

    public static void main(String[] args) {

        // byte to int (implicit casting)
        byte num = 12;
        int num2 = num;

        // long to int (explicit casting)
        long num3 = 2365487326582626l;
        int num4 = (int) num3;
    }
}