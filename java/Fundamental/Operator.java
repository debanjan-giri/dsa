public class Operator {
    public static void main(String[] args) {
        // arithmatic operator
        // + , - , * , / , %
        int a = 5;
        int b = 3;
        System.out.println(a + b);

        // assignment operator
        // = , += , -= , *= , /= , %=
        int c = 10; // c = 10
        c += 5; // c = c + 5 so (c = 10 + 5)
        System.out.println(c);

        // relational operator
        // == , != , > , < , >= , <=
        System.out.println(1 != 2); // true
        System.out.println(1 > 2); // false

        // logical operator
        // && , || , !
        System.out.println(true && true); // true
        System.out.println(false || true); // true
        System.out.println(!(true)); // false

        // unray operator
        // ++ , --
        int n = 8;
        System.out.println(++n); // 9
        System.out.println(n++); // 9
        System.out.println(n); // 10

        // Bitwise Operators
        int p = 5, q = 3; // Binary: p=0101, q=0011
        System.out.println(p & q); // 1
        System.out.println(p | q); // 7
        System.out.println(p ^ q); // 6
        System.out.println(~p); // -6
        System.out.println(p << 1); // 10
        System.out.println(p >> 1); // 2

        // Type Cast Operator
        double d = 9.7;
        int i = (int) d;
        System.out.println(i); // 9

        // Null Check
        String str = null;
        System.out.println(str == null); // true
        System.out.println(str != null); // false

        // ternary operator
        // ?:
        int x = 5;
        int y = 6;
        int z = x > y ? x : y;
        System.out.println(z); // 6

        // instanceof operator
        String obj = "hello";
        System.out.println(obj instanceof String); // true

    }
}
