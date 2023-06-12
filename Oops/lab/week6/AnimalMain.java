//Write a Java Program to implement inheritance with respect to Interfaces

// Interface Animal
interface Animal {
    void eat();
}

// Interface Pet extends Animal
interface Pet extends Animal {
    void play();
}

// Dog class implementing Pet
class Dog implements Pet {
    @Override
    public void eat() {
        System.out.println("Dog is eating");
    }

    @Override
    public void play() {
        System.out.println("Dog is playing");
    }
}

// Main class to test the implementation
public class AnimalMain {
    public static void main(String[] args) {
        // Creating an instance of Dog
        Dog dog = new Dog();

        // Calling methods from the interfaces
        dog.eat();
        dog.play();
    }
}
