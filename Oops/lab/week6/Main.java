//Write a java program to create an interface named Shape
// that contains two integers and an empty method named printArea (). 
// Provide three classes named Rectangle, Triangle and Circle
// such that each one of the classes implements the class Shape. 
// Each one of the classes contains only the method printArea () that prints the area of the given shape

// Interface Shape
interface Shape {
    void printArea();
}

// Rectangle class implementing Shape
class Rectangle implements Shape {
    private int length;
    private int width;

    public Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public void printArea() {
        int area = length * width;
        System.out.println("Rectangle Area: " + area);
    }
}

// Triangle class implementing Shape
class Triangle implements Shape {
    private int base;
    private int height;

    public Triangle(int base, int height) {
        this.base = base;
        this.height = height;
    }

    @Override
    public void printArea() {
        double area = 0.5 * base * height;
        System.out.println("Triangle Area: " + area);
    }
}

// Circle class implementing Shape
class Circle implements Shape {
    private int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    @Override
    public void printArea() {
        double area = Math.PI * radius * radius;
        System.out.println("Circle Area: " + area);
    }
}

// Main class to test the implementation
public class Main {
    public static void main(String[] args) {
        // Creating instances of Rectangle, Triangle, and Circle
        Rectangle rectangle = new Rectangle(5, 7);
        Triangle triangle = new Triangle(4, 6);
        Circle circle = new Circle(3);

        // Calling printArea method for each shape
        rectangle.printArea();
        triangle.printArea();
        circle.printArea();
    }
}

