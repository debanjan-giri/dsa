// polymorphism: it represent various type
// compile time : Method overloading : same name diff parameter
// runtime : Method overriding : 

public class Polymorphism {
    int method(int a, int b) {
        return 0;
    }

    int method(boolean a, int b) {
        return b;
    }
}

class ChildPoly extends Polymorphism {

    @Override
    int method(int a, int b) {
        return 1;
    }

    // super key
    void all() {
        System.out.println(method(0, 0));
        System.out.println(super.method(0, 0));
    }

    public static void main(String[] args) {
        Polymorphism obj = new ChildPoly();// when to use super key
        System.out.println(obj.method(0, 0));
    }
}
