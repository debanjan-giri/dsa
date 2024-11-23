
// inheritance
// child class can access parent class = data , method ( reusability )
// help classes to be organized in a hierarchical manner
// extending the functionality of parent class, without modifying

public class Inheritance {
    int method() {
        return 10;
    }
}

class ChildInheritance extends Inheritance {
    int data = 10;

    void Print() {
        System.out.println(method() * data);
    }
}

// prevent inheritance of a class , using final
final class FinalClass {
}