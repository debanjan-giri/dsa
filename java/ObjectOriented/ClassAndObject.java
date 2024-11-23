// class provides the specific structure for creating object
// Each obj has a unique identity, even its state is same as another obj

// constructor :
// is a special method and that is used to create new object 

class ThisIsClass {
    int data = 10; // data

    void method() { // method
        System.out.println(data);
    }

    ThisIsClass() { // constructor
        System.out.println("hello");
    }

    public static void main(String[] args) {

        // Object 1
        ThisIsClass obj = new ThisIsClass(); // constructor execute
        obj.data = 45; // change default data to 45
        obj.method(); // 45

        System.out.println(obj); // @5ecddf8f
        System.out.println(obj.data); // 45

        // Object 2
        ThisIsClass obj2 = new ThisIsClass(); // hello
        System.out.println(obj2); // @5ecddf8f
        obj2.method(); // 10
    }
}