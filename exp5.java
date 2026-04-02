import java.util.Scanner;

// Abstract base class
abstract class Shape {

    double dimension1;
    double dimension2;

    // Method to input dimensions
    void inputDimensions() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first dimension: ");
        dimension1 = scanner.nextDouble();

        System.out.print("Enter second dimension: ");
        dimension2 = scanner.nextDouble();
    }

    // Abstract method to compute area
    abstract void compute_area();
}

// Triangle class
class Triangle extends Shape {

    @Override
    void compute_area() {
        double area = 0.5 * dimension1 * dimension2;
        System.out.println("Area of Triangle: " + area);
    }
}

// Rectangle class
class Rectangle extends Shape {

    @Override
    void compute_area() {
        double area = dimension1 * dimension2;
        System.out.println("Area of Rectangle: " + area);
    }
}

// Main class
public class exp5 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Choose shape (1 for Triangle, 2 for Rectangle): ");
        int choice = scanner.nextInt();

        Shape shape;

        if (choice == 1) {
            shape = new Triangle();
        } else {
            shape = new Rectangle();
        }

        shape.inputDimensions();
        shape.compute_area();

        scanner.close();
    }
}