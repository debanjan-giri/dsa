// constructor
// is a special method and its a same name as the class name
// it automatically execute when object is created
// To initialize an object by assigning initial values to its fields.
// it does not have return type , not even void.

class Constructor {
    // constructor overloading : same name with different parameter
    Constructor() { // default constructor (no parameter)
        System.out.println("hello");
    }

    protected Constructor(int a) {
        System.out.println(a);
    }

    private Constructor(int a, int b) {
        System.out.println(a + b);
    }

    public static void main(String[] args) {
        Constructor obj = new Constructor(); // hello
        Constructor obj2 = new Constructor(5); // 5
        Constructor obj3 = new Constructor(5, 10); // 15

        new Constructor(); // execute without creating object
    }
}

// method
// its a block of code execute when we call

public class Method {
    public int data = 10;

    // method overloading : same name with different parameter
    int method(int a, int b) { // return type int and parameter type
        int c = a + b + data;
        System.out.println(c);
        return c;
    }

    void method() { // void method return nothing
        System.out.println("hello");
    }

    // static key
    // access data and method without creating object
    // static data access within static method
    static int staticData;

    static void staticMethod() {
        System.out.println(staticData);
    }

    public static void main(String[] args) {
        Method obj = new Method();
        obj.method(5, 10); // argument
        obj.method(45, 90); // argument

        staticData = 5;
        staticMethod(); // 5
    }

}
