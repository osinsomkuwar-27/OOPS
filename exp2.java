import java.util.Scanner;

class Complex {

    private double real;
    private double imag;

    // Default constructor
    Complex() {
        this.real = 0;
        this.imag = 0;
    }

    // Parameterized constructor
    Complex(double real, double imag) {
        this.real = real;
        this.imag = imag;
    }

    // Addition of two complex numbers
    Complex add(Complex c) {
        return new Complex(this.real + c.real, this.imag + c.imag);
    }

    // Subtraction of two complex numbers
    Complex subtract(Complex c) {
        return new Complex(this.real - c.real, this.imag - c.imag);
    }

    // Multiplication of two complex numbers
    Complex multiply(Complex c) {
        double realPart = this.real * c.real - this.imag * c.imag;
        double imagPart = this.real * c.imag + this.imag * c.real;
        return new Complex(realPart, imagPart);
    }

    // Display method
    void display() {
        System.out.println(this.real + " + " + this.imag + "i");
    }
}

public class exp2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter real and imaginary part of first complex number: ");
        double r1 = sc.nextDouble();
        double i1 = sc.nextDouble();

        System.out.print("Enter real and imaginary part of second complex number: ");
        double r2 = sc.nextDouble();
        double i2 = sc.nextDouble();

        Complex c1 = new Complex(r1, i1);
        Complex c2 = new Complex(r2, i2);

        Complex sum = c1.add(c2);
        Complex difference = c1.subtract(c2);
        Complex product = c1.multiply(c2);

        System.out.println("\nResults:");

        System.out.print("Addition: ");
        sum.display();

        System.out.print("Subtraction: ");
        difference.display();

        System.out.print("Multiplication: ");
        product.display();

        sc.close();
    }
}