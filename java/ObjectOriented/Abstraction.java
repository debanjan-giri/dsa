// abstraction
// hiding the complex implementation details of an object
// and exposing only the necessary features or behaviors

// abstract class
// cannot create its own object but inheritance help to create obj
// it support abstract method and normal method

// abstract method
// doesnot have body,every inherited class must override this 

// abstract constractor
// super key used for accessing inside child constructor

abstract class Abstraction {
    abstract void work(); // abstract method

    void method() { // normal method
        System.out.println("hi");
    }

    Abstraction() { // constractor
        System.out.println("hello");
    }
}

class ChildAbstraction extends Abstraction {
    @Override
    void work() { // abstract method
        System.out.println("hello");
    }

    ChildAbstraction() {
        super(); // it access super class constructor
    }
}