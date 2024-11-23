import java.util.Scanner;

// Class is a blueprint for creating objects
// Objects contain data (fields) and functions (methods)

// Keyword Explanation:
// 'class' defines a class
// 'public' makes it globally accessible
// ---- > so JVM can executed from outside class
// 'static' allows a method to be called without creating an object
// ---- > so jvm can save memory bcz obj create memory
// 'void' specifies that a method doesn't return any value
// when main() terminates,program terminates too
// String[] args => cmd arg stored array of string

public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("hello world");
    }
}

class InputHelloWorld {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.next(); // open scanner
        System.out.println("typed" + text);
        sc.close(); // close
    }
}

// access modifier ( class , method , data ,constructor )
// by default class access modifier is public
// public : visible everywhere (public road)
// default : visible within same pkg (room fan)
// private : visible within same class (phone)
// protected : same pkg & subclass (parent money)