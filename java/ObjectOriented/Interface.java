// interface
// interface is a way to achieve abstraction in java
// similar to a class but only contains abstract methods,
// also support body for default methods, static methods,
// contain variables which are public, static, and final.

// interface method
// define interface normal method by using default key
// define public during interface method implementation

// constractor
// interface doesnot support constractor
//similar to abstract class , inheritance help to create obj

interface Interface {
    int data = 10;

    void method();

    default void method2() {
        System.out.println(data);
    }
}

class ChildInterface implements Interface {
    @Override
    public void method() {
        System.out.println(data);
    }

    // @Override
    // public void method2() {
    // System.out.println(data);
    // }

    public static void main(String[] args) {
        ChildInterface obj = new ChildInterface();
        obj.method(); // 10
        obj.method2(); // 10
    }
}
