abstract class Animal {
    
    // Abstract method (no body)
    abstract void sound();

    // Normal method (with body)
    void sleep() {
        System.out.println("This animal sleeps");
    }
}

// Subclass (inherits from Animal)
class Dog extends Animal {

    // Providing implementation for abstract method
    void sound() {
        System.out.println("Dog barks");
    }
}

// Main class
public class Abs {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.sound();   // calls abstract method implementation
        d.sleep();   // calls normal method
    }
}