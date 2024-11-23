// Encapsulation

// Data Hiding: 
// Encapsulation hide internal state of an obj from external
// access, so its preventing direct modification by outsider

// Abstraction: 
// Encapsulation hide implementation details of a class and 
// exposing only essential features through public interface.

// Modularity: 
// encapsulating related data and behavior into single unit

public class Encapsulation {
    private int data = 10; // private data

    public int getData() { // getter
        return data;
    }

    public void setData(int data) { // setter
        this.data = data;
    }
}
