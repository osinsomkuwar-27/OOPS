import java.util.Scanner;

class Student {

    // Abstract data (encapsulation)
    private int rollNo;
    private String name;
    private int age;
    private String department;
    private double marks;

    // Method to accept data
    public void acceptData(Scanner sc) {
        System.out.print("Enter Roll Number: ");
        rollNo = sc.nextInt();
        sc.nextLine(); // consume newline

        System.out.print("Enter Name: ");
        name = sc.nextLine();

        System.out.print("Enter Age: ");
        age = sc.nextInt();
        sc.nextLine(); // consume newline

        System.out.print("Enter Department: ");
        department = sc.nextLine();

        System.out.print("Enter Marks: ");
        marks = sc.nextDouble();
    }

    // Method to display data
    public void displayData() {
        System.out.println("Roll No : " + rollNo);
        System.out.println("Name : " + name);
        System.out.println("Age : " + age);
        System.out.println("Department : " + department);
        System.out.println("Marks : " + marks);
        System.out.println("----------------------------");
    }
}

public class exp1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Array of 5 Student objects
        Student[] students = new Student[5];

        // Accept data
        for (int i = 0; i < 5; i++) {
            students[i] = new Student();
            System.out.println("\nEnter details of Student " + (i + 1));
            students[i].acceptData(sc);
        }

        // Display data
        System.out.println("\n===== Student Details =====");
        for (int i = 0; i < 5; i++) {
            System.out.println("Student " + (i + 1));
            students[i].displayData();
        }

        sc.close();
    }
}