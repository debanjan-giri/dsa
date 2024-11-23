public class Condition {
    public static void main(String[] args) {

        int number = 34;

        // ternary
        String result = (number == 34) ? "true" : "false";
        System.out.println(result);

        // if
        if (number > 30 && number < 40) {
            System.out.println("true");
        }

        // if else
        if (number > 34) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }

        // if else if
        if (number != 67) {
            System.out.println("true");
        } else if (number == 34) {
            System.out.println("true");
        }

        // nested
        if (number > 30) {
            if (number == 34) {
                System.out.println("Number is 34");
            } else {
                System.out.println("Number is greater than 30 but not 34");
            }
        }

        // switch case
        switch (number) {
            case 34:
                System.out.println("true");
                break;
            case 144:
                System.out.println("false");
                break;
            case 35:
                System.out.println("false");
                break;
            default:
                System.out.println("default");
                break;
        }

    }
}
