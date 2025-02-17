package Annotations.BasicExercises.Override;

// Parent class
class Animal {
    // Method to be overridden
    public void makeSound() {
        System.out.println("The animal makes a sound.");
    }
}

// Child class
class Dog extends Animal {
    // Override the makeSound() method
    @Override
    public void makeSound() {
        System.out.println("The dog barks.");
    }
}

// Main class
public class OverrideExample {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.makeSound();
    }
}
