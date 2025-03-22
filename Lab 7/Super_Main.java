// Parent class
class Animal {
    String name = "Animal";

    void sound() {
        System.out.println("Animal makes a sound.");
    }

    Animal() {
        System.out.println("Animal constructor called.");
    }
}

// Child class
class Dog extends Animal {
    String name = "Dog";

    @Override
    void sound() {
        super.sound(); // Call the sound method in the parent class
        System.out.println("Dog barks!");
    }

    Dog() {
        super(); // Call the constructor of the parent class
        System.out.println("Dog constructor called.");
    }

    void printName() {
        System.out.println("Parent name: " + super.name); // Access parent class variable
        System.out.println("Child name: " + name);
    }
}

// Test program
public class Super_Main {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.sound();
        dog.printName();
    }
}
