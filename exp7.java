import java.util.Scanner;

public class exp7 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[2];

        try {
            System.out.print("Enter first number (Num1): ");
            numbers[0] = Integer.parseInt(scanner.nextLine());

            System.out.print("Enter second number (Num2): ");
            numbers[1] = Integer.parseInt(scanner.nextLine());

            int result = numbers[0] / numbers[1];
            System.out.println("Result of division: " + result);

        } catch (ArithmeticException e) {
            System.out.println("Error: Division by zero is not allowed.");

        } catch (NumberFormatException e) {
            System.out.println("Error: Invalid input. Please enter valid integers.");

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Array index out of bounds.");

        } finally {
            scanner.close();
        }
    }
}