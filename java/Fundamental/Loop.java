public class Loop {
    public static void main(String[] args) {

        // for
        int start = 0;
        int end = 10;
        for (int i = start; i < end; i++) {
            System.out.println(i);
        }

        // nested for
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println('i' + i + 'j' + j);
            }
        }

        // while
        int i = 0;
        while (i < 2) {
            System.out.println(i);
            i++;
        }

        // do while
        int j = 0;
        do {
            System.out.println(j);
            j++;
        } while (j < 2);

        // foreach
        int[] arr = { 1, 2, 3 };
        for (int num : arr) {
            System.out.println(num);
        }
    }
}

class LoopContinueBreakLabel {
    public static void main(String[] args) {
        // break
        for (int k = 0; k < 2; k++) {
            if (k == 1) {
                break;
            }
            System.out.println(k);
        }

        // continue
        for (int l = 0; l < 2; l++) {
            if (l == 0) {
                continue;
            }
            System.out.println(l);
        }

        // labeled
        outer: for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (i == 1 && j == 1) {
                    break outer; // Break the outer loop
                }
                System.out.println("i = " + i + ", j = " + j);
            }
        }

        // return
        for (int x = 0; x < 5; x++) {
            if (x == 3) {
                return; // Ends the method execution
            }
            System.out.println(x);
        }

        // throw
        for (int y = 0; y < 5; y++) {
            if (y == 3) {
                throw new RuntimeException(); // Throws an exception
            }
            System.out.println(y);
        }

    }
}