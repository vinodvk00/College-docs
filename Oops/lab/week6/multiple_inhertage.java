//Write a program to give example for multiple inheritance in Java

// Interface A
interface A {
    void methodA();
}

// Interface B
interface B {
    void methodB();
}

// Class implementing interfaces A and B
class MyClass implements A, B {
    @Override
    public void methodA() {
        System.out.println("Implementation of methodA");
    }

    @Override
    public void methodB() {
        System.out.println("Implementation of methodB");
    }
}

// Main class to test the implementation
public class Main {
    public static void main(String[] args) {
        // Creating an instance of MyClass
        MyClass myClass = new MyClass();

        // Calling methods from the interfaces
        myClass.methodA();
        myClass.methodB();
    }
}
