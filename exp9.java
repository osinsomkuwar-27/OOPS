import java.io.*;
import java.util.*;

public class exp9 {

    static final String FILE_NAME = "students.txt";

    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\nStudent Database Management System");
            System.out.println("1. Create Database");
            System.out.println("2. Display Database");
            System.out.println("3. Clear Records");
            System.out.println("4. Modify Records");
            System.out.println("5. Search Records");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");

            int choice = sc.nextInt();
            sc.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    createRecord(sc);
                    break;
                case 2:
                    displayRecords();
                    break;
                case 3:
                    clearRecords();
                    break;
                case 4:
                    modifyRecord(sc);
                    break;
                case 5:
                    searchRecord(sc);
                    break;
                case 6:
                    System.out.println("Exiting...");
                    sc.close();
                    return;
                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }
    }

    static void createRecord(Scanner sc) throws IOException {

        FileWriter fw = new FileWriter(FILE_NAME, true);
        BufferedWriter bw = new BufferedWriter(fw);
        PrintWriter pw = new PrintWriter(bw);

        System.out.print("Enter Student ID: ");
        String id = sc.nextLine();

        System.out.print("Enter Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Roll No: ");
        String roll = sc.nextLine();

        System.out.print("Enter Class: ");
        String sClass = sc.nextLine();

        System.out.print("Enter Marks: ");
        String marks = sc.nextLine();

        System.out.print("Enter Address: ");
        String address = sc.nextLine();

        pw.println(id + "," + name + "," + roll + "," + sClass + "," + marks + "," + address);
        pw.close();

        System.out.println("Record Added Successfully!");
    }

    static void displayRecords() throws IOException {

        BufferedReader br = new BufferedReader(new FileReader(FILE_NAME));
        String line;

        while ((line = br.readLine()) != null) {
            System.out.println(line);
        }

        br.close();
    }

    static void clearRecords() throws IOException {

        PrintWriter pw = new PrintWriter(FILE_NAME);
        pw.close();

        System.out.println("All Records Cleared!");
    }

    static void modifyRecord(Scanner sc) throws IOException {

        List<String> records = new ArrayList<>();
        BufferedReader br = new BufferedReader(new FileReader(FILE_NAME));
        String line;

        while ((line = br.readLine()) != null) {
            records.add(line);
        }
        br.close();

        System.out.print("Enter Student ID to Modify: ");
        String id = sc.nextLine();

        boolean found = false;

        for (int i = 0; i < records.size(); i++) {
            String[] data = records.get(i).split(",");

            if (data[0].equals(id)) {
                System.out.print("Enter New Name: ");
                data[1] = sc.nextLine();

                System.out.print("Enter New Marks: ");
                data[4] = sc.nextLine();

                records.set(i, String.join(",", data));
                found = true;
            }
        }

        if (found) {
            PrintWriter pw = new PrintWriter(FILE_NAME);

            for (String record : records) {
                pw.println(record);
            }

            pw.close();
            System.out.println("Record Modified Successfully!");
        } else {
            System.out.println("Record Not Found!");
        }
    }

    static void searchRecord(Scanner sc) throws IOException {

        BufferedReader br = new BufferedReader(new FileReader(FILE_NAME));

        System.out.print("Enter Student ID to Search: ");
        String id = sc.nextLine();

        String line;
        boolean found = false;

        while ((line = br.readLine()) != null) {
            if (line.startsWith(id)) {
                System.out.println("Record Found: " + line);
                found = true;
            }
        }

        br.close();

        if (!found) {
            System.out.println("Record Not Found!");
        }
    }
}