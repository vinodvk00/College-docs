// Interface A
interface A {
    void meth1();
    void meth2();
}

// MyClass implementing interface A
class MyClass implements A {
    @Override
    public void meth1() {
        System.out.println("Implementation of meth1");
    }

    @Override
    public void meth2() {
        System.out.println("Implementation of meth2");
    }
}

// Main class to test the implementation
public class Main {
    public static void main(String[] args) {
        // Creating an instance of MyClass
        MyClass myClass = new MyClass();

        // Calling methods from the interface
        myClass.meth1();
        myClass.meth2();
    }
}
